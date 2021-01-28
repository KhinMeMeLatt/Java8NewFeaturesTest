package predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {

	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() { 
	       return "User Name : " + name + ", Age :" + age; 
	}
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>(); 
		users.add(new User("John",18));
		users.add(new User("Emma",20));
		users.add(new User("Marthar",16));
		List<User> adultList = process(users, (User u) -> u.getAge() >= 18); 
        System.out.println(adultList); 
	}
	
	public static List<User> process(List<User> users,  
            Predicate<User> predicat) { 
		List<User> result = new ArrayList<User>(); 
		for (User user: users)         
			if (predicat.test(user))             
				result.add(user); 
		return result; 
	} 
}
