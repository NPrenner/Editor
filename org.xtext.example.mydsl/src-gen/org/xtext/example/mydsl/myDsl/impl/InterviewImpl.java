/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.BusinessProcess;
import org.xtext.example.mydsl.myDsl.Interview;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InterviewImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InterviewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InterviewImpl#getMainrole <em>Mainrole</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InterviewImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InterviewImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterviewImpl extends MinimalEObjectImpl.Container implements Interview
{
  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMainrole() <em>Mainrole</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainrole()
   * @generated
   * @ordered
   */
  protected Role mainrole;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<org.xtext.example.mydsl.myDsl.Object> objects;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected EList<BusinessProcess> process;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterviewImpl()
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
    return MyDslPackage.Literals.INTERVIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERVIEW__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERVIEW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getMainrole()
  {
    return mainrole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainrole(Role newMainrole, NotificationChain msgs)
  {
    Role oldMainrole = mainrole;
    mainrole = newMainrole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERVIEW__MAINROLE, oldMainrole, newMainrole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainrole(Role newMainrole)
  {
    if (newMainrole != mainrole)
    {
      NotificationChain msgs = null;
      if (mainrole != null)
        msgs = ((InternalEObject)mainrole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERVIEW__MAINROLE, null, msgs);
      if (newMainrole != null)
        msgs = ((InternalEObject)newMainrole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INTERVIEW__MAINROLE, null, msgs);
      msgs = basicSetMainrole(newMainrole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INTERVIEW__MAINROLE, newMainrole, newMainrole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.xtext.example.mydsl.myDsl.Object> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<org.xtext.example.mydsl.myDsl.Object>(org.xtext.example.mydsl.myDsl.Object.class, this, MyDslPackage.INTERVIEW__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BusinessProcess> getProcess()
  {
    if (process == null)
    {
      process = new EObjectContainmentEList<BusinessProcess>(BusinessProcess.class, this, MyDslPackage.INTERVIEW__PROCESS);
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.INTERVIEW__MAINROLE:
        return basicSetMainrole(null, msgs);
      case MyDslPackage.INTERVIEW__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
      case MyDslPackage.INTERVIEW__PROCESS:
        return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslPackage.INTERVIEW__PACKAGE:
        return getPackage();
      case MyDslPackage.INTERVIEW__NAME:
        return getName();
      case MyDslPackage.INTERVIEW__MAINROLE:
        return getMainrole();
      case MyDslPackage.INTERVIEW__OBJECTS:
        return getObjects();
      case MyDslPackage.INTERVIEW__PROCESS:
        return getProcess();
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
      case MyDslPackage.INTERVIEW__PACKAGE:
        setPackage((String)newValue);
        return;
      case MyDslPackage.INTERVIEW__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.INTERVIEW__MAINROLE:
        setMainrole((Role)newValue);
        return;
      case MyDslPackage.INTERVIEW__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends org.xtext.example.mydsl.myDsl.Object>)newValue);
        return;
      case MyDslPackage.INTERVIEW__PROCESS:
        getProcess().clear();
        getProcess().addAll((Collection<? extends BusinessProcess>)newValue);
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
      case MyDslPackage.INTERVIEW__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case MyDslPackage.INTERVIEW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.INTERVIEW__MAINROLE:
        setMainrole((Role)null);
        return;
      case MyDslPackage.INTERVIEW__OBJECTS:
        getObjects().clear();
        return;
      case MyDslPackage.INTERVIEW__PROCESS:
        getProcess().clear();
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
      case MyDslPackage.INTERVIEW__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case MyDslPackage.INTERVIEW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.INTERVIEW__MAINROLE:
        return mainrole != null;
      case MyDslPackage.INTERVIEW__OBJECTS:
        return objects != null && !objects.isEmpty();
      case MyDslPackage.INTERVIEW__PROCESS:
        return process != null && !process.isEmpty();
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
    result.append(" (package: ");
    result.append(package_);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InterviewImpl
