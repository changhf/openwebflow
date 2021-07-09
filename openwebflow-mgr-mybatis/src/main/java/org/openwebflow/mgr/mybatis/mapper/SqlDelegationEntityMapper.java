package org.openwebflow.mgr.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.openwebflow.assign.delegation.DelegationEntity;
import org.openwebflow.mgr.mybatis.entity.SqlDelegationEntity;

import java.util.List;

public interface SqlDelegationEntityMapper {
    @Delete("DELETE from OWF_DELEGATION")
    void deleteAll();

    @Select("SELECT * FROM OWF_DELEGATION where DELEGATED=#{delegated}")
    @Results(value = {@Result(property = "opTime", column = "OP_TIME")})
    List<SqlDelegationEntity> findByDelegated(@Param("delegated")
                                                      String delegated);

    @Select("SELECT * FROM OWF_DELEGATION")
    @Results(value = {@Result(property = "opTime", column = "OP_TIME")})
    List<SqlDelegationEntity> list();

    @Insert("INSERT INTO OWF_DELEGATION (DELEGATED,DELEGATE,OP_TIME) values (#{delegated},#{delegate},#{opTime})")
    void saveDelegation(DelegationEntity sde);
}
