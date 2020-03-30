package com.example.mybatis3.demo.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.example.mybatis3.demo.domain.Course;





/**
 * @author Siva
 *
 */
public interface CourseMapper
{
	@Select("select * from courses where tutor_id=#{tutorId}")
	List<Course> selectCoursesByTutorId(int tutorId);

	List<Course> selectCoursesByTutor(int tutorId);

	List<Course> searchCourses(Map<String, Object> map);

	List<Course> searchCoursesByTutors(Map<String, Object> map);

}
