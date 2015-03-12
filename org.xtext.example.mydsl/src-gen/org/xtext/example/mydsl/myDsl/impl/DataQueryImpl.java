/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.DataQuery;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataQueryImpl#isExclamation <em>Exclamation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataQueryImpl#getObjectOne <em>Object One</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataQueryImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DataQueryImpl#getObjectTwo <em>Object Two</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataQueryImpl extends QueryImpl implements DataQuery
{
  /**
   * The default value of the '{@link #isExclamation() <em>Exclamation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclamation()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLAMATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExclamation() <em>Exclamation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclamation()
   * @generated
   * @ordered
   */
  protected boolean exclamation = EXCLAMATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjectOne() <em>Object One</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectOne()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.myDsl.Object objectOne;

  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjectTwo() <em>Object Two</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectTwo()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.myDsl.Object objectTwo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataQueryImpl()
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
    return MyDslPackage.Literals.DATA_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExclamation()
  {
    return exclamation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclamation(boolean newExclamation)
  {
    boolean oldExclamation = exclamation;
    exclamation = newExclamation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_QUERY__EXCLAMATION, oldExclamation, exclamation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object getObjectOne()
  {
    if (objectOne != null && objectOne.eIsProxy())
    {
      InternalEObject oldObjectOne = (InternalEObject)objectOne;
      objectOne = (org.xtext.example.mydsl.myDsl.Object)eResolveProxy(oldObjectOne);
      if (objectOne != oldObjectOne)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_QUERY__OBJECT_ONE, oldObjectOne, objectOne));
      }
    }
    return objectOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object basicGetObjectOne()
  {
    return objectOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectOne(org.xtext.example.mydsl.myDsl.Object newObjectOne)
  {
    org.xtext.example.mydsl.myDsl.Object oldObjectOne = objectOne;
    objectOne = newObjectOne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_QUERY__OBJECT_ONE, oldObjectOne, objectOne));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_QUERY__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object getObjectTwo()
  {
    if (objectTwo != null && objectTwo.eIsProxy())
    {
      InternalEObject oldObjectTwo = (InternalEObject)objectTwo;
      objectTwo = (org.xtext.example.mydsl.myDsl.Object)eResolveProxy(oldObjectTwo);
      if (objectTwo != oldObjectTwo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DATA_QUERY__OBJECT_TWO, oldObjectTwo, objectTwo));
      }
    }
    return objectTwo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object basicGetObjectTwo()
  {
    return objectTwo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectTwo(org.xtext.example.mydsl.myDsl.Object newObjectTwo)
  {
    org.xtext.example.mydsl.myDsl.Object oldObjectTwo = objectTwo;
    objectTwo = newObjectTwo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATA_QUERY__OBJECT_TWO, oldObjectTwo, objectTwo));
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
      case MyDslPackage.DATA_QUERY__EXCLAMATION:
        return isExclamation();
      case MyDslPackage.DATA_QUERY__OBJECT_ONE:
        if (resolve) return getObjectOne();
        return basicGetObjectOne();
      case MyDslPackage.DATA_QUERY__CONDITION:
        return getCondition();
      case MyDslPackage.DATA_QUERY__OBJECT_TWO:
        if (resolve) return getObjectTwo();
        return basicGetObjectTwo();
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
      case MyDslPackage.DATA_QUERY__EXCLAMATION:
        setExclamation((Boolean)newValue);
        return;
      case MyDslPackage.DATA_QUERY__OBJECT_ONE:
        setObjectOne((org.xtext.example.mydsl.myDsl.Object)newValue);
        return;
      case MyDslPackage.DATA_QUERY__CONDITION:
        setCondition((String)newValue);
        return;
      case MyDslPackage.DATA_QUERY__OBJECT_TWO:
        setObjectTwo((org.xtext.example.mydsl.myDsl.Object)newValue);
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
      case MyDslPackage.DATA_QUERY__EXCLAMATION:
        setExclamation(EXCLAMATION_EDEFAULT);
        return;
      case MyDslPackage.DATA_QUERY__OBJECT_ONE:
        setObjectOne((org.xtext.example.mydsl.myDsl.Object)null);
        return;
      case MyDslPackage.DATA_QUERY__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case MyDslPackage.DATA_QUERY__OBJECT_TWO:
        setObjectTwo((org.xtext.example.mydsl.myDsl.Object)null);
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
      case MyDslPackage.DATA_QUERY__EXCLAMATION:
        return exclamation != EXCLAMATION_EDEFAULT;
      case MyDslPackage.DATA_QUERY__OBJECT_ONE:
        return objectOne != null;
      case MyDslPackage.DATA_QUERY__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case MyDslPackage.DATA_QUERY__OBJECT_TWO:
        return objectTwo != null;
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
    result.append(" (exclamation: ");
    result.append(exclamation);
    result.append(", condition: ");
    result.append(condition);
    result.append(')');
    return result.toString();
  }

} //DataQueryImpl
