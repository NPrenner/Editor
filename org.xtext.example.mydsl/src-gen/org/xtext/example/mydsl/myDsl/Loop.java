/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Loop#getUncounter <em>Uncounter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Loop#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Loop#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends ProcessElements
{
  /**
   * Returns the value of the '<em><b>Uncounter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uncounter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uncounter</em>' attribute.
   * @see #setUncounter(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoop_Uncounter()
   * @model
   * @generated
   */
  String getUncounter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Loop#getUncounter <em>Uncounter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uncounter</em>' attribute.
   * @see #getUncounter()
   * @generated
   */
  void setUncounter(String value);

  /**
   * Returns the value of the '<em><b>Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Counter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Counter</em>' attribute.
   * @see #setCounter(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoop_Counter()
   * @model
   * @generated
   */
  int getCounter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Loop#getCounter <em>Counter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Counter</em>' attribute.
   * @see #getCounter()
   * @generated
   */
  void setCounter(int value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProcessElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoop_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ProcessElements> getElements();

} // Loop
