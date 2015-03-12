/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BooleanQuery#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BooleanQuery#getBoolean <em>Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBooleanQuery()
 * @model
 * @generated
 */
public interface BooleanQuery extends Query
{
  /**
   * Returns the value of the '<em><b>Boolean Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Value</em>' reference.
   * @see #setBooleanValue(org.xtext.example.mydsl.myDsl.Boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBooleanQuery_BooleanValue()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Boolean getBooleanValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BooleanQuery#getBooleanValue <em>Boolean Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Value</em>' reference.
   * @see #getBooleanValue()
   * @generated
   */
  void setBooleanValue(org.xtext.example.mydsl.myDsl.Boolean value);

  /**
   * Returns the value of the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean</em>' attribute.
   * @see #setBoolean(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBooleanQuery_Boolean()
   * @model
   * @generated
   */
  String getBoolean();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BooleanQuery#getBoolean <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean</em>' attribute.
   * @see #getBoolean()
   * @generated
   */
  void setBoolean(String value);

} // BooleanQuery
