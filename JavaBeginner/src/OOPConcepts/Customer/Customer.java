package OOPConcepts.Customer;

public class Customer {

    private String name;
    private Address homeAddress;
    private Address officeAddress;

    public Customer(String name, Address homeAddress, Address officeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", homeAddress=" + homeAddress +
                ", officeAddress=" + officeAddress +
                '}';
    }

}
