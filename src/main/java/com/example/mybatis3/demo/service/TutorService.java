/**
 * 
 */
package com.example.mybatis3.demo.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis3.demo.MyBatisUtil;
import com.example.mybatis3.demo.domain.Tutor;
import com.example.mybatis3.demo.mappers.TutorMapper;
@Service
public class TutorService 
{
	@Autowired
	TutorMapper tutorMapper;
	
	public Tutor selectTutorWithCoursesById(int tutorId) {
		//SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			
			return tutorMapper.selectTutorWithCoursesById(tutorId);
		} 
		
		finally {
			//sqlSession.close();
		}
	}
	
	

	/*public List<Tutor> findAllTutors()
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
			return mapper.findAllTutors();
		} finally {
			sqlSession.close();
		}
	}
	
	public Tutor findTutorById(int tutorId)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
			return mapper.findTutorById(tutorId);
		} finally {
			sqlSession.close();
		}
	}
	
	public Tutor findTutorByNameAndEmail(String name, String email)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
			return mapper.findTutorByNameAndEmail(name, email);
		} finally {
			sqlSession.close();
		}
	}
	
	public Tutor createTutor(Tutor tutor)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
			mapper.insertTutor(tutor);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return tutor;
	}
	
	public Tutor updateTutor(Tutor tutor)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
			mapper.updateTutor(tutor);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return tutor;
	}
	
	public boolean deleteTutor(int tutorId)
	{
		boolean deleted = false;
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
			int nor = mapper.deleteTutor(tutorId);
			deleted = (nor == 1);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		return deleted;
	}
	
	public Tutor selectTutorById(int tutorId)
	{
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
			return mapper.selectTutorById(tutorId);
		} finally {
			sqlSession.close();
		}
	}
	*/
}
