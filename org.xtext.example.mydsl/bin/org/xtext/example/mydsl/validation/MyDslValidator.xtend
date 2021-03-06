/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.Activity
import org.xtext.example.mydsl.myDsl.Interview
import org.xtext.example.mydsl.myDsl.DataQuery
import org.xtext.example.mydsl.myDsl.Systemwork
import org.xtext.example.mydsl.myDsl.Communication
import org.xtext.example.mydsl.myDsl.BusinessProcess
import org.xtext.example.mydsl.myDsl.TypeDefinition
import org.xtext.example.mydsl.myDsl.Function
import org.xtext.example.mydsl.myDsl.Roletype
import org.xtext.example.mydsl.myDsl.Systemtype

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {

  public static val INVALID_PARAMETER = 'invalidParameter'
  public static val INVALID_OTHER_ROLE = 'invalidOtherRole'
  public static val INVALID_MAIN_ROLE = 'invalidMainRole'
  public static val INVALID_NAME = 'invalidName'
  public static val INVALID_FUNCTION = 'invalidFunction'
  public static val INVALID_PACKAGE = 'invalidPackage'
  public static val INVALID_RETURN_ARGUMENT = 'invalidReturnArguement'
  public static val INVALID_OBJECT = 'invalidPlayer'
  public static val INVALID_IMPORTANCE = 'invalidImportance'
  public static val MISSING ='missing'
  
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

/*
 * Hier wird der getippte Code der Sprache überprüft. Der Methodenname gibt immer an an welcher Stelle in der Grammatik der Code
   überprüft wird. Die Error-Meldung gibt an, was übeprüft wurde.
 * 
 */



	 @Check
	def checkCommunicationParameter(Communication communication){
		val parameterMList = communication.parameter
		val parameterList = communication.message.parameter
		if(parameterMList.length > parameterList.length){
			error('Too many parameters!', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER) 
			return
		}
		if(parameterMList.length < parameterList.length){
			error('Missing parameter!', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER) 
			return
		}	
		for(var i = 0; i < parameterMList.length; i++){
			var parameter = parameterList.get(i) as TypeDefinition
			if(parameterMList.get(i).type == null){
				error('Parameter can not be of type "Boolean"!', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER)
			}
			
			if(!checkName(parameter.name , parameterMList.get(i).type.name)){
				error('Wrong parameter!', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER) 
			}	
		}
	}
	
	def checkName(String name, String Mname){
		if(name.toUpperCase.equals(Mname.toUpperCase))
			return true
		else
			return false
	}
	


	@Check
	def checkCommunicationReceiver(Communication communication){
		if(communication.sender.name.equals(communication.receiver.name))
			error('Sender and receiver can not be the same!', MyDslPackage.Literals.COMMUNICATION__RECEIVER,INVALID_OTHER_ROLE) 	
	}
	
	@Check 
	def checkCommunicationImportance(Communication communication){
		if(communication.importance == null && communication.execution.equals('can')){
			error('Importance is missing!!', MyDslPackage.Literals.COMMUNICATION__IMPORTANCE,INVALID_IMPORTANCE)
		}else{
			if(communication.importance.equals('unim') && communication.execution.equals('must')){
				error('Wrong Importance!', MyDslPackage.Literals.COMMUNICATION__IMPORTANCE,INVALID_IMPORTANCE)
			}
		}
	}
	
	@Check 
	def checkActivityImportance(Activity activity){
		if(activity.importance == null && activity.execution.equals('can')){
			error('Importance is missing!', MyDslPackage.Literals.ACTIVITY__IMPORTANCE,INVALID_IMPORTANCE)
		}else{
			if(activity.importance.equals('unim') && activity.execution.equals('must')){
				error('Wrong Importance!', MyDslPackage.Literals.ACTIVITY__IMPORTANCE,INVALID_IMPORTANCE)
			}
		}
	}
	
	@Check 
	def checkSystemworkImportance(Systemwork systemwork){
		if(systemwork.importance == null && systemwork.execution.equals('can')){
			error('Importance is missing!!', MyDslPackage.Literals.SYSTEMWORK__IMPORTANCE,INVALID_IMPORTANCE)
		}else{
			if(systemwork.importance.equals('unim') && systemwork.execution.equals('must')){
				error('Wrong Importance!', MyDslPackage.Literals.SYSTEMWORK__IMPORTANCE,INVALID_IMPORTANCE)
			}
		}
	}
	
	
	
	 @Check
	def checkActivityParameter(Activity activity){
		val parameterAList = activity.parameter
		val parameterList = activity.task.parameter
		if(parameterAList.length > parameterList.length){
			error('too many parameters', MyDslPackage.Literals.ACTIVITY__PARAMETER,INVALID_PARAMETER) 
			return
		}
		if(parameterAList.length < parameterList.length){
			error('missing parameter', MyDslPackage.Literals.ACTIVITY__PARAMETER,INVALID_PARAMETER) 
			return
		}	
		for(var i = 0; i < parameterAList.length; i++){
			var parameter = parameterList.get(i) as TypeDefinition
			if(parameterAList.get(i).type == null){
				error('Parameter can not be of type "Boolean"!', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER)
			}
			
			if(!checkName(parameter.name , parameterAList.get(i).type.name)){
				error('wrong parameter', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER) 
			}	
		}
	}
	
	@Check
	def checkInterviewMainPlayer(Interview interview){
		if(!interview.mainrole.eClass.name.equals('Role'))
			error('Mainrole must be of type "Role"!', MyDslPackage.Literals.INTERVIEW__MAINROLE,INVALID_PARAMETER) 
	}
	
	
	
	 @Check
	def checkSystemworkParameter(Systemwork systemActivity){
		val parameterSList = systemActivity.parameter
		val parameterList = systemActivity.function.parameter
		if(parameterSList.length > parameterList.length){
			error('too many parameters', MyDslPackage.Literals.SYSTEMWORK__PARAMETER,INVALID_PARAMETER) 
			return
		}
		if(parameterSList.length < parameterList.length){
			error('missing parameter', MyDslPackage.Literals.SYSTEMWORK__PARAMETER,INVALID_PARAMETER) 
			return
		}	
		for(var i = 0; i < parameterSList.length; i++){
			var parameter = parameterList.get(i) as TypeDefinition
			if(parameterSList.get(i).type == null){
				error('Parameter can not be of type "Boolean"!', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER)
			}
			
			if(!checkName(parameter.name , parameterSList.get(i).type.name)){
				error('wrong parameter', MyDslPackage.Literals.COMMUNICATION__PARAMETER,INVALID_PARAMETER) 
			}	
		}
	}
	
	@Check
	def checkInterviewName(Interview interview){
		if(interview.name.equals(''))
			error('Interview name can not be empty', MyDslPackage.Literals.INTERVIEW__NAME,INVALID_NAME) 
	}
	
	@Check
	def checkProcessName(BusinessProcess process){
		if(process.name.equals(''))
			error('Process name can not be empty', MyDslPackage.Literals.BUSINESS_PROCESS__NAME,INVALID_NAME) 
	}
	
	@Check
	def checkSystemworkFunction(Systemwork systemActivity){
		if(systemActivity.returnObject != null  && systemActivity.function.returnValue == false)
			error('need function with return argument', MyDslPackage.Literals.SYSTEMWORK__FUNCTION,INVALID_FUNCTION) 
	}
	
	 @Check
	def checkSystemworkReturnPlayer(Systemwork systemwork){
		if(systemwork.returnObject != null){
			
			if(systemwork.returnObject.type == null && systemwork.function.returnBool == null){
				error('Need not Boolean!', MyDslPackage.Literals.SYSTEMWORK__RETURN_OBJECT,INVALID_RETURN_ARGUMENT)
				return
			}
			
			if(systemwork.returnObject.type != null && systemwork.function.returnBool != null){
						error('Need Boolean!', MyDslPackage.Literals.SYSTEMWORK__RETURN_OBJECT,INVALID_RETURN_ARGUMENT)
						return
				}
		
			var argument = systemwork.function.returnArgument as TypeDefinition 
				if(!checkName(argument.name, systemwork.returnObject.type.name)){
					error('Wrong return Argument', MyDslPackage.Literals.SYSTEMWORK__RETURN_OBJECT,INVALID_RETURN_ARGUMENT)
				}
			
	}
	}
	
	@Check 
	def checkRoleDefinitionName(Roletype roleDefinition){
		if(!Character.isUpperCase(roleDefinition.name.charAt(0))){
			error('Name should start with a capital ', MyDslPackage.Literals.TYPE_DEFINITION__NAME,INVALID_NAME)
		}
	}
	
	@Check 
	def checkSystemDefinitionName(Systemtype system){
		if(!Character.isUpperCase(system.name.charAt(0))){
			error('Name must start with a capital!', MyDslPackage.Literals.TYPE_DEFINITION__NAME,INVALID_NAME)
		}
	}
	
	@Check
	def checkCommunicationSender(Communication communication){
		if(!(communication.sender.eClass.name.equals('System') || communication.sender.eClass.name.equals('Role')) ){
			error('Sender must be of type "System" or "Role"!', MyDslPackage.Literals.COMMUNICATION__SENDER,INVALID_OBJECT)
		}
	}
	
	@Check 
	def checkDataQueryPlayerTwo(DataQuery query){
		if(query.objectTwo.type == null){
			error('Object can not be a Boolean',MyDslPackage.Literals.DATA_QUERY__OBJECT_TWO,INVALID_OBJECT)
			return
		}
		if(!query.objectOne.type.name.equals(query.objectTwo.type.name)){
			error('Objects must have the same type!', MyDslPackage.Literals.DATA_QUERY__OBJECT_TWO,INVALID_OBJECT)
		}
	}
	
	@Check
	def checkDataQueryPlayerOne(DataQuery query){
		if(query.objectOne.type == null){
			error('Object can not be a Boolean',MyDslPackage.Literals.DATA_QUERY__OBJECT_ONE,INVALID_OBJECT)
		}
	}
	
	@Check
	def checkDataQueryExclamation(DataQuery query){
		if(query.exclamation){
			warning('!=', MyDslPackage.Literals.DATA_QUERY__EXCLAMATION,INVALID_NAME)
		}
	}
	
	@Check
	def checkFunctionReturnValue(Function function){
		if(function.returnValue){
			if(function.returnArgument == null && function.returnBool == null){
				error('Function need a return argument!', MyDslPackage.Literals.FUNCTION__RETURN_VALUE,INVALID_NAME)
			}
		}
	}
	
	@Check
	def checkSystemType(org.xtext.example.mydsl.myDsl.System system){
		var systemtype = system as org.xtext.example.mydsl.myDsl.Object
 		if(!systemtype.type.eClass.name.equals('Systemtype') )
 				error('Object must be any "System"', MyDslPackage.Literals.OBJECT__TYPE,INVALID_NAME)
	}
	
	@Check
	def checkRoleType(org.xtext.example.mydsl.myDsl.Role role){
		var roletype = role as org.xtext.example.mydsl.myDsl.Object
 		if(!roletype.type.eClass.name.equals('Roletype') )
 				error('Object must be any "Role"', MyDslPackage.Literals.OBJECT__TYPE,INVALID_NAME)
	}
	
	@Check
	def checkDataType(org.xtext.example.mydsl.myDsl.Data data){
		var datatype = data as org.xtext.example.mydsl.myDsl.Object
 		if(!datatype.type.eClass.name.equals('Datatype') )
 				error('Object must be any "Data"', MyDslPackage.Literals.OBJECT__TYPE,INVALID_NAME)
	}
	
	@Check
	def checkBooleanType(org.xtext.example.mydsl.myDsl.Boolean bool){
		if(bool.type != null){
			error('Object is a Boolean', MyDslPackage.Literals.OBJECT__TYPE,INVALID_NAME)
		}
	}
	
	
	@Check
	def checkCommunicationChannel(Communication communication){
		if(communication.channel == null)
			warning('Missing Channel!', MyDslPackage.Literals.COMMUNICATION__CHANNEL,MISSING)
	}
	
	
}
