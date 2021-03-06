package com.menglin.dao;


import com.menglin.entity.Course;

import java.util.List;
import java.util.Map;

public interface CourseDao {

    Course selectByName(String name);

    List<Course> getCoursesListByTeacherId(Long teacherId);

    List<Course> queryCoursesByIdList(Map<String, Object> map);

    List<Course> queryCoursesByPage(Map<String, Object> map);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int insertSelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    Course selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int updateByPrimaryKey(Course record);
}