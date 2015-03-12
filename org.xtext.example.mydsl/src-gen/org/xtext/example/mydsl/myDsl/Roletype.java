/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roletype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Roletype#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Roletype#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Roletype#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoletype()
 * @model
 * @generated
 */
public interface Roletype extends TypeDefinition
{
  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoletype_State()
   * @model containment="true"
   * @generated
   */
  EList<State> getState();

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoletype_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getTasks();

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Message}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoletype_Messages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessages();

} // Roletype
