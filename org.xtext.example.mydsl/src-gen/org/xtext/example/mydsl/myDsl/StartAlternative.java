/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.StartAlternative#getAlternative <em>Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStartAlternative()
 * @model
 * @generated
 */
public interface StartAlternative extends ProcessStartElements
{
  /**
   * Returns the value of the '<em><b>Alternative</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessStartElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStartAlternative_Alternative()
   * @model containment="true"
   * @generated
   */
  EList<ProcessStartElements> getAlternative();

} // StartAlternative
