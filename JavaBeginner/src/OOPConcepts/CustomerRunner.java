package OOPConcepts;

import OOPConcepts.Customer.Address;
import OOPConcepts.Customer.Customer;

public class CustomerRunner {

    public static void main(String args[]){

        Address homeAddress = new Address(
                "2-47/31/2", "Palaknama", "Samsthan Narayanpur, Telangana", 508253, "India");
        Customer customer = new Customer("Pawankumar", homeAddress, null);
        System.out.println(customer);

        homeAddress.updateAddresss("123-456", "Kondapur", "Telangana", 508253, "India");
        System.out.println(customer);
    }
}
