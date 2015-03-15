/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 16;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeDefinitionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__PACKAGE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__NAME = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DatatypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 2;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__PACKAGE = TYPE_DEFINITION__PACKAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__NAME = TYPE_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemtypeImpl <em>Systemtype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SystemtypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystemtype()
   * @generated
   */
  int SYSTEMTYPE = 3;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMTYPE__PACKAGE = TYPE_DEFINITION__PACKAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMTYPE__NAME = TYPE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMTYPE__FUNCTIONS = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Systemtype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMTYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ChannelDefintionImpl <em>Channel Defintion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ChannelDefintionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getChannelDefintion()
   * @generated
   */
  int CHANNEL_DEFINTION = 4;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DEFINTION__PACKAGE = TYPE_DEFINITION__PACKAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DEFINTION__NAME = TYPE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DEFINTION__TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Channel Defintion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_DEFINTION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RoletypeImpl <em>Roletype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RoletypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRoletype()
   * @generated
   */
  int ROLETYPE = 5;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLETYPE__PACKAGE = TYPE_DEFINITION__PACKAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLETYPE__NAME = TYPE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLETYPE__STATE = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLETYPE__TASKS = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLETYPE__MESSAGES = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Roletype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLETYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StateImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getState()
   * @generated
   */
  int STATE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TaskImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTask()
   * @generated
   */
  int TASK = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MessageImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FunctionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_VALUE = 2;

  /**
   * The feature id for the '<em><b>Return Argument</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_ARGUMENT = 3;

  /**
   * The feature id for the '<em><b>Return Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__RETURN_BOOL = 4;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InterviewImpl <em>Interview</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InterviewImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInterview()
   * @generated
   */
  int INTERVIEW = 10;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVIEW__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVIEW__NAME = 1;

  /**
   * The feature id for the '<em><b>Mainrole</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVIEW__MAINROLE = 2;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVIEW__OBJECTS = 3;

  /**
   * The feature id for the '<em><b>Process</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVIEW__PROCESS = 4;

  /**
   * The number of structural features of the '<em>Interview</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVIEW_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ObjectImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = 1;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanImpl <em>Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BooleanImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN__TYPE = OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN__NAME = OBJECT__NAME;

  /**
   * The number of structural features of the '<em>Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SystemImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__TYPE = OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = OBJECT__NAME;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DataImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getData()
   * @generated
   */
  int DATA = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__TYPE = OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__NAME = OBJECT__NAME;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RoleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRole()
   * @generated
   */
  int ROLE = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__TYPE = OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Rolekind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ROLEKIND = OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BusinessProcessImpl <em>Business Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BusinessProcessImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBusinessProcess()
   * @generated
   */
  int BUSINESS_PROCESS = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PROCESS__ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Business Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ProcessStartElementsImpl <em>Process Start Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ProcessStartElementsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProcessStartElements()
   * @generated
   */
  int PROCESS_START_ELEMENTS = 18;

  /**
   * The number of structural features of the '<em>Process Start Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_START_ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ChartImpl <em>Chart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ChartImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getChart()
   * @generated
   */
  int CHART = 19;

  /**
   * The feature id for the '<em><b>Start Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__START_ELEMENTS = PROCESS_START_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Followed Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__FOLLOWED_ELEMENTS = PROCESS_START_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Chart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_FEATURE_COUNT = PROCESS_START_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StartTimeAlternativeImpl <em>Start Time Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StartTimeAlternativeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStartTimeAlternative()
   * @generated
   */
  int START_TIME_ALTERNATIVE = 20;

  /**
   * The number of structural features of the '<em>Start Time Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_TIME_ALTERNATIVE_FEATURE_COUNT = PROCESS_START_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ProcessElementsImpl <em>Process Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ProcessElementsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProcessElements()
   * @generated
   */
  int PROCESS_ELEMENTS = 24;

  /**
   * The number of structural features of the '<em>Process Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TimeAlternativeImpl <em>Time Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TimeAlternativeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTimeAlternative()
   * @generated
   */
  int TIME_ALTERNATIVE = 21;

  /**
   * The feature id for the '<em><b>Mostly Alternative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sometime Alternative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE = PROCESS_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Time Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_ALTERNATIVE_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StartAlternativeImpl <em>Start Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StartAlternativeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStartAlternative()
   * @generated
   */
  int START_ALTERNATIVE = 22;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_ALTERNATIVE__ALTERNATIVE = PROCESS_START_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_ALTERNATIVE_FEATURE_COUNT = PROCESS_START_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AlternativeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 23;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__ALTERNATIVE = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ProcessChartElementsImpl <em>Process Chart Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ProcessChartElementsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProcessChartElements()
   * @generated
   */
  int PROCESS_CHART_ELEMENTS = 25;

  /**
   * The number of structural features of the '<em>Process Chart Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_CHART_ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LoopImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 26;

  /**
   * The feature id for the '<em><b>Uncounter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__UNCOUNTER = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__COUNTER = PROCESS_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__ELEMENTS = PROCESS_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IFQueryImpl <em>IF Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IFQueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIFQuery()
   * @generated
   */
  int IF_QUERY = 27;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_QUERY__QUERIES = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_QUERY__ELEMENTS = PROCESS_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>IF Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_QUERY_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryTypesImpl <em>Query Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.QueryTypesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQueryTypes()
   * @generated
   */
  int QUERY_TYPES = 28;

  /**
   * The number of structural features of the '<em>Query Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.QueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 29;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = QUERY_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanQueryImpl <em>Boolean Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BooleanQueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBooleanQuery()
   * @generated
   */
  int BOOLEAN_QUERY = 30;

  /**
   * The feature id for the '<em><b>Boolean Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_QUERY__BOOLEAN_VALUE = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_QUERY__BOOLEAN = QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DataQueryImpl <em>Data Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DataQueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataQuery()
   * @generated
   */
  int DATA_QUERY = 31;

  /**
   * The feature id for the '<em><b>Exclamation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__EXCLAMATION = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object One</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__OBJECT_ONE = QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__CONDITION = QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Object Two</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__OBJECT_TWO = QUERY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Data Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BraceQueryImpl <em>Brace Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BraceQueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBraceQuery()
   * @generated
   */
  int BRACE_QUERY = 32;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACE_QUERY__QUERIES = QUERY_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Brace Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACE_QUERY_FEATURE_COUNT = QUERY_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PlayerQueryImpl <em>Player Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PlayerQueryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlayerQuery()
   * @generated
   */
  int PLAYER_QUERY = 33;

  /**
   * The feature id for the '<em><b>Player</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_QUERY__PLAYER = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_QUERY__STATUS = QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_QUERY__BOOLEAN = QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Player Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl <em>Communication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CommunicationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommunication()
   * @generated
   */
  int COMMUNICATION = 34;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION__IMPORTANCE = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sender</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION__SENDER = PROCESS_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Execution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION__EXECUTION = PROCESS_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION__RECEIVER = PROCESS_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION__MESSAGE = PROCESS_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION__PARAMETER = PROCESS_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION__CHANNEL = PROCESS_ELEMENTS_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Communication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ActivityImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 35;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__IMPORTANCE = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ROLE = PROCESS_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Execution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__EXECUTION = PROCESS_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__TASK = PROCESS_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__PARAMETER = PROCESS_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl <em>Systemwork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SystemworkImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystemwork()
   * @generated
   */
  int SYSTEMWORK = 36;

  /**
   * The feature id for the '<em><b>Return Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK__RETURN_OBJECT = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK__IMPORTANCE = PROCESS_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK__ROLE = PROCESS_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Execution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK__EXECUTION = PROCESS_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK__SYSTEM = PROCESS_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK__FUNCTION = PROCESS_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK__PARAMETER = PROCESS_ELEMENTS_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Systemwork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEMWORK_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StarTimeAlternativeImpl <em>Star Time Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StarTimeAlternativeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStarTimeAlternative()
   * @generated
   */
  int STAR_TIME_ALTERNATIVE = 37;

  /**
   * The feature id for the '<em><b>Mostly Alternative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE = START_TIME_ALTERNATIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sometimes Alternative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE = START_TIME_ALTERNATIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Star Time Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_TIME_ALTERNATIVE_FEATURE_COUNT = START_TIME_ALTERNATIVE_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see org.xtext.example.mydsl.myDsl.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Domainmodel#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.Domainmodel#getElement()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Element();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.xtext.example.mydsl.myDsl.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.TypeDefinition#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see org.xtext.example.mydsl.myDsl.TypeDefinition#getPackage()
   * @see #getTypeDefinition()
   * @generated
   */
  EAttribute getTypeDefinition_Package();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.TypeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.TypeDefinition#getName()
   * @see #getTypeDefinition()
   * @generated
   */
  EAttribute getTypeDefinition_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Systemtype <em>Systemtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Systemtype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemtype
   * @generated
   */
  EClass getSystemtype();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Systemtype#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemtype#getFunctions()
   * @see #getSystemtype()
   * @generated
   */
  EReference getSystemtype_Functions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ChannelDefintion <em>Channel Defintion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Channel Defintion</em>'.
   * @see org.xtext.example.mydsl.myDsl.ChannelDefintion
   * @generated
   */
  EClass getChannelDefintion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ChannelDefintion#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.ChannelDefintion#getType()
   * @see #getChannelDefintion()
   * @generated
   */
  EAttribute getChannelDefintion_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Roletype <em>Roletype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Roletype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Roletype
   * @generated
   */
  EClass getRoletype();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Roletype#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see org.xtext.example.mydsl.myDsl.Roletype#getState()
   * @see #getRoletype()
   * @generated
   */
  EReference getRoletype_State();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Roletype#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.xtext.example.mydsl.myDsl.Roletype#getTasks()
   * @see #getRoletype()
   * @generated
   */
  EReference getRoletype_Tasks();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Roletype#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see org.xtext.example.mydsl.myDsl.Roletype#getMessages()
   * @see #getRoletype()
   * @generated
   */
  EReference getRoletype_Messages();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.example.mydsl.myDsl.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.example.mydsl.myDsl.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Task#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Task#getParameter()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see org.xtext.example.mydsl.myDsl.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Message#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Message#getName()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Message#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Message#getParameter()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.example.mydsl.myDsl.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Function#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Function#getParameter()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Function#isReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.Function#isReturnValue()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_ReturnValue();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Function#getReturnArgument <em>Return Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Argument</em>'.
   * @see org.xtext.example.mydsl.myDsl.Function#getReturnArgument()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_ReturnArgument();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Function#getReturnBool <em>Return Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Bool</em>'.
   * @see org.xtext.example.mydsl.myDsl.Function#getReturnBool()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_ReturnBool();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Interview <em>Interview</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interview</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interview
   * @generated
   */
  EClass getInterview();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Interview#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interview#getPackage()
   * @see #getInterview()
   * @generated
   */
  EAttribute getInterview_Package();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Interview#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interview#getName()
   * @see #getInterview()
   * @generated
   */
  EAttribute getInterview_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Interview#getMainrole <em>Mainrole</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mainrole</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interview#getMainrole()
   * @see #getInterview()
   * @generated
   */
  EReference getInterview_Mainrole();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Interview#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interview#getObjects()
   * @see #getInterview()
   * @generated
   */
  EReference getInterview_Objects();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Interview#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interview#getProcess()
   * @see #getInterview()
   * @generated
   */
  EReference getInterview_Process();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.xtext.example.mydsl.myDsl.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Object#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Object#getType()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Object#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Object#getName()
   * @see #getObject()
   * @generated
   */
  EAttribute getObject_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean</em>'.
   * @see org.xtext.example.mydsl.myDsl.Boolean
   * @generated
   */
  EClass getBoolean();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.xtext.example.mydsl.myDsl.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see org.xtext.example.mydsl.myDsl.Data
   * @generated
   */
  EClass getData();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see org.xtext.example.mydsl.myDsl.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Role#getRolekind <em>Rolekind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rolekind</em>'.
   * @see org.xtext.example.mydsl.myDsl.Role#getRolekind()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Rolekind();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BusinessProcess <em>Business Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Process</em>'.
   * @see org.xtext.example.mydsl.myDsl.BusinessProcess
   * @generated
   */
  EClass getBusinessProcess();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.BusinessProcess#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.BusinessProcess#getName()
   * @see #getBusinessProcess()
   * @generated
   */
  EAttribute getBusinessProcess_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.BusinessProcess#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.BusinessProcess#getElement()
   * @see #getBusinessProcess()
   * @generated
   */
  EReference getBusinessProcess_Element();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ProcessStartElements <em>Process Start Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Start Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.ProcessStartElements
   * @generated
   */
  EClass getProcessStartElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Chart <em>Chart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chart</em>'.
   * @see org.xtext.example.mydsl.myDsl.Chart
   * @generated
   */
  EClass getChart();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Chart#getStartElements <em>Start Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Start Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Chart#getStartElements()
   * @see #getChart()
   * @generated
   */
  EReference getChart_StartElements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Chart#getFollowedElements <em>Followed Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Followed Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Chart#getFollowedElements()
   * @see #getChart()
   * @generated
   */
  EReference getChart_FollowedElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StartTimeAlternative <em>Start Time Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Time Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.StartTimeAlternative
   * @generated
   */
  EClass getStartTimeAlternative();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.TimeAlternative <em>Time Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.TimeAlternative
   * @generated
   */
  EClass getTimeAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.TimeAlternative#getMostlyAlternative <em>Mostly Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mostly Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.TimeAlternative#getMostlyAlternative()
   * @see #getTimeAlternative()
   * @generated
   */
  EReference getTimeAlternative_MostlyAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.TimeAlternative#getSometimeAlternative <em>Sometime Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sometime Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.TimeAlternative#getSometimeAlternative()
   * @see #getTimeAlternative()
   * @generated
   */
  EReference getTimeAlternative_SometimeAlternative();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StartAlternative <em>Start Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.StartAlternative
   * @generated
   */
  EClass getStartAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.StartAlternative#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.StartAlternative#getAlternative()
   * @see #getStartAlternative()
   * @generated
   */
  EReference getStartAlternative_Alternative();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Alternative#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.Alternative#getAlternative()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_Alternative();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ProcessElements <em>Process Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.ProcessElements
   * @generated
   */
  EClass getProcessElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ProcessChartElements <em>Process Chart Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Chart Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.ProcessChartElements
   * @generated
   */
  EClass getProcessChartElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see org.xtext.example.mydsl.myDsl.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Loop#getUncounter <em>Uncounter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uncounter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Loop#getUncounter()
   * @see #getLoop()
   * @generated
   */
  EAttribute getLoop_Uncounter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Loop#getCounter <em>Counter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Counter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Loop#getCounter()
   * @see #getLoop()
   * @generated
   */
  EAttribute getLoop_Counter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Loop#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Loop#getElements()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.IFQuery <em>IF Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IF Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.IFQuery
   * @generated
   */
  EClass getIFQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.IFQuery#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see org.xtext.example.mydsl.myDsl.IFQuery#getQueries()
   * @see #getIFQuery()
   * @generated
   */
  EReference getIFQuery_Queries();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.IFQuery#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.IFQuery#getElements()
   * @see #getIFQuery()
   * @generated
   */
  EReference getIFQuery_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.QueryTypes <em>Query Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Types</em>'.
   * @see org.xtext.example.mydsl.myDsl.QueryTypes
   * @generated
   */
  EClass getQueryTypes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BooleanQuery <em>Boolean Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.BooleanQuery
   * @generated
   */
  EClass getBooleanQuery();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.BooleanQuery#getBooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Boolean Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.BooleanQuery#getBooleanValue()
   * @see #getBooleanQuery()
   * @generated
   */
  EReference getBooleanQuery_BooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.BooleanQuery#getBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see org.xtext.example.mydsl.myDsl.BooleanQuery#getBoolean()
   * @see #getBooleanQuery()
   * @generated
   */
  EAttribute getBooleanQuery_Boolean();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DataQuery <em>Data Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataQuery
   * @generated
   */
  EClass getDataQuery();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataQuery#isExclamation <em>Exclamation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclamation</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataQuery#isExclamation()
   * @see #getDataQuery()
   * @generated
   */
  EAttribute getDataQuery_Exclamation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataQuery#getObjectOne <em>Object One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object One</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataQuery#getObjectOne()
   * @see #getDataQuery()
   * @generated
   */
  EReference getDataQuery_ObjectOne();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.DataQuery#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataQuery#getCondition()
   * @see #getDataQuery()
   * @generated
   */
  EAttribute getDataQuery_Condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DataQuery#getObjectTwo <em>Object Two</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object Two</em>'.
   * @see org.xtext.example.mydsl.myDsl.DataQuery#getObjectTwo()
   * @see #getDataQuery()
   * @generated
   */
  EReference getDataQuery_ObjectTwo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BraceQuery <em>Brace Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Brace Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.BraceQuery
   * @generated
   */
  EClass getBraceQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.BraceQuery#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see org.xtext.example.mydsl.myDsl.BraceQuery#getQueries()
   * @see #getBraceQuery()
   * @generated
   */
  EReference getBraceQuery_Queries();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.PlayerQuery <em>Player Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Player Query</em>'.
   * @see org.xtext.example.mydsl.myDsl.PlayerQuery
   * @generated
   */
  EClass getPlayerQuery();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getPlayer <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Player</em>'.
   * @see org.xtext.example.mydsl.myDsl.PlayerQuery#getPlayer()
   * @see #getPlayerQuery()
   * @generated
   */
  EReference getPlayerQuery_Player();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Status</em>'.
   * @see org.xtext.example.mydsl.myDsl.PlayerQuery#getStatus()
   * @see #getPlayerQuery()
   * @generated
   */
  EReference getPlayerQuery_Status();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see org.xtext.example.mydsl.myDsl.PlayerQuery#getBoolean()
   * @see #getPlayerQuery()
   * @generated
   */
  EAttribute getPlayerQuery_Boolean();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Communication <em>Communication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Communication</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication
   * @generated
   */
  EClass getCommunication();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Communication#getImportance <em>Importance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication#getImportance()
   * @see #getCommunication()
   * @generated
   */
  EAttribute getCommunication_Importance();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Communication#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sender</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication#getSender()
   * @see #getCommunication()
   * @generated
   */
  EReference getCommunication_Sender();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Communication#getExecution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Execution</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication#getExecution()
   * @see #getCommunication()
   * @generated
   */
  EAttribute getCommunication_Execution();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Communication#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Receiver</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication#getReceiver()
   * @see #getCommunication()
   * @generated
   */
  EReference getCommunication_Receiver();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Communication#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication#getMessage()
   * @see #getCommunication()
   * @generated
   */
  EReference getCommunication_Message();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Communication#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication#getParameter()
   * @see #getCommunication()
   * @generated
   */
  EReference getCommunication_Parameter();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Communication#getChannel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Channel</em>'.
   * @see org.xtext.example.mydsl.myDsl.Communication#getChannel()
   * @see #getCommunication()
   * @generated
   */
  EReference getCommunication_Channel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see org.xtext.example.mydsl.myDsl.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Activity#getImportance <em>Importance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance</em>'.
   * @see org.xtext.example.mydsl.myDsl.Activity#getImportance()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Importance();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Activity#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see org.xtext.example.mydsl.myDsl.Activity#getRole()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Role();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Activity#getExecution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Execution</em>'.
   * @see org.xtext.example.mydsl.myDsl.Activity#getExecution()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Execution();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Activity#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.xtext.example.mydsl.myDsl.Activity#getTask()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Task();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Activity#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Activity#getParameter()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Systemwork <em>Systemwork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Systemwork</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork
   * @generated
   */
  EClass getSystemwork();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Systemwork#getReturnObject <em>Return Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Object</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork#getReturnObject()
   * @see #getSystemwork()
   * @generated
   */
  EReference getSystemwork_ReturnObject();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Systemwork#getImportance <em>Importance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Importance</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork#getImportance()
   * @see #getSystemwork()
   * @generated
   */
  EAttribute getSystemwork_Importance();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Systemwork#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork#getRole()
   * @see #getSystemwork()
   * @generated
   */
  EReference getSystemwork_Role();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Systemwork#getExecution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Execution</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork#getExecution()
   * @see #getSystemwork()
   * @generated
   */
  EAttribute getSystemwork_Execution();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Systemwork#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>System</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork#getSystem()
   * @see #getSystemwork()
   * @generated
   */
  EReference getSystemwork_System();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Systemwork#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork#getFunction()
   * @see #getSystemwork()
   * @generated
   */
  EReference getSystemwork_Function();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.Systemwork#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Systemwork#getParameter()
   * @see #getSystemwork()
   * @generated
   */
  EReference getSystemwork_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StarTimeAlternative <em>Star Time Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Star Time Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.StarTimeAlternative
   * @generated
   */
  EClass getStarTimeAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.StarTimeAlternative#getMostlyAlternative <em>Mostly Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mostly Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.StarTimeAlternative#getMostlyAlternative()
   * @see #getStarTimeAlternative()
   * @generated
   */
  EReference getStarTimeAlternative_MostlyAlternative();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.StarTimeAlternative#getSometimesAlternative <em>Sometimes Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sometimes Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.StarTimeAlternative#getSometimesAlternative()
   * @see #getStarTimeAlternative()
   * @generated
   */
  EReference getStarTimeAlternative_SometimesAlternative();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DomainmodelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENT = eINSTANCE.getDomainmodel_Element();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypeDefinitionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__PACKAGE = eINSTANCE.getTypeDefinition_Package();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__NAME = eINSTANCE.getTypeDefinition_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DatatypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemtypeImpl <em>Systemtype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SystemtypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystemtype()
     * @generated
     */
    EClass SYSTEMTYPE = eINSTANCE.getSystemtype();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEMTYPE__FUNCTIONS = eINSTANCE.getSystemtype_Functions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ChannelDefintionImpl <em>Channel Defintion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ChannelDefintionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getChannelDefintion()
     * @generated
     */
    EClass CHANNEL_DEFINTION = eINSTANCE.getChannelDefintion();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL_DEFINTION__TYPE = eINSTANCE.getChannelDefintion_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RoletypeImpl <em>Roletype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RoletypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRoletype()
     * @generated
     */
    EClass ROLETYPE = eINSTANCE.getRoletype();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLETYPE__STATE = eINSTANCE.getRoletype_State();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLETYPE__TASKS = eINSTANCE.getRoletype_Tasks();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLETYPE__MESSAGES = eINSTANCE.getRoletype_Messages();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StateImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TaskImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__PARAMETER = eINSTANCE.getTask_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MessageImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__PARAMETER = eINSTANCE.getMessage_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FunctionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETER = eINSTANCE.getFunction_Parameter();

    /**
     * The meta object literal for the '<em><b>Return Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__RETURN_VALUE = eINSTANCE.getFunction_ReturnValue();

    /**
     * The meta object literal for the '<em><b>Return Argument</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__RETURN_ARGUMENT = eINSTANCE.getFunction_ReturnArgument();

    /**
     * The meta object literal for the '<em><b>Return Bool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__RETURN_BOOL = eINSTANCE.getFunction_ReturnBool();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InterviewImpl <em>Interview</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InterviewImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInterview()
     * @generated
     */
    EClass INTERVIEW = eINSTANCE.getInterview();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVIEW__PACKAGE = eINSTANCE.getInterview_Package();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVIEW__NAME = eINSTANCE.getInterview_Name();

    /**
     * The meta object literal for the '<em><b>Mainrole</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVIEW__MAINROLE = eINSTANCE.getInterview_Mainrole();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVIEW__OBJECTS = eINSTANCE.getInterview_Objects();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERVIEW__PROCESS = eINSTANCE.getInterview_Process();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ObjectImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__TYPE = eINSTANCE.getObject_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanImpl <em>Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BooleanImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBoolean()
     * @generated
     */
    EClass BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SystemImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DataImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getData()
     * @generated
     */
    EClass DATA = eINSTANCE.getData();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RoleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Rolekind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__ROLEKIND = eINSTANCE.getRole_Rolekind();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BusinessProcessImpl <em>Business Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BusinessProcessImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBusinessProcess()
     * @generated
     */
    EClass BUSINESS_PROCESS = eINSTANCE.getBusinessProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_PROCESS__NAME = eINSTANCE.getBusinessProcess_Name();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_PROCESS__ELEMENT = eINSTANCE.getBusinessProcess_Element();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ProcessStartElementsImpl <em>Process Start Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ProcessStartElementsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProcessStartElements()
     * @generated
     */
    EClass PROCESS_START_ELEMENTS = eINSTANCE.getProcessStartElements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ChartImpl <em>Chart</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ChartImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getChart()
     * @generated
     */
    EClass CHART = eINSTANCE.getChart();

    /**
     * The meta object literal for the '<em><b>Start Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHART__START_ELEMENTS = eINSTANCE.getChart_StartElements();

    /**
     * The meta object literal for the '<em><b>Followed Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHART__FOLLOWED_ELEMENTS = eINSTANCE.getChart_FollowedElements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StartTimeAlternativeImpl <em>Start Time Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StartTimeAlternativeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStartTimeAlternative()
     * @generated
     */
    EClass START_TIME_ALTERNATIVE = eINSTANCE.getStartTimeAlternative();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TimeAlternativeImpl <em>Time Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TimeAlternativeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTimeAlternative()
     * @generated
     */
    EClass TIME_ALTERNATIVE = eINSTANCE.getTimeAlternative();

    /**
     * The meta object literal for the '<em><b>Mostly Alternative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE = eINSTANCE.getTimeAlternative_MostlyAlternative();

    /**
     * The meta object literal for the '<em><b>Sometime Alternative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE = eINSTANCE.getTimeAlternative_SometimeAlternative();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StartAlternativeImpl <em>Start Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StartAlternativeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStartAlternative()
     * @generated
     */
    EClass START_ALTERNATIVE = eINSTANCE.getStartAlternative();

    /**
     * The meta object literal for the '<em><b>Alternative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_ALTERNATIVE__ALTERNATIVE = eINSTANCE.getStartAlternative_Alternative();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AlternativeImpl <em>Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AlternativeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAlternative()
     * @generated
     */
    EClass ALTERNATIVE = eINSTANCE.getAlternative();

    /**
     * The meta object literal for the '<em><b>Alternative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__ALTERNATIVE = eINSTANCE.getAlternative_Alternative();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ProcessElementsImpl <em>Process Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ProcessElementsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProcessElements()
     * @generated
     */
    EClass PROCESS_ELEMENTS = eINSTANCE.getProcessElements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ProcessChartElementsImpl <em>Process Chart Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ProcessChartElementsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProcessChartElements()
     * @generated
     */
    EClass PROCESS_CHART_ELEMENTS = eINSTANCE.getProcessChartElements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LoopImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Uncounter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP__UNCOUNTER = eINSTANCE.getLoop_Uncounter();

    /**
     * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP__COUNTER = eINSTANCE.getLoop_Counter();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__ELEMENTS = eINSTANCE.getLoop_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IFQueryImpl <em>IF Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IFQueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIFQuery()
     * @generated
     */
    EClass IF_QUERY = eINSTANCE.getIFQuery();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_QUERY__QUERIES = eINSTANCE.getIFQuery_Queries();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_QUERY__ELEMENTS = eINSTANCE.getIFQuery_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryTypesImpl <em>Query Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.QueryTypesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQueryTypes()
     * @generated
     */
    EClass QUERY_TYPES = eINSTANCE.getQueryTypes();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.QueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanQueryImpl <em>Boolean Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BooleanQueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBooleanQuery()
     * @generated
     */
    EClass BOOLEAN_QUERY = eINSTANCE.getBooleanQuery();

    /**
     * The meta object literal for the '<em><b>Boolean Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_QUERY__BOOLEAN_VALUE = eINSTANCE.getBooleanQuery_BooleanValue();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_QUERY__BOOLEAN = eINSTANCE.getBooleanQuery_Boolean();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DataQueryImpl <em>Data Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DataQueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDataQuery()
     * @generated
     */
    EClass DATA_QUERY = eINSTANCE.getDataQuery();

    /**
     * The meta object literal for the '<em><b>Exclamation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_QUERY__EXCLAMATION = eINSTANCE.getDataQuery_Exclamation();

    /**
     * The meta object literal for the '<em><b>Object One</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_QUERY__OBJECT_ONE = eINSTANCE.getDataQuery_ObjectOne();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_QUERY__CONDITION = eINSTANCE.getDataQuery_Condition();

    /**
     * The meta object literal for the '<em><b>Object Two</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_QUERY__OBJECT_TWO = eINSTANCE.getDataQuery_ObjectTwo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BraceQueryImpl <em>Brace Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BraceQueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBraceQuery()
     * @generated
     */
    EClass BRACE_QUERY = eINSTANCE.getBraceQuery();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRACE_QUERY__QUERIES = eINSTANCE.getBraceQuery_Queries();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PlayerQueryImpl <em>Player Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PlayerQueryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPlayerQuery()
     * @generated
     */
    EClass PLAYER_QUERY = eINSTANCE.getPlayerQuery();

    /**
     * The meta object literal for the '<em><b>Player</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYER_QUERY__PLAYER = eINSTANCE.getPlayerQuery_Player();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYER_QUERY__STATUS = eINSTANCE.getPlayerQuery_Status();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAYER_QUERY__BOOLEAN = eINSTANCE.getPlayerQuery_Boolean();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl <em>Communication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CommunicationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommunication()
     * @generated
     */
    EClass COMMUNICATION = eINSTANCE.getCommunication();

    /**
     * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMUNICATION__IMPORTANCE = eINSTANCE.getCommunication_Importance();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNICATION__SENDER = eINSTANCE.getCommunication_Sender();

    /**
     * The meta object literal for the '<em><b>Execution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMUNICATION__EXECUTION = eINSTANCE.getCommunication_Execution();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNICATION__RECEIVER = eINSTANCE.getCommunication_Receiver();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNICATION__MESSAGE = eINSTANCE.getCommunication_Message();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNICATION__PARAMETER = eINSTANCE.getCommunication_Parameter();

    /**
     * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMUNICATION__CHANNEL = eINSTANCE.getCommunication_Channel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ActivityImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__IMPORTANCE = eINSTANCE.getActivity_Importance();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ROLE = eINSTANCE.getActivity_Role();

    /**
     * The meta object literal for the '<em><b>Execution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__EXECUTION = eINSTANCE.getActivity_Execution();

    /**
     * The meta object literal for the '<em><b>Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__TASK = eINSTANCE.getActivity_Task();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__PARAMETER = eINSTANCE.getActivity_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl <em>Systemwork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SystemworkImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSystemwork()
     * @generated
     */
    EClass SYSTEMWORK = eINSTANCE.getSystemwork();

    /**
     * The meta object literal for the '<em><b>Return Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEMWORK__RETURN_OBJECT = eINSTANCE.getSystemwork_ReturnObject();

    /**
     * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEMWORK__IMPORTANCE = eINSTANCE.getSystemwork_Importance();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEMWORK__ROLE = eINSTANCE.getSystemwork_Role();

    /**
     * The meta object literal for the '<em><b>Execution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEMWORK__EXECUTION = eINSTANCE.getSystemwork_Execution();

    /**
     * The meta object literal for the '<em><b>System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEMWORK__SYSTEM = eINSTANCE.getSystemwork_System();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEMWORK__FUNCTION = eINSTANCE.getSystemwork_Function();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEMWORK__PARAMETER = eINSTANCE.getSystemwork_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StarTimeAlternativeImpl <em>Star Time Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StarTimeAlternativeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStarTimeAlternative()
     * @generated
     */
    EClass STAR_TIME_ALTERNATIVE = eINSTANCE.getStarTimeAlternative();

    /**
     * The meta object literal for the '<em><b>Mostly Alternative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE = eINSTANCE.getStarTimeAlternative_MostlyAlternative();

    /**
     * The meta object literal for the '<em><b>Sometimes Alternative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE = eINSTANCE.getStarTimeAlternative_SometimesAlternative();

  }

} //MyDslPackage
