/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.Systemwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systemwork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl#getReturnObject <em>Return Object</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SystemworkImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemworkImpl extends ProcessElementsImpl implements Systemwork
{
  /**
   * The cached value of the '{@link #getReturnObject() <em>Return Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnObject()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.myDsl.Object returnObject;

  /**
   * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected static final String IMPORTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected String importance = IMPORTANCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayer()
   * @generated
   * @ordered
   */
  protected Role player;

  /**
   * The default value of the '{@link #getExecution() <em>Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecution()
   * @generated
   * @ordered
   */
  protected static final String EXECUTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecution()
   * @generated
   * @ordered
   */
  protected String execution = EXECUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.myDsl.System system;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected Function function;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.mydsl.myDsl.Object> parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemworkImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.SYSTEMWORK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object getReturnObject()
  {
    if (returnObject != null && returnObject.eIsProxy())
    {
      InternalEObject oldReturnObject = (InternalEObject)returnObject;
      returnObject = (org.xtext.example.mydsl.myDsl.Object)eResolveProxy(oldReturnObject);
      if (returnObject != oldReturnObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SYSTEMWORK__RETURN_OBJECT, oldReturnObject, returnObject));
      }
    }
    return returnObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object basicGetReturnObject()
  {
    return returnObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnObject(org.xtext.example.mydsl.myDsl.Object newReturnObject)
  {
    org.xtext.example.mydsl.myDsl.Object oldReturnObject = returnObject;
    returnObject = newReturnObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYSTEMWORK__RETURN_OBJECT, oldReturnObject, returnObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportance()
  {
    return importance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportance(String newImportance)
  {
    String oldImportance = importance;
    importance = newImportance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYSTEMWORK__IMPORTANCE, oldImportance, importance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getPlayer()
  {
    if (player != null && player.eIsProxy())
    {
      InternalEObject oldPlayer = (InternalEObject)player;
      player = (Role)eResolveProxy(oldPlayer);
      if (player != oldPlayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SYSTEMWORK__PLAYER, oldPlayer, player));
      }
    }
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetPlayer()
  {
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlayer(Role newPlayer)
  {
    Role oldPlayer = player;
    player = newPlayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYSTEMWORK__PLAYER, oldPlayer, player));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExecution()
  {
    return execution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecution(String newExecution)
  {
    String oldExecution = execution;
    execution = newExecution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYSTEMWORK__EXECUTION, oldExecution, execution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.System getSystem()
  {
    if (system != null && system.eIsProxy())
    {
      InternalEObject oldSystem = (InternalEObject)system;
      system = (org.xtext.example.mydsl.myDsl.System)eResolveProxy(oldSystem);
      if (system != oldSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SYSTEMWORK__SYSTEM, oldSystem, system));
      }
    }
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.System basicGetSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(org.xtext.example.mydsl.myDsl.System newSystem)
  {
    org.xtext.example.mydsl.myDsl.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYSTEMWORK__SYSTEM, oldSystem, system));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFunction()
  {
    if (function != null && function.eIsProxy())
    {
      InternalEObject oldFunction = (InternalEObject)function;
      function = (Function)eResolveProxy(oldFunction);
      if (function != oldFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.SYSTEMWORK__FUNCTION, oldFunction, function));
      }
    }
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function basicGetFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(Function newFunction)
  {
    Function oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYSTEMWORK__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.mydsl.myDsl.Object> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectResolvingEList<org.xtext.example.mydsl.myDsl.Object>(org.xtext.example.mydsl.myDsl.Object.class, this, MyDslPackage.SYSTEMWORK__PARAMETER);
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.SYSTEMWORK__RETURN_OBJECT:
        if (resolve) return getReturnObject();
        return basicGetReturnObject();
      case MyDslPackage.SYSTEMWORK__IMPORTANCE:
        return getImportance();
      case MyDslPackage.SYSTEMWORK__PLAYER:
        if (resolve) return getPlayer();
        return basicGetPlayer();
      case MyDslPackage.SYSTEMWORK__EXECUTION:
        return getExecution();
      case MyDslPackage.SYSTEMWORK__SYSTEM:
        if (resolve) return getSystem();
        return basicGetSystem();
      case MyDslPackage.SYSTEMWORK__FUNCTION:
        if (resolve) return getFunction();
        return basicGetFunction();
      case MyDslPackage.SYSTEMWORK__PARAMETER:
        return getParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.SYSTEMWORK__RETURN_OBJECT:
        setReturnObject((org.xtext.example.mydsl.myDsl.Object)newValue);
        return;
      case MyDslPackage.SYSTEMWORK__IMPORTANCE:
        setImportance((String)newValue);
        return;
      case MyDslPackage.SYSTEMWORK__PLAYER:
        setPlayer((Role)newValue);
        return;
      case MyDslPackage.SYSTEMWORK__EXECUTION:
        setExecution((String)newValue);
        return;
      case MyDslPackage.SYSTEMWORK__SYSTEM:
        setSystem((org.xtext.example.mydsl.myDsl.System)newValue);
        return;
      case MyDslPackage.SYSTEMWORK__FUNCTION:
        setFunction((Function)newValue);
        return;
      case MyDslPackage.SYSTEMWORK__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends org.xtext.example.mydsl.myDsl.Object>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.SYSTEMWORK__RETURN_OBJECT:
        setReturnObject((org.xtext.example.mydsl.myDsl.Object)null);
        return;
      case MyDslPackage.SYSTEMWORK__IMPORTANCE:
        setImportance(IMPORTANCE_EDEFAULT);
        return;
      case MyDslPackage.SYSTEMWORK__PLAYER:
        setPlayer((Role)null);
        return;
      case MyDslPackage.SYSTEMWORK__EXECUTION:
        setExecution(EXECUTION_EDEFAULT);
        return;
      case MyDslPackage.SYSTEMWORK__SYSTEM:
        setSystem((org.xtext.example.mydsl.myDsl.System)null);
        return;
      case MyDslPackage.SYSTEMWORK__FUNCTION:
        setFunction((Function)null);
        return;
      case MyDslPackage.SYSTEMWORK__PARAMETER:
        getParameter().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.SYSTEMWORK__RETURN_OBJECT:
        return returnObject != null;
      case MyDslPackage.SYSTEMWORK__IMPORTANCE:
        return IMPORTANCE_EDEFAULT == null ? importance != null : !IMPORTANCE_EDEFAULT.equals(importance);
      case MyDslPackage.SYSTEMWORK__PLAYER:
        return player != null;
      case MyDslPackage.SYSTEMWORK__EXECUTION:
        return EXECUTION_EDEFAULT == null ? execution != null : !EXECUTION_EDEFAULT.equals(execution);
      case MyDslPackage.SYSTEMWORK__SYSTEM:
        return system != null;
      case MyDslPackage.SYSTEMWORK__FUNCTION:
        return function != null;
      case MyDslPackage.SYSTEMWORK__PARAMETER:
        return parameter != null && !parameter.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (importance: ");
    result.append(importance);
    result.append(", execution: ");
    result.append(execution);
    result.append(')');
    return result.toString();
  }

} //SystemworkImpl
