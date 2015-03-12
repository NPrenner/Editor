/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Communication#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Communication#getSender <em>Sender</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Communication#getExecution <em>Execution</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Communication#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Communication#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Communication#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Communication#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends ProcessElements, ProcessChartElements
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication_Importance()
   * @model
   * @generated
   */
  String getImportance();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Communication#getImportance <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance</em>' attribute.
   * @see #getImportance()
   * @generated
   */
  void setImportance(String value);

  /**
   * Returns the value of the '<em><b>Sender</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' reference.
   * @see #setSender(org.xtext.example.mydsl.myDsl.Object)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication_Sender()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Object getSender();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Communication#getSender <em>Sender</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' reference.
   * @see #getSender()
   * @generated
   */
  void setSender(org.xtext.example.mydsl.myDsl.Object value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication_Execution()
   * @model
   * @generated
   */
  String getExecution();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Communication#getExecution <em>Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution</em>' attribute.
   * @see #getExecution()
   * @generated
   */
  void setExecution(String value);

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' reference.
   * @see #setReceiver(Role)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication_Receiver()
   * @model
   * @generated
   */
  Role getReceiver();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Communication#getReceiver <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(Role value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' reference.
   * @see #setMessage(Message)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication_Message()
   * @model
   * @generated
   */
  Message getMessage();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Communication#getMessage <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(Message value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication_Parameter()
   * @model
   * @generated
   */
  EList<org.xtext.example.mydsl.myDsl.Object> getParameter();

  /**
   * Returns the value of the '<em><b>Channel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' reference.
   * @see #setChannel(ChannelDefintion)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommunication_Channel()
   * @model
   * @generated
   */
  ChannelDefintion getChannel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Communication#getChannel <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' reference.
   * @see #getChannel()
   * @generated
   */
  void setChannel(ChannelDefintion value);

} // Communication
