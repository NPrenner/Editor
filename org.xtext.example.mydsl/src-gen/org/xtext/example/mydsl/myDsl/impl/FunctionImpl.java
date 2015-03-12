/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.lang.Boolean;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FunctionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FunctionImpl#isReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FunctionImpl#getReturnArgument <em>Return Argument</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FunctionImpl#getReturnBool <em>Return Bool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
{
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
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameter;

  /**
   * The default value of the '{@link #isReturnValue() <em>Return Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnValue()
   * @generated
   * @ordered
   */
  protected static final boolean RETURN_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReturnValue() <em>Return Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnValue()
   * @generated
   * @ordered
   */
  protected boolean returnValue = RETURN_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnArgument() <em>Return Argument</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnArgument()
   * @generated
   * @ordered
   */
  protected TypeDefinition returnArgument;

  /**
   * The default value of the '{@link #getReturnBool() <em>Return Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnBool()
   * @generated
   * @ordered
   */
  protected static final String RETURN_BOOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnBool() <em>Return Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnBool()
   * @generated
   * @ordered
   */
  protected String returnBool = RETURN_BOOL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return MyDslPackage.Literals.FUNCTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, MyDslPackage.FUNCTION__PARAMETER);
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReturnValue()
  {
    return returnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnValue(boolean newReturnValue)
  {
    boolean oldReturnValue = returnValue;
    returnValue = newReturnValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__RETURN_VALUE, oldReturnValue, returnValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition getReturnArgument()
  {
    if (returnArgument != null && returnArgument.eIsProxy())
    {
      InternalEObject oldReturnArgument = (InternalEObject)returnArgument;
      returnArgument = (TypeDefinition)eResolveProxy(oldReturnArgument);
      if (returnArgument != oldReturnArgument)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.FUNCTION__RETURN_ARGUMENT, oldReturnArgument, returnArgument));
      }
    }
    return returnArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition basicGetReturnArgument()
  {
    return returnArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnArgument(TypeDefinition newReturnArgument)
  {
    TypeDefinition oldReturnArgument = returnArgument;
    returnArgument = newReturnArgument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__RETURN_ARGUMENT, oldReturnArgument, returnArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnBool()
  {
    return returnBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnBool(String newReturnBool)
  {
    String oldReturnBool = returnBool;
    returnBool = newReturnBool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__RETURN_BOOL, oldReturnBool, returnBool));
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
      case MyDslPackage.FUNCTION__NAME:
        return getName();
      case MyDslPackage.FUNCTION__PARAMETER:
        return getParameter();
      case MyDslPackage.FUNCTION__RETURN_VALUE:
        return isReturnValue();
      case MyDslPackage.FUNCTION__RETURN_ARGUMENT:
        if (resolve) return getReturnArgument();
        return basicGetReturnArgument();
      case MyDslPackage.FUNCTION__RETURN_BOOL:
        return getReturnBool();
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
      case MyDslPackage.FUNCTION__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.FUNCTION__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends Parameter>)newValue);
        return;
      case MyDslPackage.FUNCTION__RETURN_VALUE:
        setReturnValue((Boolean)newValue);
        return;
      case MyDslPackage.FUNCTION__RETURN_ARGUMENT:
        setReturnArgument((TypeDefinition)newValue);
        return;
      case MyDslPackage.FUNCTION__RETURN_BOOL:
        setReturnBool((String)newValue);
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
      case MyDslPackage.FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.FUNCTION__PARAMETER:
        getParameter().clear();
        return;
      case MyDslPackage.FUNCTION__RETURN_VALUE:
        setReturnValue(RETURN_VALUE_EDEFAULT);
        return;
      case MyDslPackage.FUNCTION__RETURN_ARGUMENT:
        setReturnArgument((TypeDefinition)null);
        return;
      case MyDslPackage.FUNCTION__RETURN_BOOL:
        setReturnBool(RETURN_BOOL_EDEFAULT);
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
      case MyDslPackage.FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.FUNCTION__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case MyDslPackage.FUNCTION__RETURN_VALUE:
        return returnValue != RETURN_VALUE_EDEFAULT;
      case MyDslPackage.FUNCTION__RETURN_ARGUMENT:
        return returnArgument != null;
      case MyDslPackage.FUNCTION__RETURN_BOOL:
        return RETURN_BOOL_EDEFAULT == null ? returnBool != null : !RETURN_BOOL_EDEFAULT.equals(returnBool);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", returnValue: ");
    result.append(returnValue);
    result.append(", returnBool: ");
    result.append(returnBool);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl
