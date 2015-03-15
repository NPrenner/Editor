/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.RoleQuery;
import org.xtext.example.mydsl.myDsl.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RoleQueryImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RoleQueryImpl#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RoleQueryImpl#getBoolean <em>Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleQueryImpl extends QueryImpl implements RoleQuery
{
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
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;

  /**
   * The default value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolean()
   * @generated
   * @ordered
   */
  protected String boolean_ = BOOLEAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleQueryImpl()
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
    return MyDslPackage.Literals.ROLE_QUERY;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ROLE_QUERY__PLAYER, oldPlayer, player));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROLE_QUERY__PLAYER, oldPlayer, player));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (State)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ROLE_QUERY__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(State newState)
  {
    State oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROLE_QUERY__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolean()
  {
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolean(String newBoolean)
  {
    String oldBoolean = boolean_;
    boolean_ = newBoolean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROLE_QUERY__BOOLEAN, oldBoolean, boolean_));
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
      case MyDslPackage.ROLE_QUERY__PLAYER:
        if (resolve) return getPlayer();
        return basicGetPlayer();
      case MyDslPackage.ROLE_QUERY__STATE:
        if (resolve) return getState();
        return basicGetState();
      case MyDslPackage.ROLE_QUERY__BOOLEAN:
        return getBoolean();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ROLE_QUERY__PLAYER:
        setPlayer((Role)newValue);
        return;
      case MyDslPackage.ROLE_QUERY__STATE:
        setState((State)newValue);
        return;
      case MyDslPackage.ROLE_QUERY__BOOLEAN:
        setBoolean((String)newValue);
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
      case MyDslPackage.ROLE_QUERY__PLAYER:
        setPlayer((Role)null);
        return;
      case MyDslPackage.ROLE_QUERY__STATE:
        setState((State)null);
        return;
      case MyDslPackage.ROLE_QUERY__BOOLEAN:
        setBoolean(BOOLEAN_EDEFAULT);
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
      case MyDslPackage.ROLE_QUERY__PLAYER:
        return player != null;
      case MyDslPackage.ROLE_QUERY__STATE:
        return state != null;
      case MyDslPackage.ROLE_QUERY__BOOLEAN:
        return BOOLEAN_EDEFAULT == null ? boolean_ != null : !BOOLEAN_EDEFAULT.equals(boolean_);
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
    result.append(" (boolean: ");
    result.append(boolean_);
    result.append(')');
    return result.toString();
  }

} //RoleQueryImpl
