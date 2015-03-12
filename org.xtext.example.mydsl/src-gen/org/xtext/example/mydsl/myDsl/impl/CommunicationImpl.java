/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.ChannelDefintion;
import org.xtext.example.mydsl.myDsl.Communication;
import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommunicationImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationImpl extends ProcessElementsImpl implements Communication
{
  /**
   * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected static final String IMPORTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected String importance = IMPORTANCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected org.xtext.example.mydsl.myDsl.Object sender;

  /**
   * The default value of the '{@link #getExecution() <em>Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecution()
   * @generated
   * @ordered
   */
  protected static final String EXECUTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecution()
   * @generated
   * @ordered
   */
  protected String execution = EXECUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected Role receiver;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected Message message;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.mydsl.myDsl.Object> parameter;

  /**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected ChannelDefintion channel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommunicationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.COMMUNICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportance()
  {
    return importance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportance(String newImportance)
  {
    String oldImportance = importance;
    importance = newImportance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMUNICATION__IMPORTANCE, oldImportance, importance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object getSender()
  {
    if (sender != null && sender.eIsProxy())
    {
      InternalEObject oldSender = (InternalEObject)sender;
      sender = (org.xtext.example.mydsl.myDsl.Object)eResolveProxy(oldSender);
      if (sender != oldSender)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMMUNICATION__SENDER, oldSender, sender));
      }
    }
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Object basicGetSender()
  {
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSender(org.xtext.example.mydsl.myDsl.Object newSender)
  {
    org.xtext.example.mydsl.myDsl.Object oldSender = sender;
    sender = newSender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMUNICATION__SENDER, oldSender, sender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExecution()
  {
    return execution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecution(String newExecution)
  {
    String oldExecution = execution;
    execution = newExecution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMUNICATION__EXECUTION, oldExecution, execution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getReceiver()
  {
    if (receiver != null && receiver.eIsProxy())
    {
      InternalEObject oldReceiver = (InternalEObject)receiver;
      receiver = (Role)eResolveProxy(oldReceiver);
      if (receiver != oldReceiver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMMUNICATION__RECEIVER, oldReceiver, receiver));
      }
    }
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(Role newReceiver)
  {
    Role oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMUNICATION__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getMessage()
  {
    if (message != null && message.eIsProxy())
    {
      InternalEObject oldMessage = (InternalEObject)message;
      message = (Message)eResolveProxy(oldMessage);
      if (message != oldMessage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMMUNICATION__MESSAGE, oldMessage, message));
      }
    }
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message basicGetMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(Message newMessage)
  {
    Message oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMUNICATION__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.mydsl.myDsl.Object> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectResolvingEList<org.xtext.example.mydsl.myDsl.Object>(org.xtext.example.mydsl.myDsl.Object.class, this, MyDslPackage.COMMUNICATION__PARAMETER);
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelDefintion getChannel()
  {
    if (channel != null && channel.eIsProxy())
    {
      InternalEObject oldChannel = (InternalEObject)channel;
      channel = (ChannelDefintion)eResolveProxy(oldChannel);
      if (channel != oldChannel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMMUNICATION__CHANNEL, oldChannel, channel));
      }
    }
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelDefintion basicGetChannel()
  {
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannel(ChannelDefintion newChannel)
  {
    ChannelDefintion oldChannel = channel;
    channel = newChannel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMUNICATION__CHANNEL, oldChannel, channel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMUNICATION__IMPORTANCE:
        return getImportance();
      case MyDslPackage.COMMUNICATION__SENDER:
        if (resolve) return getSender();
        return basicGetSender();
      case MyDslPackage.COMMUNICATION__EXECUTION:
        return getExecution();
      case MyDslPackage.COMMUNICATION__RECEIVER:
        if (resolve) return getReceiver();
        return basicGetReceiver();
      case MyDslPackage.COMMUNICATION__MESSAGE:
        if (resolve) return getMessage();
        return basicGetMessage();
      case MyDslPackage.COMMUNICATION__PARAMETER:
        return getParameter();
      case MyDslPackage.COMMUNICATION__CHANNEL:
        if (resolve) return getChannel();
        return basicGetChannel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMUNICATION__IMPORTANCE:
        setImportance((String)newValue);
        return;
      case MyDslPackage.COMMUNICATION__SENDER:
        setSender((org.xtext.example.mydsl.myDsl.Object)newValue);
        return;
      case MyDslPackage.COMMUNICATION__EXECUTION:
        setExecution((String)newValue);
        return;
      case MyDslPackage.COMMUNICATION__RECEIVER:
        setReceiver((Role)newValue);
        return;
      case MyDslPackage.COMMUNICATION__MESSAGE:
        setMessage((Message)newValue);
        return;
      case MyDslPackage.COMMUNICATION__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends org.xtext.example.mydsl.myDsl.Object>)newValue);
        return;
      case MyDslPackage.COMMUNICATION__CHANNEL:
        setChannel((ChannelDefintion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMUNICATION__IMPORTANCE:
        setImportance(IMPORTANCE_EDEFAULT);
        return;
      case MyDslPackage.COMMUNICATION__SENDER:
        setSender((org.xtext.example.mydsl.myDsl.Object)null);
        return;
      case MyDslPackage.COMMUNICATION__EXECUTION:
        setExecution(EXECUTION_EDEFAULT);
        return;
      case MyDslPackage.COMMUNICATION__RECEIVER:
        setReceiver((Role)null);
        return;
      case MyDslPackage.COMMUNICATION__MESSAGE:
        setMessage((Message)null);
        return;
      case MyDslPackage.COMMUNICATION__PARAMETER:
        getParameter().clear();
        return;
      case MyDslPackage.COMMUNICATION__CHANNEL:
        setChannel((ChannelDefintion)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMUNICATION__IMPORTANCE:
        return IMPORTANCE_EDEFAULT == null ? importance != null : !IMPORTANCE_EDEFAULT.equals(importance);
      case MyDslPackage.COMMUNICATION__SENDER:
        return sender != null;
      case MyDslPackage.COMMUNICATION__EXECUTION:
        return EXECUTION_EDEFAULT == null ? execution != null : !EXECUTION_EDEFAULT.equals(execution);
      case MyDslPackage.COMMUNICATION__RECEIVER:
        return receiver != null;
      case MyDslPackage.COMMUNICATION__MESSAGE:
        return message != null;
      case MyDslPackage.COMMUNICATION__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case MyDslPackage.COMMUNICATION__CHANNEL:
        return channel != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (importance: ");
    result.append(importance);
    result.append(", execution: ");
    result.append(execution);
    result.append(')');
    return result.toString();
  }

} //CommunicationImpl
