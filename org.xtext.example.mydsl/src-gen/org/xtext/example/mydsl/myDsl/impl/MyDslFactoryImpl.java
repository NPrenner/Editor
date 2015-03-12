/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.PlayerQuery;
import org.xtext.example.mydsl.myDsl.ProcessChartElements;
import org.xtext.example.mydsl.myDsl.ProcessElements;
import org.xtext.example.mydsl.myDsl.ProcessStartElements;
import org.xtext.example.mydsl.myDsl.Query;
import org.xtext.example.mydsl.myDsl.QueryTypes;
import org.xtext.example.mydsl.myDsl.Role;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.DOMAINMODEL: return createDomainmodel();
      case MyDslPackage.TYPE_DEFINITION: return createTypeDefinition();
      case MyDslPackage.DATATYPE: return createDatatype();
      case MyDslPackage.SYSTEMTYPE: return createSystemtype();
      case MyDslPackage.CHANNEL_DEFINTION: return createChannelDefintion();
      case MyDslPackage.ROLETYPE: return createRoletype();
      case MyDslPackage.STATE: return createState();
      case MyDslPackage.TASK: return createTask();
      case MyDslPackage.MESSAGE: return createMessage();
      case MyDslPackage.FUNCTION: return createFunction();
      case MyDslPackage.INTERVIEW: return createInterview();
      case MyDslPackage.OBJECT: return createObject();
      case MyDslPackage.BOOLEAN: return createBoolean();
      case MyDslPackage.SYSTEM: return createSystem();
      case MyDslPackage.DATA: return createData();
      case MyDslPackage.ROLE: return createRole();
      case MyDslPackage.PARAMETER: return createParameter();
      case MyDslPackage.BUSINESS_PROCESS: return createBusinessProcess();
      case MyDslPackage.PROCESS_START_ELEMENTS: return createProcessStartElements();
      case MyDslPackage.CHART: return createChart();
      case MyDslPackage.START_TIME_ALTERNATIVE: return createStartTimeAlternative();
      case MyDslPackage.TIME_ALTERNATIVE: return createTimeAlternative();
      case MyDslPackage.START_ALTERNATIVE: return createStartAlternative();
      case MyDslPackage.ALTERNATIVE: return createAlternative();
      case MyDslPackage.PROCESS_ELEMENTS: return createProcessElements();
      case MyDslPackage.PROCESS_CHART_ELEMENTS: return createProcessChartElements();
      case MyDslPackage.LOOP: return createLoop();
      case MyDslPackage.IF_QUERY: return createIFQuery();
      case MyDslPackage.QUERY_TYPES: return createQueryTypes();
      case MyDslPackage.QUERY: return createQuery();
      case MyDslPackage.BOOLEAN_QUERY: return createBooleanQuery();
      case MyDslPackage.DATA_QUERY: return createDataQuery();
      case MyDslPackage.BRACE_QUERY: return createBraceQuery();
      case MyDslPackage.PLAYER_QUERY: return createPlayerQuery();
      case MyDslPackage.COMMUNICATION: return createCommunication();
      case MyDslPackage.ACTIVITY: return createActivity();
      case MyDslPackage.SYSTEMWORK: return createSystemwork();
      case MyDslPackage.STAR_TIME_ALTERNATIVE: return createStarTimeAlternative();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype createDatatype()
  {
    DatatypeImpl datatype = new DatatypeImpl();
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Systemtype createSystemtype()
  {
    SystemtypeImpl systemtype = new SystemtypeImpl();
    return systemtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelDefintion createChannelDefintion()
  {
    ChannelDefintionImpl channelDefintion = new ChannelDefintionImpl();
    return channelDefintion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Roletype createRoletype()
  {
    RoletypeImpl roletype = new RoletypeImpl();
    return roletype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interview createInterview()
  {
    InterviewImpl interview = new InterviewImpl();
    return interview;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Boolean createBoolean()
  {
    BooleanImpl boolean_ = new BooleanImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessProcess createBusinessProcess()
  {
    BusinessProcessImpl businessProcess = new BusinessProcessImpl();
    return businessProcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessStartElements createProcessStartElements()
  {
    ProcessStartElementsImpl processStartElements = new ProcessStartElementsImpl();
    return processStartElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chart createChart()
  {
    ChartImpl chart = new ChartImpl();
    return chart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartTimeAlternative createStartTimeAlternative()
  {
    StartTimeAlternativeImpl startTimeAlternative = new StartTimeAlternativeImpl();
    return startTimeAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeAlternative createTimeAlternative()
  {
    TimeAlternativeImpl timeAlternative = new TimeAlternativeImpl();
    return timeAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartAlternative createStartAlternative()
  {
    StartAlternativeImpl startAlternative = new StartAlternativeImpl();
    return startAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessElements createProcessElements()
  {
    ProcessElementsImpl processElements = new ProcessElementsImpl();
    return processElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessChartElements createProcessChartElements()
  {
    ProcessChartElementsImpl processChartElements = new ProcessChartElementsImpl();
    return processChartElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IFQuery createIFQuery()
  {
    IFQueryImpl ifQuery = new IFQueryImpl();
    return ifQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryTypes createQueryTypes()
  {
    QueryTypesImpl queryTypes = new QueryTypesImpl();
    return queryTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanQuery createBooleanQuery()
  {
    BooleanQueryImpl booleanQuery = new BooleanQueryImpl();
    return booleanQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataQuery createDataQuery()
  {
    DataQueryImpl dataQuery = new DataQueryImpl();
    return dataQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BraceQuery createBraceQuery()
  {
    BraceQueryImpl braceQuery = new BraceQueryImpl();
    return braceQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlayerQuery createPlayerQuery()
  {
    PlayerQueryImpl playerQuery = new PlayerQueryImpl();
    return playerQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Communication createCommunication()
  {
    CommunicationImpl communication = new CommunicationImpl();
    return communication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Systemwork createSystemwork()
  {
    SystemworkImpl systemwork = new SystemworkImpl();
    return systemwork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StarTimeAlternative createStarTimeAlternative()
  {
    StarTimeAlternativeImpl starTimeAlternative = new StarTimeAlternativeImpl();
    return starTimeAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
