package com.menglin.dao;

import com.menglin.entity.Task;

import java.util.List;
import java.util.Map;

public interface TaskDao {

    List<Task> queryTasksByPage(Map<String, Object> map);

    Long queryTotalTask();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Apr 19 20:24:40 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Apr 19 20:24:40 CST 2018
     */
    int insert(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Apr 19 20:24:40 CST 2018
     */
    int insertSelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Apr 19 20:24:40 CST 2018
     */
    Task selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Apr 19 20:24:40 CST 2018
     */
    int updateByPrimaryKeySelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Apr 19 20:24:40 CST 2018
     */
    int updateByPrimaryKey(Task record);
}