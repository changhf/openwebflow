package org.openwebflow.assign.impl;

import org.activiti.bpmn.model.*;
import org.activiti.engine.impl.bpmn.behavior.*;
import org.activiti.engine.impl.bpmn.helper.ClassDelegate;
import org.activiti.engine.impl.bpmn.parser.CompensateEventDefinition;
import org.activiti.engine.impl.bpmn.parser.EventSubscriptionDeclaration;
import org.activiti.engine.impl.bpmn.parser.factory.ActivityBehaviorFactory;
import org.activiti.engine.impl.pvm.delegate.ActivityBehavior;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.task.TaskDefinition;

public class ActivityBehaviorFactoryDelegate {
    protected ActivityBehaviorFactory _source;

    public ActivityBehaviorFactoryDelegate(ActivityBehaviorFactory source) {
        _source = source;
    }

    public BoundaryEventActivityBehavior createBoundaryEventActivityBehavior(BoundaryEvent boundaryEvent,
                                                                             boolean interrupting, ActivityImpl activity) {
        return _source.createBoundaryEventActivityBehavior(boundaryEvent, interrupting, activity);
    }

    public BusinessRuleTaskActivityBehavior createBusinessRuleTaskActivityBehavior(BusinessRuleTask businessRuleTask) {
        return (BusinessRuleTaskActivityBehavior) _source.createBusinessRuleTaskActivityBehavior(businessRuleTask);
    }

    public CallActivityBehavior createCallActivityBehavior(CallActivity callActivity) {
        return _source.createCallActivityBehavior(callActivity);
    }

    public ActivityBehavior createCamelActivityBehavior(SendTask sendTask, BpmnModel bpmnModel) {
        return _source.createCamelActivityBehavior(sendTask, bpmnModel);
    }

    public ActivityBehavior createCamelActivityBehavior(ServiceTask serviceTask, BpmnModel bpmnModel) {
        return _source.createCamelActivityBehavior(serviceTask, bpmnModel);
    }

    public CancelBoundaryEventActivityBehavior createCancelBoundaryEventActivityBehavior(
            CancelEventDefinition cancelEventDefinition) {
        return _source.createCancelBoundaryEventActivityBehavior(cancelEventDefinition);
    }

    public CancelEndEventActivityBehavior createCancelEndEventActivityBehavior(EndEvent endEvent) {
        return _source.createCancelEndEventActivityBehavior(endEvent);
    }

    public ClassDelegate createClassDelegateServiceTask(ServiceTask serviceTask) {
        return _source.createClassDelegateServiceTask(serviceTask);
    }

    public ErrorEndEventActivityBehavior createErrorEndEventActivityBehavior(EndEvent endEvent,
                                                                             ErrorEventDefinition errorEventDefinition) {
        return _source.createErrorEndEventActivityBehavior(endEvent, errorEventDefinition);
    }

    public EventBasedGatewayActivityBehavior createEventBasedGatewayActivityBehavior(EventGateway eventGateway) {
        return _source.createEventBasedGatewayActivityBehavior(eventGateway);
    }

    public EventSubProcessStartEventActivityBehavior createEventSubProcessStartEventActivityBehavior(
            StartEvent startEvent, String activityId) {
        return _source.createEventSubProcessStartEventActivityBehavior(startEvent, activityId);
    }

    public ExclusiveGatewayActivityBehavior createExclusiveGatewayActivityBehavior(ExclusiveGateway exclusiveGateway) {
        return _source.createExclusiveGatewayActivityBehavior(exclusiveGateway);
    }

    public InclusiveGatewayActivityBehavior createInclusiveGatewayActivityBehavior(InclusiveGateway inclusiveGateway) {
        return _source.createInclusiveGatewayActivityBehavior(inclusiveGateway);
    }

    public IntermediateCatchEventActivityBehavior createIntermediateCatchEventActivityBehavior(
            IntermediateCatchEvent intermediateCatchEvent) {
        return _source.createIntermediateCatchEventActivityBehavior(intermediateCatchEvent);
    }

    public IntermediateThrowCompensationEventActivityBehavior createIntermediateThrowCompensationEventActivityBehavior(
            ThrowEvent throwEvent, CompensateEventDefinition compensateEventDefinition) {
        return _source.createIntermediateThrowCompensationEventActivityBehavior(throwEvent, compensateEventDefinition);
    }

    public IntermediateThrowNoneEventActivityBehavior createIntermediateThrowNoneEventActivityBehavior(
            ThrowEvent throwEvent) {
        return _source.createIntermediateThrowNoneEventActivityBehavior(throwEvent);
    }

