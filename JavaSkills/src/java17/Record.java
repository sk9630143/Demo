package java17;

public class Record {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(27, "John");
		Employee emp2 = new Employee(29, "Rose");
		
		//toString() method call
		System.out.println(emp1);//Employee[age=27, name=John]
		System.out.println(emp2);//Employee[age=29, name=Rose]
		
		//print age and name without getter method
		System.out.println(emp1.age()+" - "+emp1.name());//27 - John
		System.out.println(emp2.age()+" - "+emp2.name());//29 - Rose
		
		

	}

}

record Employee(int age, String name) {
	//Now it has below functionalities by default
	
	//Data member declaration int age, String name
	//parameterized constructor	 
	//toString() methods
	//Override hashCode() and equals() method
	
	//........... Setter and Getter methods not created inside record class .................
}
