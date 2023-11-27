package OOPConcepts.Customer;

public class Address {

    private String houseNo;
    private String street;
    private String cityState;
    private int zip;
    private String country;

    public Address() {

    }
    public Address(String houseNo, String street, String cityState, int zip, String country) {
        super();
        this.houseNo = houseNo;
        this.street = street;
        this.cityState = cityState;
        this.zip = zip;
        this.country = country;
    }

    public void updateAddresss(String houseNo, String street, String cityState, int zip, String country) {
        this.houseNo = houseNo;
        this.street = street;
        this.cityState = cityState;
        this.zip = zip;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", street='" + street + '\'' +
                ", cityState='" + cityState + '\'' +
                ", zip=" + zip +
                ", country='" + country + '\'' +
                '}';
    }
}
