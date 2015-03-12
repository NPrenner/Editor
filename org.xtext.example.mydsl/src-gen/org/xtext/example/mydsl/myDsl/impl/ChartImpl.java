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

import org.xtext.example.mydsl.myDsl.Chart;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ProcessChartElements;
import org.xtext.example.mydsl.myDsl.ProcessElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ChartImpl#getStartElements <em>Start Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ChartImpl#getFollowedElements <em>Followed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChartImpl extends ProcessStartElementsImpl implements Chart
{
  /**
   * The cached value of the '{@link #getStartElements() <em>Start Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartElements()
   * @generated
   * @ordered
   */
  protected EList<ProcessChartElements> startElements;

  /**
   * The cached value of the '{@link #getFollowedElements() <em>Followed Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowedElements()
   * @generated
   * @ordered
   */
  protected EList<ProcessElements> followedElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChartImpl()
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
    return MyDslPackage.Literals.CHART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessChartElements> getStartElements()
  {
    if (startElements == null)
    {
      startElements = new EObjectContainmentEList<ProcessChartElements>(ProcessChartElements.class, this, MyDslPackage.CHART__START_ELEMENTS);
    }
    return startElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessElements> getFollowedElements()
  {
    if (followedElements == null)
    {
      followedElements = new EObjectContainmentEList<ProcessElements>(ProcessElements.class, this, MyDslPackage.CHART__FOLLOWED_ELEMENTS);
    }
    return followedElements;
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
      case MyDslPackage.CHART__START_ELEMENTS:
        return ((InternalEList<?>)getStartElements()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CHART__FOLLOWED_ELEMENTS:
        return ((InternalEList<?>)getFollowedElements()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CHART__START_ELEMENTS:
        return getStartElements();
      case MyDslPackage.CHART__FOLLOWED_ELEMENTS:
        return getFollowedElements();
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
      case MyDslPackage.CHART__START_ELEMENTS:
        getStartElements().clear();
        getStartElements().addAll((Collection<? extends ProcessChartElements>)newValue);
        return;
      case MyDslPackage.CHART__FOLLOWED_ELEMENTS:
        getFollowedElements().clear();
        getFollowedElements().addAll((Collection<? extends ProcessElements>)newValue);
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
      case MyDslPackage.CHART__START_ELEMENTS:
        getStartElements().clear();
        return;
      case MyDslPackage.CHART__FOLLOWED_ELEMENTS:
        getFollowedElements().clear();
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
      case MyDslPackage.CHART__START_ELEMENTS:
        return startElements != null && !startElements.isEmpty();
      case MyDslPackage.CHART__FOLLOWED_ELEMENTS:
        return followedElements != null && !followedElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChartImpl
