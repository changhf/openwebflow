package org.openwebflow.assign.delegation;

/**
 * 代理关系对象
 */
public interface DelegationEntity {
    /**
     * 获取当前代理记录的代理人
     */
    String getDelegate();

    /**
     * 获取当前代理记录的被代理人
     */
    String getDelegated();

}