package com.taobao.danchen;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

@SuppressWarnings("deprecation")
public class PersonDAO extends SqlMapClientDaoSupport implements IPersonDAO{

	public void insert(Person person) throws Exception {
		try {
			this.getSqlMapClient().insert("Person.insertPerson", person);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		
	}

	public Person getPersonById(Long id) throws Exception {
		try {
			Person person  = (Person) this.getSqlMapClient().queryForObject("Person.getPersonById", 1L);
			return person;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	

}
