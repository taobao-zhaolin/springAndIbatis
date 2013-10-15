package com.taobao.danchen;

public interface IPersonDAO {
	
	public void insert(Person person) throws Exception;
	
	public Person getPersonById(Long id) throws Exception;
}
