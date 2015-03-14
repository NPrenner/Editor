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
 *   <li>{@link org.xtext.example.mydsl.myDsl.Role#getRolekind <em>Rolekind</em>}</li>
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
   * Returns the value of the '<em><b>Rolekind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rolekind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rolekind</em>' attribute.
   * @see #setRolekind(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRole_Rolekind()
   * @model
   * @generated
   */
  String getRolekind();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Role#getRolekind <em>Rolekind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolekind</em>' attribute.
   * @see #getRolekind()
   * @generated
   */
  void setRolekind(String value);

} // Role
