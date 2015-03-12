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
import org.xtext.example.mydsl.myDsl.ProcessStartElements;
import org.xtext.example.mydsl.myDsl.StarTimeAlternative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Star Time Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StarTimeAlternativeImpl#getMostlyAlternative <em>Mostly Alternative</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StarTimeAlternativeImpl#getSometimesAlternative <em>Sometimes Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StarTimeAlternativeImpl extends StartTimeAlternativeImpl implements StarTimeAlternative
{
  /**
   * The cached value of the '{@link #getMostlyAlternative() <em>Mostly Alternative</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMostlyAlternative()
   * @generated
   * @ordered
   */
  protected EList<ProcessStartElements> mostlyAlternative;

  /**
   * The cached value of the '{@link #getSometimesAlternative() <em>Sometimes Alternative</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSometimesAlternative()
   * @generated
   * @ordered
   */
  protected EList<ProcessStartElements> sometimesAlternative;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StarTimeAlternativeImpl()
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
    return MyDslPackage.Literals.STAR_TIME_ALTERNATIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessStartElements> getMostlyAlternative()
  {
    if (mostlyAlternative == null)
    {
      mostlyAlternative = new EObjectContainmentEList<ProcessStartElements>(ProcessStartElements.class, this, MyDslPackage.STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE);
    }
    return mostlyAlternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessStartElements> getSometimesAlternative()
  {
    if (sometimesAlternative == null)
    {
      sometimesAlternative = new EObjectContainmentEList<ProcessStartElements>(ProcessStartElements.class, this, MyDslPackage.STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE);
    }
    return sometimesAlternative;
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
      case MyDslPackage.STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        return ((InternalEList<?>)getMostlyAlternative()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE:
        return ((InternalEList<?>)getSometimesAlternative()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        return getMostlyAlternative();
      case MyDslPackage.STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE:
        return getSometimesAlternative();
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
      case MyDslPackage.STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        getMostlyAlternative().clear();
        getMostlyAlternative().addAll((Collection<? extends ProcessStartElements>)newValue);
        return;
      case MyDslPackage.STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE:
        getSometimesAlternative().clear();
        getSometimesAlternative().addAll((Collection<? extends ProcessStartElements>)newValue);
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
      case MyDslPackage.STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        getMostlyAlternative().clear();
        return;
      case MyDslPackage.STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE:
        getSometimesAlternative().clear();
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
      case MyDslPackage.STAR_TIME_ALTERNATIVE__MOSTLY_ALTERNATIVE:
        return mostlyAlternative != null && !mostlyAlternative.isEmpty();
      case MyDslPackage.STAR_TIME_ALTERNATIVE__SOMETIMES_ALTERNATIVE:
        return sometimesAlternative != null && !sometimesAlternative.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StarTimeAlternativeImpl
