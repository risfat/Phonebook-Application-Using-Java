package phoneBookApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PhoneBookRoot {

	public static void main(String[] args) {
//		displayMenu();
		
		Address addressContact1 = new Address("B/6 Radhaballav Road", "Rangpur", "5410");
		Address addressContact2 = new Address("A/3 Ghoshpara Road Mohadevpur", "Naogaon",  "6530");
		Address addressContact3 = new Address("224 Nayagola", "Chapainawabganj",  "6300");
		Address addressContact4 = new Address("574 Pukure Road", "Satkhira Sadar","9400");
		Address addressContact5 = new Address("574  Dhanmondi", "Dhaka", "63333");

		Person person1 = new Person("MD", "Risfat", "01737757944", addressContact1);
		Person person2 = new Person("Anup", "Mondal", "01710415952", addressContact2);
		Person person3 = new Person("Nazmul", "Islam", "01732053499", addressContact3);
		Person person4 = new Person("Fahim", "Muntasir", "01777004794", addressContact3);
		Person person5 = new Person("Taspria", "Orin", "01712345678", addressContact3);


		ArrayList<Person>peopleArrayList = new ArrayList<>();
		
		peopleArrayList.add(person1);
		peopleArrayList.add(person2);
		peopleArrayList.add(person3);
		peopleArrayList.add(person4);
		peopleArrayList.add(person5);
	
	//Display the Option menu
	while(true) {
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		Scanner contactZipInput  = new Scanner(System.in);
		
		System.out.println("\nHello, What would you like to do");
		System.out.println("1. Show all Contacts (Ascending) ");
		System.out.println("2. Add a new Contact");
		System.out.println("3. Search Contact");
		System.out.println("4. Update Contact");
		System.out.println("5. Delete Contact");
		System.out.println("6. Exit the program");
		
		int choice = userInput.nextInt();
		
		switch (choice){
			
		case 1:	//View List in Ascending Order



			Functions f = new Functions();
			f.quickSort(peopleArrayList,0,peopleArrayList.size() - 1);

			for(int i =0; i < peopleArrayList.size(); i++) {

				System.out.println(peopleArrayList.get(i)+ " " + peopleArrayList.get(i).getAddress());
			}

			break;


			case 2:   // adding new contact
			System.out.println("\n What is the First name of the person you would like to add? (firstName");
			String firstName = userInput.next();

			System.out.println("\n What is the Last name  of the contact you would like to add? (lastName)");
			String lastName = userInput.next();

			System.out.println("\n What is the phone number of your new contact (contactNum)");
			String contactNumber = userInput.next();

			System.out.println("\n What street does your new contact live on? (contactStreet)");
			String streetName = userInput2.nextLine();

			System.out.println("What city does your new contact live in?");
			String City = userInput.next();


			System.out.println("What is your new contacts zip code?");
			String zipCode = contactZipInput.next();


			System.out.println();

			Person address = new Person(firstName, lastName, contactNumber, new Address(streetName, City, zipCode));

			peopleArrayList.add(address);

			System.out.println("You Have Successfully added " + firstName + " " + lastName + " " + contactNumber + " " + streetName + " " + City + " " + zipCode);

			break;



//here

		case 3:
			boolean flag = true;

			System.out.println("1. Search By First Name");
			System.out.println("2. Search By Last Name");
			System.out.println("3. Search By Phone Number");
			System.out.println("4. Search By City");
			System.out.println("5. Previous Menu");


			while (flag){
				int c = userInput.nextInt();

				switch (c){
					case 1:
						//user wants to Search their contacts by first name
						System.out.println("What is the first name of the contact you wish to search for?");
						String userFirstName = userInput.next();

						Functions f1 = new Functions();
						f1.quickSort(peopleArrayList, 0, peopleArrayList.size() - 1);

//			System.out.println("Sorted Array in Ascending Order: ");
//			System.out.println(peopleArrayList);

						int result1 = f1.firstName_bs(peopleArrayList , userFirstName);

						if (result1 == -1)
							System.out.println(userFirstName+" is not found in the Array");
						else {
							System.out.println(userFirstName + " is found at index :" + result1);
							System.out.print(peopleArrayList.get(result1) + " " + peopleArrayList.get(result1).getAddress());
							System.out.println("\n");
						}
						break;

					case 2:		//user wants to Search their contacts by Last name
						System.out.println("What is the Last name of the contact you wish to search for?");
						String userLastName = userInput.next();

						Functions f2 = new Functions();
						f2.quickSort(peopleArrayList, 0, peopleArrayList.size() - 1);


						int result2 = f2.lastName_bs(peopleArrayList , userLastName);

						if (result2 == -1)
							System.out.println(userLastName+" is not found in the Array");
						else {
							System.out.println(userLastName + " is found at index :" + result2);
							System.out.print(peopleArrayList.get(result2) + " " + peopleArrayList.get(result2).getAddress());
							System.out.println("\n");
						}
						break;

					case 3: 	//user wants to Search their contacts by Last name
						System.out.println("What is the Contact Number of the contact you wish to search for?");
						String userNumber = userInput.next();

						Functions f3 = new Functions();
						f3.quickSort(peopleArrayList, 0, peopleArrayList.size() - 1);


						int result3 = f3.number_bs(peopleArrayList , userNumber);

						if (result3 == -1)
							System.out.println(userNumber+" is not found in the Array");
						else {
							System.out.println(userNumber + " is found at index :" + result3);
							System.out.print(peopleArrayList.get(result3) + " " + peopleArrayList.get(result3).getAddress());
							System.out.println("\n");
						}

						break;

					case 4: //User wants to Search Contacts by City
						System.out.println("What is the City Of the contact you would like to search for");
						String searchByContactCity = userInput2.nextLine();

						for(int i = 0; i < peopleArrayList.size(); i++) {
							if(peopleArrayList.get(i) != null) {
								if(peopleArrayList.get(i).getAddress().getCity().equals(searchByContactCity)) {
									System.out.println(peopleArrayList.get(i).getFirstName() + " " + peopleArrayList.get(i).getLastName() + " " + peopleArrayList.get(i).getContactNumber() + " " + peopleArrayList.get(i).getAddress());
									System.out.println();
								}
							}
						}
						break;

					default:
						flag = false;

						break;

				}


			}



			//Search Phone book by first name
			// TODO: 3/21/2021 Implement New Search Function for 1st name
//			for(int i = 0; i < peopleArrayList.size(); i++) {
//				if(peopleArrayList.get(i) != null) {
//				if(peopleArrayList.get(i).getFirstName().trim().equals(userFirstName)) {
//					System.out.print(peopleArrayList.get(i) + " " + peopleArrayList.get(i).getAddress());
//					System.out.println();
//				}
//			}
//		}
//
			break;






		case 4: //User wants to update a contact
			System.out.println("What is the phone number of the contact you want to update?");
			String updateByContactPhone = userInput2.next();
			
			System.out.println("What is the new first name you would change to?");
			String contactNewFirstName = userInput2.next();
			System.out.println("What is the new Last name you would change to?");
			String contactNewLastName = userInput2.next();
			System.out.println("What is the new Number you would change to?");
			String contactNewNumber = userInput2.next();

			for(int i = 0; i<peopleArrayList.size(); i++) {

				if(peopleArrayList.get(i) != null) {

					if(peopleArrayList.get(i).getContactNumber().equals(updateByContactPhone)) {

						peopleArrayList.get(i).setFirstName(contactNewFirstName);
						peopleArrayList.get(i).setLastName(contactNewLastName);
						peopleArrayList.get(i).setContactNumber(contactNewNumber);

						System.out.println("Contact Updated Successfully");
					}
				}
			}
				break;

			case 5: // User  wants to delete a record by Phone number
				System.out.println("what is the phone number of the contact you would like to delete");

				String deleteByPhoneNumber = userInput2.nextLine();

				for(int i = 0; i < peopleArrayList.size(); i++)
				{
					if(deleteByPhoneNumber.equals(peopleArrayList.get(i).getContactNumber()))
					{
//					targetArray[countOne] = peopleArrayList.get(i);

//					countOne--;

						peopleArrayList.remove(i);

						System.out.println("Contact Has Been Removed.. ");
					}

				}
				break;




			case 6: //User wants to exit the program
			System.out.println("\n Good Bye!!!");
			System.exit(10);
			

		default: 
		
		}

	}
	
	}
}


