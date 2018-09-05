
public class AggregationStudy {
	

	public static void main(String[] args) {
		Address1 obj = new Address1("california", "san jose", 95112);
		System.out.println(obj.zipcode);
		
		Employee emp1= new Employee(1, "arvind", obj);
		System.out.println(emp1.empid);
		System.out.println(emp1.empname);
		System.out.println(emp1.address.country);

	}

}


class Employee{
	
	int empid;
	String empname;
	Address1 address;
	
	Employee(int empid, String empname, Address1 address){
		this.empid=empid;
		this.empname=empname;
		this.address=address;
	}
}


class Address1{
	String country;
	String state;
	int zipcode;
	
	Address1(String country, String state, int zipcode){
		this.country=country;
		this.state=state;
		this.zipcode=zipcode;
	}
	
}