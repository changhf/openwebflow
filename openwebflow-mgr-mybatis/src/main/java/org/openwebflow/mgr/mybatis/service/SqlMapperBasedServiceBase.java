package org.openwebflow.mgr.mybatis.service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;

public abstract class SqlMapperBasedServiceBase<MapperClass> implements InitializingBean {
    protected MapperClass _mapper;

    @Autowired
    SqlSessionFactory _sqlSessionFactory;

    @Override
    public void afterPropertiesSet() throws Exception {
        MapperFactoryBean factory = new MapperFactoryBean();
        factory.setMapperInterface((Class<MapperClass>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0]);
        factory.setSqlSessionFactory(_sqlSessionFactory);
        factory.afterPropertiesSet();

        _mapper = (MapperClass) factory.getObject();
    }

    public MapperClass getMapper() {
        return _mapper;
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return _sqlSessionFactory;
    }

    public void setMapper(MapperClass mapper) {
        _mapper = mapper;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        _sqlSessionFactory = sqlSessionFactory;
    }
}