    public IntermediateThrowSignalEventActivityBehavior createIntermediateThrowSignalEventActivityBehavior(
            ThrowEvent throwEvent, Signal signal, EventSubscriptionDeclaration eventSubscriptionDeclaration) {
        return _source.createIntermediateThrowSignalEventActivityBehavior(throwEvent, signal,
                eventSubscriptionDeclaration);
    }

    public MailActivityBehavior createMailActivityBehavior(SendTask sendTask) {
        return _source.createMailActivityBehavior(sendTask);
    }

    public MailActivityBehavior createMailActivityBehavior(ServiceTask serviceTask) {
        return _source.createMailActivityBehavior(serviceTask);
    }

    public ManualTaskActivityBehavior createManualTaskActivityBehavior(ManualTask manualTask) {
        return _source.createManualTaskActivityBehavior(manualTask);
    }

    public ActivityBehavior createMuleActivityBehavior(SendTask sendTask, BpmnModel bpmnModel) {
        return _source.createMuleActivityBehavior(sendTask, bpmnModel);
    }

    public ActivityBehavior createMuleActivityBehavior(ServiceTask serviceTask, BpmnModel bpmnModel) {
        return _source.createMuleActivityBehavior(serviceTask, bpmnModel);
    }

    public NoneEndEventActivityBehavior createNoneEndEventActivityBehavior(EndEvent endEvent) {
        return _source.createNoneEndEventActivityBehavior(endEvent);
    }

    public NoneStartEventActivityBehavior createNoneStartEventActivityBehavior(StartEvent startEvent) {
        return _source.createNoneStartEventActivityBehavior(startEvent);
    }

    public ParallelGatewayActivityBehavior createParallelGatewayActivityBehavior(ParallelGateway parallelGateway) {
        return _source.createParallelGatewayActivityBehavior(parallelGateway);
    }

    public ParallelMultiInstanceBehavior createParallelMultiInstanceBehavior(ActivityImpl activity,
                                                                             AbstractBpmnActivityBehavior innerActivityBehavior) {
        return _source.createParallelMultiInstanceBehavior(activity, innerActivityBehavior);
    }

    public ReceiveTaskActivityBehavior createReceiveTaskActivityBehavior(ReceiveTask receiveTask) {
        return _source.createReceiveTaskActivityBehavior(receiveTask);
    }

    public ScriptTaskActivityBehavior createScriptTaskActivityBehavior(ScriptTask scriptTask) {
        return _source.createScriptTaskActivityBehavior(scriptTask);
    }

    public SequentialMultiInstanceBehavior createSequentialMultiInstanceBehavior(ActivityImpl activity,
                                                                                 AbstractBpmnActivityBehavior innerActivityBehavior) {
        return _source.createSequentialMultiInstanceBehavior(activity, innerActivityBehavior);
    }

    public ServiceTaskDelegateExpressionActivityBehavior createServiceTaskDelegateExpressionActivityBehavior(
            ServiceTask serviceTask) {
        return _source.createServiceTaskDelegateExpressionActivityBehavior(serviceTask);
    }

    public ServiceTaskExpressionActivityBehavior createServiceTaskExpressionActivityBehavior(ServiceTask serviceTask) {
        return _source.createServiceTaskExpressionActivityBehavior(serviceTask);
    }

    public ShellActivityBehavior createShellActivityBehavior(ServiceTask serviceTask) {
        return _source.createShellActivityBehavior(serviceTask);
    }

    public SubProcessActivityBehavior createSubprocActivityBehavior(SubProcess subProcess) {
        return _source.createSubprocActivityBehavior(subProcess);
    }

    public TaskActivityBehavior createTaskActivityBehavior(Task task) {
        return _source.createTaskActivityBehavior(task);
    }

    public TerminateEndEventActivityBehavior createTerminateEndEventActivityBehavior(EndEvent endEvent) {
        return _source.createTerminateEndEventActivityBehavior(endEvent);
    }

    public TransactionActivityBehavior createTransactionActivityBehavior(Transaction transaction) {
        return _source.createTransactionActivityBehavior(transaction);
    }

    public UserTaskActivityBehavior createUserTaskActivityBehavior(UserTask userTask, TaskDefinition taskDefinition) {
        return _source.createUserTaskActivityBehavior(userTask, taskDefinition);
    }

    public WebServiceActivityBehavior createWebServiceActivityBehavior(SendTask sendTask) {
        return _source.createWebServiceActivityBehavior(sendTask);
    }

    public WebServiceActivityBehavior createWebServiceActivityBehavior(ServiceTask serviceTask) {
        return _source.createWebServiceActivityBehavior(serviceTask);
    }

}