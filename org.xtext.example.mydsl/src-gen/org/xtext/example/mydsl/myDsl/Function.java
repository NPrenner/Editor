/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Function#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Function#isReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Function#getReturnArgument <em>Return Argument</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Function#getReturnBool <em>Return Bool</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunction_Parameter()
   * @model
   * @generated
   */
  EList<Parameter> getParameter();

  /**
   * Returns the value of the '<em><b>Return Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' attribute.
   * @see #setReturnValue(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunction_ReturnValue()
   * @model
   * @generated
   */
  boolean isReturnValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Function#isReturnValue <em>Return Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' attribute.
   * @see #isReturnValue()
   * @generated
   */
  void setReturnValue(boolean value);

  /**
   * Returns the value of the '<em><b>Return Argument</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Argument</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Argument</em>' reference.
   * @see #setReturnArgument(TypeDefinition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunction_ReturnArgument()
   * @model
   * @generated
   */
  TypeDefinition getReturnArgument();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Function#getReturnArgument <em>Return Argument</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Argument</em>' reference.
   * @see #getReturnArgument()
   * @generated
   */
  void setReturnArgument(TypeDefinition value);

  /**
   * Returns the value of the '<em><b>Return Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Bool</em>' attribute.
   * @see #setReturnBool(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunction_ReturnBool()
   * @model
   * @generated
   */
  String getReturnBool();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Function#getReturnBool <em>Return Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Bool</em>' attribute.
   * @see #getReturnBool()
   * @generated
   */
  void setReturnBool(String value);

} // Function
