/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Roletype;
import org.xtext.example.mydsl.myDsl.State;
import org.xtext.example.mydsl.myDsl.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roletype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RoletypeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RoletypeImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RoletypeImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoletypeImpl extends TypeDefinitionImpl implements Roletype
{
  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<State> state;

  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> tasks;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> messages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoletypeImpl()
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
    return MyDslPackage.Literals.ROLETYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getState()
  {
    if (state == null)
    {
      state = new EObjectContainmentEList<State>(State.class, this, MyDslPackage.ROLETYPE__STATE);
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Task> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentEList<Task>(Task.class, this, MyDslPackage.ROLETYPE__TASKS);
    }
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<Message>(Message.class, this, MyDslPackage.ROLETYPE__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.ROLETYPE__STATE:
        return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ROLETYPE__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ROLETYPE__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslPackage.ROLETYPE__STATE:
        return getState();
      case MyDslPackage.ROLETYPE__TASKS:
        return getTasks();
      case MyDslPackage.ROLETYPE__MESSAGES:
        return getMessages();
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
      case MyDslPackage.ROLETYPE__STATE:
        getState().clear();
        getState().addAll((Collection<? extends State>)newValue);
        return;
      case MyDslPackage.ROLETYPE__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends Task>)newValue);
        return;
      case MyDslPackage.ROLETYPE__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
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
      case MyDslPackage.ROLETYPE__STATE:
        getState().clear();
        return;
      case MyDslPackage.ROLETYPE__TASKS:
        getTasks().clear();
        return;
      case MyDslPackage.ROLETYPE__MESSAGES:
        getMessages().clear();
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
      case MyDslPackage.ROLETYPE__STATE:
        return state != null && !state.isEmpty();
      case MyDslPackage.ROLETYPE__TASKS:
        return tasks != null && !tasks.isEmpty();
      case MyDslPackage.ROLETYPE__MESSAGES:
        return messages != null && !messages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RoletypeImpl
