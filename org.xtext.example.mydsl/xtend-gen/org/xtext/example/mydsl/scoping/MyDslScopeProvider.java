/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.scoping;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.xtext.example.mydsl.myDsl.Activity;
import org.xtext.example.mydsl.myDsl.Communication;
import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.Interview;
import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.RoleQuery;
import org.xtext.example.mydsl.myDsl.Roletype;
import org.xtext.example.mydsl.myDsl.State;
import org.xtext.example.mydsl.myDsl.Systemtype;
import org.xtext.example.mydsl.myDsl.Systemwork;
import org.xtext.example.mydsl.myDsl.Task;
import org.xtext.example.mydsl.myDsl.TypeDefinition;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class MyDslScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_Communication_message(final Communication communication, final EReference ref) {
    final ArrayList<Message> scope = new ArrayList<Message>();
    Role _receiver = communication.getReceiver();
    TypeDefinition _type = _receiver.getType();
    Roletype role = ((Roletype) _type);
    EList<Message> _messages = role.getMessages();
    scope.addAll(_messages);
    return Scopes.scopeFor(scope);
  }
  
  public IScope scope_Commuincation_parameter(final Communication communication, final EReference ref) {
    final ArrayList<org.xtext.example.mydsl.myDsl.Object> scope = new ArrayList<org.xtext.example.mydsl.myDsl.Object>();
    EObject _eContainer = communication.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    final Interview interview = ((Interview) _eContainer_1);
    Role _mainrole = interview.getMainrole();
    scope.add(((org.xtext.example.mydsl.myDsl.Object) _mainrole));
    EList<org.xtext.example.mydsl.myDsl.Object> _objects = interview.getObjects();
    scope.addAll(_objects);
    return Scopes.scopeFor(scope);
  }
  
  public IScope scope_Activity_parameter(final Activity activity, final EReference ref) {
    final ArrayList<org.xtext.example.mydsl.myDsl.Object> scope = new ArrayList<org.xtext.example.mydsl.myDsl.Object>();
    EObject _eContainer = activity.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    final Interview interview = ((Interview) _eContainer_1);
    EList<org.xtext.example.mydsl.myDsl.Object> _objects = interview.getObjects();
    scope.addAll(_objects);
    return Scopes.scopeFor(scope);
  }
  
  public IScope scope_Activity_task(final Activity activity, final EReference ref) {
    final ArrayList<Task> scope = new ArrayList<Task>();
    Role _role = activity.getRole();
    TypeDefinition _type = _role.getType();
    Roletype role = ((Roletype) _type);
    EList<Task> _tasks = role.getTasks();
    scope.addAll(_tasks);
    return Scopes.scopeFor(scope);
  }
  
  public IScope scope_RoleQuery_state(final RoleQuery query, final EReference ref) {
    final ArrayList<State> scope = new ArrayList<State>();
    Role _player = query.getPlayer();
    TypeDefinition _type = _player.getType();
    Roletype role = ((Roletype) _type);
    EList<State> _state = role.getState();
    scope.addAll(_state);
    return Scopes.scopeFor(scope);
  }
  
  public IScope scope_Systemwork_function(final Systemwork systemActivity, final EReference ref) {
    final ArrayList<Function> scope = new ArrayList<Function>();
    org.xtext.example.mydsl.myDsl.System _system = systemActivity.getSystem();
    TypeDefinition _type = _system.getType();
    Systemtype system = ((Systemtype) _type);
    EList<Function> _functions = system.getFunctions();
    scope.addAll(_functions);
    return Scopes.scopeFor(scope);
  }
}
