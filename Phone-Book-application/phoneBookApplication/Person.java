package phoneBookApplication;

public class Person {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private Address address;
	

	
	public Person() {
		super();
	}
	
	public Person(String firstName, String lastName, String contactNumber, Address address) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getContactNumber() {
		
		
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
				
//	//Search By Contact Number
//	public static void searchByPhoneNumber() {
//		for(int i = 0; i < people.length; i++) {
//			if(people[i].getContactNumber().trim().equals(people[i].getContactNumber())) {
//				System.out.print(people[i]);
//				System.out.println();
//			}
//		}
//	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + contactNumber;
	}

}

