/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Chart#getStartElements <em>Start Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Chart#getFollowedElements <em>Followed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends ProcessStartElements
{
  /**
   * Returns the value of the '<em><b>Start Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessChartElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getChart_StartElements()
   * @model containment="true"
   * @generated
   */
  EList<ProcessChartElements> getStartElements();

  /**
   * Returns the value of the '<em><b>Followed Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Followed Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Followed Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getChart_FollowedElements()
   * @model containment="true"
   * @generated
   */
  EList<ProcessElements> getFollowedElements();

} // Chart
