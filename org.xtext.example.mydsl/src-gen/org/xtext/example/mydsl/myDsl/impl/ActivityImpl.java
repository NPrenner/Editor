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

import org.xtext.example.mydsl.myDsl.Activity;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActivityImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActivityImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActivityImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActivityImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ActivityImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends ProcessElementsImpl implements Activity
{
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
   * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTask()
   * @generated
   * @ordered
   */
  protected Task task;

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
  protected ActivityImpl()
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
    return MyDslPackage.Literals.ACTIVITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__IMPORTANCE, oldImportance, importance));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ACTIVITY__PLAYER, oldPlayer, player));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__PLAYER, oldPlayer, player));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__EXECUTION, oldExecution, execution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTask()
  {
    if (task != null && task.eIsProxy())
    {
      InternalEObject oldTask = (InternalEObject)task;
      task = (Task)eResolveProxy(oldTask);
      if (task != oldTask)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ACTIVITY__TASK, oldTask, task));
      }
    }
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetTask()
  {
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTask(Task newTask)
  {
    Task oldTask = task;
    task = newTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ACTIVITY__TASK, oldTask, task));
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
      parameter = new EObjectResolvingEList<org.xtext.example.mydsl.myDsl.Object>(org.xtext.example.mydsl.myDsl.Object.class, this, MyDslPackage.ACTIVITY__PARAMETER);
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
      case MyDslPackage.ACTIVITY__IMPORTANCE:
        return getImportance();
      case MyDslPackage.ACTIVITY__PLAYER:
        if (resolve) return getPlayer();
        return basicGetPlayer();
      case MyDslPackage.ACTIVITY__EXECUTION:
        return getExecution();
      case MyDslPackage.ACTIVITY__TASK:
        if (resolve) return getTask();
        return basicGetTask();
      case MyDslPackage.ACTIVITY__PARAMETER:
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
      case MyDslPackage.ACTIVITY__IMPORTANCE:
        setImportance((String)newValue);
        return;
      case MyDslPackage.ACTIVITY__PLAYER:
        setPlayer((Role)newValue);
        return;
      case MyDslPackage.ACTIVITY__EXECUTION:
        setExecution((String)newValue);
        return;
      case MyDslPackage.ACTIVITY__TASK:
        setTask((Task)newValue);
        return;
      case MyDslPackage.ACTIVITY__PARAMETER:
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
      case MyDslPackage.ACTIVITY__IMPORTANCE:
        setImportance(IMPORTANCE_EDEFAULT);
        return;
      case MyDslPackage.ACTIVITY__PLAYER:
        setPlayer((Role)null);
        return;
      case MyDslPackage.ACTIVITY__EXECUTION:
        setExecution(EXECUTION_EDEFAULT);
        return;
      case MyDslPackage.ACTIVITY__TASK:
        setTask((Task)null);
        return;
      case MyDslPackage.ACTIVITY__PARAMETER:
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
      case MyDslPackage.ACTIVITY__IMPORTANCE:
        return IMPORTANCE_EDEFAULT == null ? importance != null : !IMPORTANCE_EDEFAULT.equals(importance);
      case MyDslPackage.ACTIVITY__PLAYER:
        return player != null;
      case MyDslPackage.ACTIVITY__EXECUTION:
        return EXECUTION_EDEFAULT == null ? execution != null : !EXECUTION_EDEFAULT.equals(execution);
      case MyDslPackage.ACTIVITY__TASK:
        return task != null;
      case MyDslPackage.ACTIVITY__PARAMETER:
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

} //ActivityImpl
