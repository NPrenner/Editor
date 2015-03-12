/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star Time Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.StarTimeAlternative#getMostlyAlternative <em>Mostly Alternative</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.StarTimeAlternative#getSometimesAlternative <em>Sometimes Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStarTimeAlternative()
 * @model
 * @generated
 */
public interface StarTimeAlternative extends StartTimeAlternative
{
  /**
   * Returns the value of the '<em><b>Mostly Alternative</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessStartElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mostly Alternative</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mostly Alternative</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStarTimeAlternative_MostlyAlternative()
   * @model containment="true"
   * @generated
   */
  EList<ProcessStartElements> getMostlyAlternative();

  /**
   * Returns the value of the '<em><b>Sometimes Alternative</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessStartElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sometimes Alternative</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sometimes Alternative</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStarTimeAlternative_SometimesAlternative()
   * @model containment="true"
   * @generated
   */
  EList<ProcessStartElements> getSometimesAlternative();

} // StarTimeAlternative
