package com.cdac.cine.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class USerDaoService {
	// JPA/Hibernate > Database
	// UserDaoService > Static List
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Keshribhan Suryavanshi",LocalDate.now().minusYears(21)));
		users.add(new User(1,"Keshribhan Suryavanshi",LocalDate.now().minusYears(23)));
		users.add(new User(1,"Keshribhan Suryavanshi",LocalDate.now().minusYears(24)));
		
	}
	
	//public List<User> findAll(){
	
	public List<User> findAll(){
		return users;
	}
	//public User save(User user) {
	
	//public User findOne (int id) {

}
