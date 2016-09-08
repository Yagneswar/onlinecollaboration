package com.niit.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.entity.Blog;

@Repository ("blogDAO")
@Transactional
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	SessionFactory sessionFactory;
	
		
	@Override
	public Blog find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Blog blog) {		
		this.sessionFactory.getCurrentSession().saveOrUpdate(blog);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
