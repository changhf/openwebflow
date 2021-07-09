package org.openwebflow.mgr.ext;

public interface DelegationManagerEx {
    /**
     * 删除所有代理信息
     */
    void removeAll() throws Exception;

    /**
     * 保存一条代理信息
     */
    void saveDelegation(String delegated, String delegate) throws Exception;
}