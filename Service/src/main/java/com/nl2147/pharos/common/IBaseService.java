package com.nl2147.pharos.common;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务基类
 */
@Service
public interface IBaseService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    List<T> selectByExample(Object example);
}
