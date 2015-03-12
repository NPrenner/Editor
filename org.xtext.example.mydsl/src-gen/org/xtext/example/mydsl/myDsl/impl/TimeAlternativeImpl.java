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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ProcessElements;
import org.xtext.example.mydsl.myDsl.TimeAlternative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TimeAlternativeImpl#getMostlyAlternative <em>Mostly Alternative</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TimeAlternativeImpl#getSometimeAlternative <em>Sometime Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeAlternativeImpl extends ProcessElementsImpl implements TimeAlternative
{
  /**
   * The cached value of the '{@link #getMostlyAlternative() <em>Mostly Alternative</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMostlyAlternative()
   * @generated
   * @ordered
   */
  protected EList<ProcessElements> mostlyAlternative;

  /**
   * The cached value of the '{@link #getSometimeAlternative() <em>Sometime Alternative</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSometimeAlternative()
   * @generated
   * @ordered
   */
  protected EList<ProcessElements> sometimeAlternative;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeAlternativeImpl()
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
    return MyDslPackage.Literals.TIME_ALTERNATIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessElements> getMostlyAlternative()
  {
    if (mostlyAlternative == null)
    {
      mostlyAlternative = new EObjectContainmentEList<ProcessElements>(ProcessElements.class, this, MyDslPackage.TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE);
    }
    return mostlyAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessElements> getSometimeAlternative()
  {
    if (sometimeAlternative == null)
    {
      sometimeAlternative = new EObjectContainmentEList<ProcessElements>(ProcessElements.class, this, MyDslPackage.TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE);
    }
    return sometimeAlternative;
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
      case MyDslPackage.TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        return ((InternalEList<?>)getMostlyAlternative()).basicRemove(otherEnd, msgs);
      case MyDslPackage.TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE:
        return ((InternalEList<?>)getSometimeAlternative()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        return getMostlyAlternative();
      case MyDslPackage.TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE:
        return getSometimeAlternative();
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
      case MyDslPackage.TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        getMostlyAlternative().clear();
        getMostlyAlternative().addAll((Collection<? extends ProcessElements>)newValue);
        return;
      case MyDslPackage.TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE:
        getSometimeAlternative().clear();
        getSometimeAlternative().addAll((Collection<? extends ProcessElements>)newValue);
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
      case MyDslPackage.TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        getMostlyAlternative().clear();
        return;
      case MyDslPackage.TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE:
        getSometimeAlternative().clear();
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
      case MyDslPackage.TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        return mostlyAlternative != null && !mostlyAlternative.isEmpty();
      case MyDslPackage.TIME_ALTERNATIVE__SOMETIME_ALTERNATIVE:
        return sometimeAlternative != null && !sometimeAlternative.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TimeAlternativeImpl
