package com.ktanx.jdbc.command.entity;

import java.io.Serializable;

/**
 * 条件构建
 * 实现标识接口
 * <p>
 * Created by liyd on 17/4/11.
 */
public interface ConditionBuilder<C extends ConditionBuilder<C>> extends EntityCommandExecutor {

    /**
     * 表别名
     *
     * @param tableAlias
     * @return
     */
    C tableAlias(String tableAlias);

    /**
     * where 关键字
     *
     * @return
     */
    C where();

    /**
     * where 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C where(String field, Object value);

    /**
     * where 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C where(String field, Object[] value);

    /**
     * where 属性条件，指定操作符
     *
     * @param field
     * @param operator
     * @param values
     * @return
     */
    C where(String field, String operator, Object[] values);

    /**
     * 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C condition(String field, Object value);

    /**
     * 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C condition(String field, Object[] value);

    /**
     * 属性条件，指定操作符
     *
     * @param field
     * @param operator
     * @param values
     * @return
     */
    C condition(String field, String operator, Object[] values);


    /**
     * 实体属性条件
     *
     * @param entity
     * @return
     */
    C conditionEntity(Object entity);

    /**
     * id条件
     *
     * @param value
     * @return
     */
    C conditionId(Serializable value);

    /**
     * and
     *
     * @return
     */
    C and();

    /**
     * and 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C and(String field, Object value);

    /**
     * and 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C and(String field, Object[] value);

    /**
     * and 属性条件 指定操作符
     *
     * @param field
     * @param operator
     * @param values
     * @return
     */
    C and(String field, String operator, Object[] values);

    /**
     * or
     *
     * @return
     */
    C or();

    /**
     * or 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C or(String field, Object value);

    /**
     * or 属性条件
     *
     * @param field
     * @param value
     * @return
     */
    C or(String field, Object[] value);

    /**
     * or 属性条件 指定操作符
     *
     * @param field
     * @param operator
     * @param values
     * @return
     */
    C or(String field, String operator, Object[] values);

    /**
     * 括号开始
     *
     * @return
     */
    C begin();

    /**
     * 括号结束
     *
     * @return
     */
    C end();

}
