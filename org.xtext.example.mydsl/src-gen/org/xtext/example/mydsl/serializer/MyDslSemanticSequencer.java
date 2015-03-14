package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Activity;
import org.xtext.example.mydsl.myDsl.Alternative;
import org.xtext.example.mydsl.myDsl.BooleanQuery;
import org.xtext.example.mydsl.myDsl.BraceQuery;
import org.xtext.example.mydsl.myDsl.BusinessProcess;
import org.xtext.example.mydsl.myDsl.ChannelDefintion;
import org.xtext.example.mydsl.myDsl.Chart;
import org.xtext.example.mydsl.myDsl.Communication;
import org.xtext.example.mydsl.myDsl.Data;
import org.xtext.example.mydsl.myDsl.DataQuery;
import org.xtext.example.mydsl.myDsl.Datatype;
import org.xtext.example.mydsl.myDsl.Domainmodel;
import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.IFQuery;
import org.xtext.example.mydsl.myDsl.Interview;
import org.xtext.example.mydsl.myDsl.Loop;
import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PlayerQuery;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.Roletype;
import org.xtext.example.mydsl.myDsl.StarTimeAlternative;
import org.xtext.example.mydsl.myDsl.StartAlternative;
import org.xtext.example.mydsl.myDsl.State;
import org.xtext.example.mydsl.myDsl.Systemtype;
import org.xtext.example.mydsl.myDsl.Systemwork;
import org.xtext.example.mydsl.myDsl.Task;
import org.xtext.example.mydsl.myDsl.TimeAlternative;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getProcessChartElementsRule() ||
				   context == grammarAccess.getProcessElementsRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.ALTERNATIVE:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getProcessChartElementsRule() ||
				   context == grammarAccess.getProcessElementsRule()) {
					sequence_Alternative(context, (Alternative) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BOOLEAN:
				if(context == grammarAccess.getBooleanRule() ||
				   context == grammarAccess.getObjectRule()) {
					sequence_Boolean(context, (org.xtext.example.mydsl.myDsl.Boolean) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BOOLEAN_QUERY:
				if(context == grammarAccess.getBooleanQueryRule() ||
				   context == grammarAccess.getQueryRule() ||
				   context == grammarAccess.getQueryTypesRule()) {
					sequence_BooleanQuery(context, (BooleanQuery) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BRACE_QUERY:
				if(context == grammarAccess.getBraceQueryRule() ||
				   context == grammarAccess.getQueryTypesRule()) {
					sequence_BraceQuery(context, (BraceQuery) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BUSINESS_PROCESS:
				if(context == grammarAccess.getBusinessProcessRule()) {
					sequence_BusinessProcess(context, (BusinessProcess) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.CHANNEL_DEFINTION:
				if(context == grammarAccess.getChannelDefintionRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_ChannelDefintion(context, (ChannelDefintion) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.CHART:
				if(context == grammarAccess.getChartRule() ||
				   context == grammarAccess.getProcessStartElementsRule()) {
					sequence_Chart(context, (Chart) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.COMMUNICATION:
				if(context == grammarAccess.getCommunicationRule() ||
				   context == grammarAccess.getProcessChartElementsRule() ||
				   context == grammarAccess.getProcessElementsRule()) {
					sequence_Communication(context, (Communication) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DATA:
				if(context == grammarAccess.getDataRule() ||
				   context == grammarAccess.getObjectRule()) {
					sequence_Data(context, (Data) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DATA_QUERY:
				if(context == grammarAccess.getDataQueryRule() ||
				   context == grammarAccess.getQueryRule() ||
				   context == grammarAccess.getQueryTypesRule()) {
					sequence_DataQuery(context, (DataQuery) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DATATYPE:
				if(context == grammarAccess.getDatatypeRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_Datatype(context, (Datatype) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DOMAINMODEL:
				if(context == grammarAccess.getDomainmodelRule()) {
					sequence_Domainmodel(context, (Domainmodel) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.IF_QUERY:
				if(context == grammarAccess.getIFQueryRule() ||
				   context == grammarAccess.getProcessElementsRule()) {
					sequence_IFQuery(context, (IFQuery) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.INTERVIEW:
				if(context == grammarAccess.getInterviewRule()) {
					sequence_Interview(context, (Interview) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LOOP:
				if(context == grammarAccess.getLoopRule() ||
				   context == grammarAccess.getProcessElementsRule()) {
					sequence_Loop(context, (Loop) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.MESSAGE:
				if(context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PLAYER_QUERY:
				if(context == grammarAccess.getPlayerQueryRule() ||
				   context == grammarAccess.getQueryRule() ||
				   context == grammarAccess.getQueryTypesRule()) {
					sequence_PlayerQuery(context, (PlayerQuery) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.ROLE:
				if(context == grammarAccess.getObjectRule() ||
				   context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.ROLETYPE:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRoletypeRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_Roletype(context, (Roletype) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.STAR_TIME_ALTERNATIVE:
				if(context == grammarAccess.getProcessStartElementsRule() ||
				   context == grammarAccess.getStartTimeAlternativeRule()) {
					sequence_StartTimeAlternative(context, (StarTimeAlternative) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.START_ALTERNATIVE:
				if(context == grammarAccess.getProcessStartElementsRule() ||
				   context == grammarAccess.getStartAlternativeRule()) {
					sequence_StartAlternative(context, (StartAlternative) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SYSTEM:
				if(context == grammarAccess.getObjectRule() ||
				   context == grammarAccess.getSystemRule()) {
					sequence_System(context, (org.xtext.example.mydsl.myDsl.System) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SYSTEMTYPE:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getSystemtypeRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_Systemtype(context, (Systemtype) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SYSTEMWORK:
				if(context == grammarAccess.getProcessChartElementsRule() ||
				   context == grammarAccess.getProcessElementsRule() ||
				   context == grammarAccess.getSystemworkRule()) {
					sequence_Systemwork(context, (Systemwork) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.TASK:
				if(context == grammarAccess.getTaskRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.TIME_ALTERNATIVE:
				if(context == grammarAccess.getProcessChartElementsRule() ||
				   context == grammarAccess.getProcessElementsRule() ||
				   context == grammarAccess.getTimeAlternativeRule()) {
					sequence_TimeAlternative(context, (TimeAlternative) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (importance='im' | importance='unim')? 
	 *         player=[Role|ID] 
	 *         (execution='can' | execution='must') 
	 *         task=[Task|ID] 
	 *         (parameter+=[Object|ID] parameter+=[Object|ID]*)?
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alternative+=ProcessElements* alternative+=ProcessElements* alternative+=ProcessElements*)
	 */
	protected void sequence_Alternative(EObject context, Alternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (booleanValue=[Boolean|ID] (boolean='true' | boolean='false')?)
	 */
	protected void sequence_BooleanQuery(EObject context, BooleanQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[TypeDefinition|ID]? name=ID)
	 */
	protected void sequence_Boolean(EObject context, org.xtext.example.mydsl.myDsl.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (queries+=QueryTypes queries+=QueryTypes*)
	 */
	protected void sequence_BraceQuery(EObject context, BraceQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING element=ProcessStartElements?)
	 */
	protected void sequence_BusinessProcess(EObject context, BusinessProcess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package='ChannelPackage' (type='asynchronous' | type='synchronous')? name=ID)
	 */
	protected void sequence_ChannelDefintion(EObject context, ChannelDefintion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startElements+=ProcessChartElements* followedElements+=ProcessElements*)
	 */
	protected void sequence_Chart(EObject context, Chart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (importance='im' | importance='unim')? 
	 *         sender=[Object|ID] 
	 *         (execution='can' | execution='must') 
	 *         receiver=[Role|ID] 
	 *         message=[Message|ID] 
	 *         (parameter+=[Object|ID] parameter+=[Object|ID]*)? 
	 *         channel=[ChannelDefintion|ID]?
	 *     )
	 */
	protected void sequence_Communication(EObject context, Communication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exclamation?='!'? objectOne=[Object|ID] (condition='!=' | condition='==') objectTwo=[Object|ID])
	 */
	protected void sequence_DataQuery(EObject context, DataQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[TypeDefinition|ID] name=ID)
	 */
	protected void sequence_Data(EObject context, Data semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OBJECT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OBJECT__TYPE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OBJECT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataAccess().getTypeTypeDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (package='DataPackage' name=ID)
	 */
	protected void sequence_Datatype(EObject context, Datatype semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TYPE_DEFINITION__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TYPE_DEFINITION__PACKAGE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TYPE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TYPE_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDatatypeAccess().getPackageDataPackageKeyword_1_0(), semanticObject.getPackage());
		feeder.accept(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element+=Interview | element+=TypeDefinition)?
	 */
	protected void sequence_Domainmodel(EObject context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (parameter+=[Parameter|ID] parameter+=[Parameter|ID]*)? 
	 *         (returnValue?='returns' returnArgument=[TypeDefinition|ID]? returnBool='boolean'?)?
	 *     )
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (queries+=QueryTypes queries+=QueryTypes* elements+=ProcessElements* elements+=ProcessElements*)
	 */
	protected void sequence_IFQuery(EObject context, IFQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package='InterviewPackage' name=STRING mainPlayer=Role objects+=Object* process+=BusinessProcess*)
	 */
	protected void sequence_Interview(EObject context, Interview semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((uncounter='*' | counter=INT) elements+=ProcessElements*)
	 */
	protected void sequence_Loop(EObject context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameter+=[Parameter|ID] parameter+=[Parameter|ID]*)?)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (player=[Role|ID] status=[State|ID] (boolean='true' | boolean='false')?)
	 */
	protected void sequence_PlayerQuery(EObject context, PlayerQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((rolekind='insideRole' | rolekind='outsideRole') type=[TypeDefinition|ID] name=ID)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package='RolePackage' name=ID state+=State* tasks+=Task* messages+=Message*)
	 */
	protected void sequence_Roletype(EObject context, Roletype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alternative+=ProcessStartElements? alternative+=ProcessStartElements? alternative+=ProcessStartElements*)
	 */
	protected void sequence_StartAlternative(EObject context, StartAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mostlyAlternative+=ProcessStartElements? sometimesAlternative+=ProcessStartElements? sometimesAlternative+=ProcessStartElements*)
	 */
	protected void sequence_StartTimeAlternative(EObject context, StarTimeAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[TypeDefinition|ID] name=ID)
	 */
	protected void sequence_System(EObject context, org.xtext.example.mydsl.myDsl.System semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OBJECT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OBJECT__TYPE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OBJECT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSystemAccess().getTypeTypeDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (package='SystemPackage' name=ID functions+=Function*)
	 */
	protected void sequence_Systemtype(EObject context, Systemtype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         returnObject=[Object|ID]? 
	 *         (importance='im' | importance='unim')? 
	 *         player=[Role|ID] 
	 *         (execution='can' | execution='must') 
	 *         system=[System|ID] 
	 *         function=[Function|ID] 
	 *         (parameter+=[Object|ID] parameter+=[Object|ID]*)?
	 *     )
	 */
	protected void sequence_Systemwork(EObject context, Systemwork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameter+=[Parameter|ID] parameter+=[Parameter|ID]*)?)
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mostlyAlternative+=ProcessElements* sometimeAlternative+=ProcessElements* sometimeAlternative+=ProcessElements*)
	 */
	protected void sequence_TimeAlternative(EObject context, TimeAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
