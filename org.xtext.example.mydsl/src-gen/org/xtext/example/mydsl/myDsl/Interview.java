/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Interview#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Interview#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Interview#getMainrole <em>Mainrole</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Interview#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Interview#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInterview()
 * @model
 * @generated
 */
public interface Interview extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInterview_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Interview#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInterview_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Interview#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mainrole</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mainrole</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mainrole</em>' containment reference.
   * @see #setMainrole(Role)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInterview_Mainrole()
   * @model containment="true"
   * @generated
   */
  Role getMainrole();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Interview#getMainrole <em>Mainrole</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mainrole</em>' containment reference.
   * @see #getMainrole()
   * @generated
   */
  void setMainrole(Role value);

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInterview_Objects()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.mydsl.myDsl.Object> getObjects();

  /**
   * Returns the value of the '<em><b>Process</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.BusinessProcess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInterview_Process()
   * @model containment="true"
   * @generated
   */
  EList<BusinessProcess> getProcess();

} // Interview
