/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataQuery#isExclamation <em>Exclamation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataQuery#getObjectOne <em>Object One</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataQuery#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DataQuery#getObjectTwo <em>Object Two</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataQuery()
 * @model
 * @generated
 */
public interface DataQuery extends Query
{
  /**
   * Returns the value of the '<em><b>Exclamation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclamation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclamation</em>' attribute.
   * @see #setExclamation(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataQuery_Exclamation()
   * @model
   * @generated
   */
  boolean isExclamation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataQuery#isExclamation <em>Exclamation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclamation</em>' attribute.
   * @see #isExclamation()
   * @generated
   */
  void setExclamation(boolean value);

  /**
   * Returns the value of the '<em><b>Object One</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object One</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object One</em>' reference.
   * @see #setObjectOne(org.xtext.example.mydsl.myDsl.Object)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataQuery_ObjectOne()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Object getObjectOne();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataQuery#getObjectOne <em>Object One</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object One</em>' reference.
   * @see #getObjectOne()
   * @generated
   */
  void setObjectOne(org.xtext.example.mydsl.myDsl.Object value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataQuery_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataQuery#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Object Two</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Two</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Two</em>' reference.
   * @see #setObjectTwo(org.xtext.example.mydsl.myDsl.Object)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDataQuery_ObjectTwo()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Object getObjectTwo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DataQuery#getObjectTwo <em>Object Two</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Two</em>' reference.
   * @see #getObjectTwo()
   * @generated
   */
  void setObjectTwo(org.xtext.example.mydsl.myDsl.Object value);

} // DataQuery
