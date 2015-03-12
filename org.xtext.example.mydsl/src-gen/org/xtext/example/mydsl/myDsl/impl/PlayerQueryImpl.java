/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PlayerQuery;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PlayerQueryImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PlayerQueryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PlayerQueryImpl#getBoolean <em>Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayerQueryImpl extends QueryImpl implements PlayerQuery
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
   * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected State status;

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
  protected PlayerQueryImpl()
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
    return MyDslPackage.Literals.PLAYER_QUERY;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.PLAYER_QUERY__PLAYER, oldPlayer, player));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PLAYER_QUERY__PLAYER, oldPlayer, player));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getStatus()
  {
    if (status != null && status.eIsProxy())
    {
      InternalEObject oldStatus = (InternalEObject)status;
      status = (State)eResolveProxy(oldStatus);
      if (status != oldStatus)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.PLAYER_QUERY__STATUS, oldStatus, status));
      }
    }
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(State newStatus)
  {
    State oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PLAYER_QUERY__STATUS, oldStatus, status));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PLAYER_QUERY__BOOLEAN, oldBoolean, boolean_));
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
      case MyDslPackage.PLAYER_QUERY__PLAYER:
        if (resolve) return getPlayer();
        return basicGetPlayer();
      case MyDslPackage.PLAYER_QUERY__STATUS:
        if (resolve) return getStatus();
        return basicGetStatus();
      case MyDslPackage.PLAYER_QUERY__BOOLEAN:
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
      case MyDslPackage.PLAYER_QUERY__PLAYER:
        setPlayer((Role)newValue);
        return;
      case MyDslPackage.PLAYER_QUERY__STATUS:
        setStatus((State)newValue);
        return;
      case MyDslPackage.PLAYER_QUERY__BOOLEAN:
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
      case MyDslPackage.PLAYER_QUERY__PLAYER:
        setPlayer((Role)null);
        return;
      case MyDslPackage.PLAYER_QUERY__STATUS:
        setStatus((State)null);
        return;
      case MyDslPackage.PLAYER_QUERY__BOOLEAN:
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
      case MyDslPackage.PLAYER_QUERY__PLAYER:
        return player != null;
      case MyDslPackage.PLAYER_QUERY__STATUS:
        return status != null;
      case MyDslPackage.PLAYER_QUERY__BOOLEAN:
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

} //PlayerQueryImpl
