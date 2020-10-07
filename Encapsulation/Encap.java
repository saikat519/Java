package OOPS.Encapsulation;

public class Encap {
	
	private int age;
	private String name;
	
	public void setAge(int newAge) {
		 age = newAge;
	}									//setters
	
	public void setName(String newName) {
		 name = newName;
	}
	
	public  String getName() {
		return name;				//getters
	}
	public int getAge() {
		return age;
	}
}