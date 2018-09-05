
public class Aggregation {

	public static void main(String[] args) {
		Address add1=new Address("201 S 4th Street,","San Jose,", "California,", 95112, "-USA");
		Emp arvind =new Emp(1, "Arvind Chettiar",add1);
		arvind.display();
	}

}
class Emp{
	int id;
	String name;
	Address address;
	
	public Emp(int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display() {
		System.out.println("Employee id is "+id);
		System.out.println("Employee name is "+name);
		System.out.println("Employee address is "+address.street+" "+address.city+" "+address.state+" "+address.zipcode+address.Country);
	}
		
}

class Address{
	String street;
	String city;
	String state;
	int zipcode;
	String Country;
	
	public Address(String street, String city, String state, int zipcode, String Country){
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.Country=Country;
	}
	
	
}