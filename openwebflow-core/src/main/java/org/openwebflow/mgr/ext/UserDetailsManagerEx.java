package org.openwebflow.mgr.ext;

import org.openwebflow.identity.UserDetailsEntity;

public interface UserDetailsManagerEx {
    /**
     * 删除所有用户信息
     */
    void removeAll() throws Exception;

    /**
     * 保存某个用户的信息
     */
    void saveUserDetails(UserDetailsEntity userDetails) throws Exception;
}
