/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.ProcessChartElements;
import org.xtext.example.mydsl.myDsl.ProcessElements;
import org.xtext.example.mydsl.myDsl.ProcessStartElements;
import org.xtext.example.mydsl.myDsl.Query;
import org.xtext.example.mydsl.myDsl.QueryTypes;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.RoleQuery;
import org.xtext.example.mydsl.myDsl.Roletype;
import org.xtext.example.mydsl.myDsl.StarTimeAlternative;
import org.xtext.example.mydsl.myDsl.StartAlternative;
import org.xtext.example.mydsl.myDsl.StartTimeAlternative;
import org.xtext.example.mydsl.myDsl.State;
import org.xtext.example.mydsl.myDsl.Systemtype;
import org.xtext.example.mydsl.myDsl.Systemwork;
import org.xtext.example.mydsl.myDsl.Task;
import org.xtext.example.mydsl.myDsl.TimeAlternative;
import org.xtext.example.mydsl.myDsl.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = caseParameter(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = caseTypeDefinition(datatype);
        if (result == null) result = caseParameter(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SYSTEMTYPE:
      {
        Systemtype systemtype = (Systemtype)theEObject;
        T result = caseSystemtype(systemtype);
        if (result == null) result = caseTypeDefinition(systemtype);
        if (result == null) result = caseParameter(systemtype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CHANNEL_DEFINTION:
      {
        ChannelDefintion channelDefintion = (ChannelDefintion)theEObject;
        T result = caseChannelDefintion(channelDefintion);
        if (result == null) result = caseTypeDefinition(channelDefintion);
        if (result == null) result = caseParameter(channelDefintion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLETYPE:
      {
        Roletype roletype = (Roletype)theEObject;
        T result = caseRoletype(roletype);
        if (result == null) result = caseTypeDefinition(roletype);
        if (result == null) result = caseParameter(roletype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INTERVIEW:
      {
        Interview interview = (Interview)theEObject;
        T result = caseInterview(interview);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OBJECT:
      {
        org.xtext.example.mydsl.myDsl.Object object = (org.xtext.example.mydsl.myDsl.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BOOLEAN:
      {
        org.xtext.example.mydsl.myDsl.Boolean boolean_ = (org.xtext.example.mydsl.myDsl.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = caseObject(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SYSTEM:
      {
        org.xtext.example.mydsl.myDsl.System system = (org.xtext.example.mydsl.myDsl.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = caseObject(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DATA:
      {
        Data data = (Data)theEObject;
        T result = caseData(data);
        if (result == null) result = caseObject(data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = caseObject(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BUSINESS_PROCESS:
      {
        BusinessProcess businessProcess = (BusinessProcess)theEObject;
        T result = caseBusinessProcess(businessProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROCESS_START_ELEMENTS:
      {
        ProcessStartElements processStartElements = (ProcessStartElements)theEObject;
        T result = caseProcessStartElements(processStartElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CHART:
      {
        Chart chart = (Chart)theEObject;
        T result = caseChart(chart);
        if (result == null) result = caseProcessStartElements(chart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.START_TIME_ALTERNATIVE:
      {
        StartTimeAlternative startTimeAlternative = (StartTimeAlternative)theEObject;
        T result = caseStartTimeAlternative(startTimeAlternative);
        if (result == null) result = caseProcessStartElements(startTimeAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TIME_ALTERNATIVE:
      {
        TimeAlternative timeAlternative = (TimeAlternative)theEObject;
        T result = caseTimeAlternative(timeAlternative);
        if (result == null) result = caseProcessElements(timeAlternative);
        if (result == null) result = caseProcessChartElements(timeAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.START_ALTERNATIVE:
      {
        StartAlternative startAlternative = (StartAlternative)theEObject;
        T result = caseStartAlternative(startAlternative);
        if (result == null) result = caseProcessStartElements(startAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ALTERNATIVE:
      {
        Alternative alternative = (Alternative)theEObject;
        T result = caseAlternative(alternative);
        if (result == null) result = caseProcessElements(alternative);
        if (result == null) result = caseProcessChartElements(alternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROCESS_ELEMENTS:
      {
        ProcessElements processElements = (ProcessElements)theEObject;
        T result = caseProcessElements(processElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROCESS_CHART_ELEMENTS:
      {
        ProcessChartElements processChartElements = (ProcessChartElements)theEObject;
        T result = caseProcessChartElements(processChartElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOOP:
      {
        Loop loop = (Loop)theEObject;
        T result = caseLoop(loop);
        if (result == null) result = caseProcessElements(loop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IF_QUERY:
      {
        IFQuery ifQuery = (IFQuery)theEObject;
        T result = caseIFQuery(ifQuery);
        if (result == null) result = caseProcessElements(ifQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.QUERY_TYPES:
      {
        QueryTypes queryTypes = (QueryTypes)theEObject;
        T result = caseQueryTypes(queryTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = caseQueryTypes(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BOOLEAN_QUERY:
      {
        BooleanQuery booleanQuery = (BooleanQuery)theEObject;
        T result = caseBooleanQuery(booleanQuery);
        if (result == null) result = caseQuery(booleanQuery);
        if (result == null) result = caseQueryTypes(booleanQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DATA_QUERY:
      {
        DataQuery dataQuery = (DataQuery)theEObject;
        T result = caseDataQuery(dataQuery);
        if (result == null) result = caseQuery(dataQuery);
        if (result == null) result = caseQueryTypes(dataQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BRACE_QUERY:
      {
        BraceQuery braceQuery = (BraceQuery)theEObject;
        T result = caseBraceQuery(braceQuery);
        if (result == null) result = caseQueryTypes(braceQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ROLE_QUERY:
      {
        RoleQuery roleQuery = (RoleQuery)theEObject;
        T result = caseRoleQuery(roleQuery);
        if (result == null) result = caseQuery(roleQuery);
        if (result == null) result = caseQueryTypes(roleQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMMUNICATION:
      {
        Communication communication = (Communication)theEObject;
        T result = caseCommunication(communication);
        if (result == null) result = caseProcessElements(communication);
        if (result == null) result = caseProcessChartElements(communication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = caseProcessElements(activity);
        if (result == null) result = caseProcessChartElements(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SYSTEMWORK:
      {
        Systemwork systemwork = (Systemwork)theEObject;
        T result = caseSystemwork(systemwork);
        if (result == null) result = caseProcessElements(systemwork);
        if (result == null) result = caseProcessChartElements(systemwork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STAR_TIME_ALTERNATIVE:
      {
        StarTimeAlternative starTimeAlternative = (StarTimeAlternative)theEObject;
        T result = caseStarTimeAlternative(starTimeAlternative);
        if (result == null) result = caseStartTimeAlternative(starTimeAlternative);
        if (result == null) result = caseProcessStartElements(starTimeAlternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatype(Datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Systemtype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Systemtype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemtype(Systemtype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Channel Defintion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Channel Defintion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChannelDefintion(ChannelDefintion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Roletype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Roletype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoletype(Roletype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interview</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interview</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterview(Interview object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.xtext.example.mydsl.myDsl.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(org.xtext.example.mydsl.myDsl.Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(org.xtext.example.mydsl.myDsl.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData(Data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessProcess(BusinessProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Start Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Start Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessStartElements(ProcessStartElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChart(Chart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Time Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Time Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartTimeAlternative(StartTimeAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeAlternative(TimeAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartAlternative(StartAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternative(Alternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessElements(ProcessElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Chart Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Chart Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessChartElements(ProcessChartElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoop(Loop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IF Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IF Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIFQuery(IFQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryTypes(QueryTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanQuery(BooleanQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataQuery(DataQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Brace Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Brace Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBraceQuery(BraceQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleQuery(RoleQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommunication(Communication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivity(Activity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Systemwork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Systemwork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemwork(Systemwork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Star Time Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Star Time Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStarTimeAlternative(StarTimeAlternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
