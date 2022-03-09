package org.openwebflow.alarm;

import org.activiti.engine.ProcessEngine;

/**
 * 启动任务催办服务
 */
public interface TaskAlarmService {
    void start(ProcessEngine processEngine) throws Exception;
}