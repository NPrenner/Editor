/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.BooleanQuery;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BooleanQueryImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BooleanQueryImpl#getBoolean <em>Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanQueryImpl extends QueryImpl implements BooleanQuery
{
  /**
   * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.myDsl.Boolean booleanValue;

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
  protected BooleanQueryImpl()
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
    return MyDslPackage.Literals.BOOLEAN_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Boolean getBooleanValue()
  {
    if (booleanValue != null && booleanValue.eIsProxy())
    {
      InternalEObject oldBooleanValue = (InternalEObject)booleanValue;
      booleanValue = (org.xtext.example.mydsl.myDsl.Boolean)eResolveProxy(oldBooleanValue);
      if (booleanValue != oldBooleanValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.BOOLEAN_QUERY__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
      }
    }
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Boolean basicGetBooleanValue()
  {
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanValue(org.xtext.example.mydsl.myDsl.Boolean newBooleanValue)
  {
    org.xtext.example.mydsl.myDsl.Boolean oldBooleanValue = booleanValue;
    booleanValue = newBooleanValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BOOLEAN_QUERY__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BOOLEAN_QUERY__BOOLEAN, oldBoolean, boolean_));
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
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN_VALUE:
        if (resolve) return getBooleanValue();
        return basicGetBooleanValue();
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN:
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
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN_VALUE:
        setBooleanValue((org.xtext.example.mydsl.myDsl.Boolean)newValue);
        return;
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN:
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
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN_VALUE:
        setBooleanValue((org.xtext.example.mydsl.myDsl.Boolean)null);
        return;
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN:
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
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN_VALUE:
        return booleanValue != null;
      case MyDslPackage.BOOLEAN_QUERY__BOOLEAN:
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

} //BooleanQueryImpl
