/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemwork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Systemwork#getReturnObject <em>Return Object</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Systemwork#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Systemwork#getPlayer <em>Player</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Systemwork#getExecution <em>Execution</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Systemwork#getSystem <em>System</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Systemwork#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Systemwork#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork()
 * @model
 * @generated
 */
public interface Systemwork extends ProcessElements, ProcessChartElements
{
  /**
   * Returns the value of the '<em><b>Return Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Object</em>' reference.
   * @see #setReturnObject(org.xtext.example.mydsl.myDsl.Object)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork_ReturnObject()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Object getReturnObject();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Systemwork#getReturnObject <em>Return Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Object</em>' reference.
   * @see #getReturnObject()
   * @generated
   */
  void setReturnObject(org.xtext.example.mydsl.myDsl.Object value);

  /**
   * Returns the value of the '<em><b>Importance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance</em>' attribute.
   * @see #setImportance(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork_Importance()
   * @model
   * @generated
   */
  String getImportance();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Systemwork#getImportance <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance</em>' attribute.
   * @see #getImportance()
   * @generated
   */
  void setImportance(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork_Player()
   * @model
   * @generated
   */
  Role getPlayer();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Systemwork#getPlayer <em>Player</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Player</em>' reference.
   * @see #getPlayer()
   * @generated
   */
  void setPlayer(Role value);

  /**
   * Returns the value of the '<em><b>Execution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution</em>' attribute.
   * @see #setExecution(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork_Execution()
   * @model
   * @generated
   */
  String getExecution();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Systemwork#getExecution <em>Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution</em>' attribute.
   * @see #getExecution()
   * @generated
   */
  void setExecution(String value);

  /**
   * Returns the value of the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' reference.
   * @see #setSystem(org.xtext.example.mydsl.myDsl.System)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork_System()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.System getSystem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Systemwork#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(org.xtext.example.mydsl.myDsl.System value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(Function)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork_Function()
   * @model
   * @generated
   */
  Function getFunction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Systemwork#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Function value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemwork_Parameter()
   * @model
   * @generated
   */
  EList<org.xtext.example.mydsl.myDsl.Object> getParameter();

} // Systemwork
