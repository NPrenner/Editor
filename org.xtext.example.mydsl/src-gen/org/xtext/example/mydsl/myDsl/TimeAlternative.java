/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TimeAlternative#getMostlyAlternative <em>Mostly Alternative</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TimeAlternative#getSometimeAlternative <em>Sometime Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTimeAlternative()
 * @model
 * @generated
 */
public interface TimeAlternative extends ProcessElements, ProcessChartElements
{
  /**
   * Returns the value of the '<em><b>Mostly Alternative</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mostly Alternative</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mostly Alternative</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTimeAlternative_MostlyAlternative()
   * @model containment="true"
   * @generated
   */
  EList<ProcessElements> getMostlyAlternative();

  /**
   * Returns the value of the '<em><b>Sometime Alternative</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sometime Alternative</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sometime Alternative</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTimeAlternative_SometimeAlternative()
   * @model containment="true"
   * @generated
   */
  EList<ProcessElements> getSometimeAlternative();

} // TimeAlternative
