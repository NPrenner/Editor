/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui.contentassist;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.example.mydsl.myDsl.Activity;
import org.xtext.example.mydsl.myDsl.Communication;
import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.Message;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Role;
import org.xtext.example.mydsl.myDsl.Roletype;
import org.xtext.example.mydsl.myDsl.Systemtype;
import org.xtext.example.mydsl.myDsl.Systemwork;
import org.xtext.example.mydsl.myDsl.Task;
import org.xtext.example.mydsl.myDsl.TypeDefinition;
import org.xtext.example.mydsl.ui.contentassist.AbstractMyDslProposalProvider;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class MyDslProposalProvider extends AbstractMyDslProposalProvider {
  public void completeCommunication_Message(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final Communication communication = ((Communication) model);
    Role _receiver = communication.getReceiver();
    TypeDefinition _type = _receiver.getType();
    Roletype receiver = ((Roletype) _type);
    for (int n = 0; (n < ((Object[])Conversions.unwrapArray(receiver.getMessages(), Object.class)).length); n++) {
      {
        String paramString = "";
        EList<Message> _messages = receiver.getMessages();
        Message _get = _messages.get(n);
        EList<Parameter> _parameter = _get.getParameter();
        int _length = ((Object[])Conversions.unwrapArray(_parameter, Object.class)).length;
        boolean _notEquals = (_length != 0);
        if (_notEquals) {
          EList<Message> _messages_1 = receiver.getMessages();
          Message _get_1 = _messages_1.get(n);
          EList<Parameter> _parameter_1 = _get_1.getParameter();
          Parameter _get_2 = _parameter_1.get(0);
          TypeDefinition typedef = ((TypeDefinition) _get_2);
          String _name = typedef.getName();
          paramString = _name;
        }
        for (int i = 1; (i < ((Object[])Conversions.unwrapArray(receiver.getMessages().get(n).getParameter(), Object.class)).length); i++) {
          {
            EList<Message> _messages_2 = receiver.getMessages();
            Message _get_3 = _messages_2.get(n);
            EList<Parameter> _parameter_2 = _get_3.getParameter();
            Parameter _get_4 = _parameter_2.get(i);
            TypeDefinition typedef_1 = ((TypeDefinition) _get_4);
            String _name_1 = typedef_1.getName();
            String _plus = ((paramString + " ,") + _name_1);
            paramString = _plus;
          }
        }
        EList<Message> _messages_2 = receiver.getMessages();
        Message _get_3 = _messages_2.get(n);
        String _name_1 = _get_3.getName();
        String _plus = (_name_1 + "(");
        String _plus_1 = (_plus + ")");
        EList<Message> _messages_3 = receiver.getMessages();
        Message _get_4 = _messages_3.get(n);
        String _name_2 = _get_4.getName();
        String _plus_2 = (_name_2 + "(");
        String _plus_3 = (_plus_2 + paramString);
        String _plus_4 = (_plus_3 + ")");
        EList<Message> _messages_4 = receiver.getMessages();
        Message _get_5 = _messages_4.get(n);
        Image _image = this.getImage(_get_5);
        ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_plus_1, _plus_4, _image, context);
        acceptor.accept(_createCompletionProposal);
      }
    }
  }
  
  public void completeActivity_Task(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final Activity activity = ((Activity) model);
    Role _role = activity.getRole();
    TypeDefinition _type = _role.getType();
    Roletype role = ((Roletype) _type);
    for (int n = 0; (n < ((Object[])Conversions.unwrapArray(role.getTasks(), Object.class)).length); n++) {
      {
        String paramString = "";
        EList<Task> _tasks = role.getTasks();
        Task _get = _tasks.get(n);
        EList<Parameter> _parameter = _get.getParameter();
        int _length = ((Object[])Conversions.unwrapArray(_parameter, Object.class)).length;
        boolean _notEquals = (_length != 0);
        if (_notEquals) {
          EList<Task> _tasks_1 = role.getTasks();
          Task _get_1 = _tasks_1.get(n);
          EList<Parameter> _parameter_1 = _get_1.getParameter();
          Parameter _get_2 = _parameter_1.get(0);
          TypeDefinition typedef = ((TypeDefinition) _get_2);
          String _name = typedef.getName();
          paramString = _name;
        }
        for (int i = 1; (i < ((Object[])Conversions.unwrapArray(role.getTasks().get(n).getParameter(), Object.class)).length); i++) {
          {
            EList<Task> _tasks_2 = role.getTasks();
            Task _get_3 = _tasks_2.get(n);
            EList<Parameter> _parameter_2 = _get_3.getParameter();
            Parameter _get_4 = _parameter_2.get(i);
            TypeDefinition typedef_1 = ((TypeDefinition) _get_4);
            String _name_1 = typedef_1.getName();
            String _plus = ((paramString + " ,") + _name_1);
            paramString = _plus;
          }
        }
        EList<Task> _tasks_2 = role.getTasks();
        Task _get_3 = _tasks_2.get(n);
        String _name_1 = _get_3.getName();
        String _plus = (_name_1 + "(");
        String _plus_1 = (_plus + ")");
        EList<Task> _tasks_3 = role.getTasks();
        Task _get_4 = _tasks_3.get(n);
        String _name_2 = _get_4.getName();
        String _plus_2 = (_name_2 + "(");
        String _plus_3 = (_plus_2 + paramString);
        String _plus_4 = (_plus_3 + ")");
        EList<Task> _tasks_4 = role.getTasks();
        Task _get_5 = _tasks_4.get(n);
        Image _image = this.getImage(_get_5);
        ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_plus_1, _plus_4, _image, context);
        acceptor.accept(_createCompletionProposal);
      }
    }
  }
  
  public void completeSystemwork_Function(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final Systemwork systemwork = ((Systemwork) model);
    org.xtext.example.mydsl.myDsl.System _system = systemwork.getSystem();
    TypeDefinition _type = _system.getType();
    Systemtype system = ((Systemtype) _type);
    for (int n = 0; (n < ((Object[])Conversions.unwrapArray(system.getFunctions(), Object.class)).length); n++) {
      {
        String paramString = "";
        EList<Function> _functions = system.getFunctions();
        Function _get = _functions.get(n);
        EList<Parameter> _parameter = _get.getParameter();
        int _length = ((Object[])Conversions.unwrapArray(_parameter, Object.class)).length;
        boolean _notEquals = (_length != 0);
        if (_notEquals) {
          EList<Function> _functions_1 = system.getFunctions();
          Function _get_1 = _functions_1.get(n);
          EList<Parameter> _parameter_1 = _get_1.getParameter();
          Parameter _get_2 = _parameter_1.get(0);
          TypeDefinition typedef = ((TypeDefinition) _get_2);
          String _name = typedef.getName();
          paramString = _name;
        }
        for (int i = 1; (i < ((Object[])Conversions.unwrapArray(system.getFunctions().get(n).getParameter(), Object.class)).length); i++) {
          {
            EList<Function> _functions_2 = system.getFunctions();
            Function _get_3 = _functions_2.get(n);
            EList<Parameter> _parameter_2 = _get_3.getParameter();
            Parameter _get_4 = _parameter_2.get(i);
            TypeDefinition typedef_1 = ((TypeDefinition) _get_4);
            String _name_1 = typedef_1.getName();
            String _plus = ((paramString + " ,") + _name_1);
            paramString = _plus;
          }
        }
        EList<Function> _functions_2 = system.getFunctions();
        Function _get_3 = _functions_2.get(n);
        String _name_1 = _get_3.getName();
        String _plus = (_name_1 + "(");
        String _plus_1 = (_plus + ")");
        EList<Function> _functions_3 = system.getFunctions();
        Function _get_4 = _functions_3.get(n);
        String _name_2 = _get_4.getName();
        String _plus_2 = (_name_2 + "(");
        String _plus_3 = (_plus_2 + paramString);
        String _plus_4 = (_plus_3 + ")");
        EList<Function> _functions_4 = system.getFunctions();
        Function _get_5 = _functions_4.get(n);
        Image _image = this.getImage(_get_5);
        ICompletionProposal _createCompletionProposal = this.createCompletionProposal(_plus_1, _plus_4, _image, context);
        acceptor.accept(_createCompletionProposal);
      }
    }
  }
  
  public void completeBusinessProcess_Element(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Image _image = this.getImage(model);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("start{\n \t \n\t } followed{ \n\t \n\t }", "start{} followed{}", _image, context);
    acceptor.accept(_createCompletionProposal);
    Image _image_1 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("mostly{\n \t \n\t } sometimes{ \n\t \n\t }", "mostly{} sometimes{}", _image_1, context);
    acceptor.accept(_createCompletionProposal_1);
    Image _image_2 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("alt{\n \t \n\t } or{ \n\t \n\t }", "alt{} or{}", _image_2, context);
    acceptor.accept(_createCompletionProposal_2);
  }
  
  public void completeChart_FollowedElements(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Image _image = this.getImage(model);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("mostly{\n \t \n\t } sometimes{ \n\t \n\t }", "mostly{} sometimes{}", _image, context);
    acceptor.accept(_createCompletionProposal);
    Image _image_1 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("alt{\n \t \n\t } or{ \n\t \n\t }", "alt{} or{}", _image_1, context);
    acceptor.accept(_createCompletionProposal_1);
  }
  
  public void completeChart_StartElements(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Image _image = this.getImage(model);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("mostly{\n \t \n\t } sometimes{ \n\t \n\t }", "mostly{} sometimes{}", _image, context);
    acceptor.accept(_createCompletionProposal);
    Image _image_1 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("alt{\n \t \n\t } or{ \n\t \n\t }", "alt{} or{}", _image_1, context);
    acceptor.accept(_createCompletionProposal_1);
  }
  
  public void completeStartTimeAlternative_MostlyAlternative(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Image _image = this.getImage(model);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("start{\n \t \n\t } followed{ \n\t \n\t }", "start{} followed{}", _image, context);
    acceptor.accept(_createCompletionProposal);
    Image _image_1 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("mostly{\n \t \n\t } sometimes{ \n\t \n\t }", "mostly{} sometimes{}", _image_1, context);
    acceptor.accept(_createCompletionProposal_1);
    Image _image_2 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("alt{\n \t \n\t } or{ \n\t \n\t }", "alt{} or{}", _image_2, context);
    acceptor.accept(_createCompletionProposal_2);
  }
  
  public void completeStartTimeAlternative_SometimesAlternative(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Image _image = this.getImage(model);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("start{\n \t \n\t } followed{ \n\t \n\t }", "start{} followed{}", _image, context);
    acceptor.accept(_createCompletionProposal);
    Image _image_1 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("mostly{\n \t \n\t } sometimes{ \n\t \n\t }", "mostly{} sometimes{}", _image_1, context);
    acceptor.accept(_createCompletionProposal_1);
    Image _image_2 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("alt{\n \t \n\t } or{ \n\t \n\t }", "alt{} or{}", _image_2, context);
    acceptor.accept(_createCompletionProposal_2);
  }
  
  public void completeStartAlternative_Alternative(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Image _image = this.getImage(model);
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal("start{\n \t \n\t } followed{ \n\t \n\t }", "start{} followed{}", _image, context);
    acceptor.accept(_createCompletionProposal);
    Image _image_1 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_1 = this.createCompletionProposal("mostly{\n \t \n\t } sometimes{ \n\t \n\t }", "mostly{} sometimes{}", _image_1, context);
    acceptor.accept(_createCompletionProposal_1);
    Image _image_2 = this.getImage(model);
    ICompletionProposal _createCompletionProposal_2 = this.createCompletionProposal("alt{\n \t \n\t } or{ \n\t \n\t }", "alt{} or{}", _image_2, context);
    acceptor.accept(_createCompletionProposal_2);
  }
}
