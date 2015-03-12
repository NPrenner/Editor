/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Role#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends org.xtext.example.mydsl.myDsl.Object
{
  /**
   * Returns the value of the '<em><b>Role Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Type</em>' attribute.
   * @see #setRoleType(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRole_RoleType()
   * @model
   * @generated
   */
  String getRoleType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Role#getRoleType <em>Role Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role Type</em>' attribute.
   * @see #getRoleType()
   * @generated
   */
  void setRoleType(String value);

} // Role
