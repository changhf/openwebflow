package org.openwebflow.mgr.ext;

public interface IdentityMembershipManagerEx {
    /**
     * 删除所有成员关系
     */
    void removeAll() throws Exception;

    /**
     * 保存成员关系
     */
    void saveMembership(String userId, String groupId) throws Exception;
}