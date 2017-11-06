package edu.asu.sbs.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.asu.sbs.model.ExternalUser;
import edu.asu.sbs.model.Role;
import edu.asu.sbs.model.Users;

@Repository
public class RoleDAOImpl implements RoleDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		getCurrentSession().save(role);
	}

	@Override
	public Role findRoleByUserName(String userName) {
		// TODO Auto-generated method stub
		Criteria criteria = getCurrentSession().createCriteria(Role.class);
		Role role = (Role) criteria.add(Restrictions.eq("userName", userName)).uniqueResult();
		return role;
	}

	@Override
	public void deleteRole(int id) {
		// TODO Auto-generated method stub
		Role role = findById(id);
		getCurrentSession().delete(role);
	}

	@Override
	public Role findById(Integer Id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Role role = (Role) session.get(Role.class, Id);
		return role;
	}

}