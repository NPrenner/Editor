/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getStatus <em>Status</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getBoolean <em>Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlayerQuery()
 * @model
 * @generated
 */
public interface PlayerQuery extends Query
{
  /**
   * Returns the value of the '<em><b>Player</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Player</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Player</em>' reference.
   * @see #setPlayer(Role)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlayerQuery_Player()
   * @model
   * @generated
   */
  Role getPlayer();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getPlayer <em>Player</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Player</em>' reference.
   * @see #getPlayer()
   * @generated
   */
  void setPlayer(Role value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' reference.
   * @see #setStatus(State)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlayerQuery_Status()
   * @model
   * @generated
   */
  State getStatus();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getStatus <em>Status</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' reference.
   * @see #getStatus()
   * @generated
   */
  void setStatus(State value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPlayerQuery_Boolean()
   * @model
   * @generated
   */
  String getBoolean();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PlayerQuery#getBoolean <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean</em>' attribute.
   * @see #getBoolean()
   * @generated
   */
  void setBoolean(String value);

} // PlayerQuery
