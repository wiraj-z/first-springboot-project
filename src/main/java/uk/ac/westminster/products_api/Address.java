package uk.ac.westminster.products_api;

public class Address {
    private String city;
    private String street;
    private String postcode;

    public Address(){}
    public Address( String city, String street, String postcode ){
        this.city = city;
        this.street = street;
        this.postcode = postcode;
    }

    public String getCity(){
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getPostcode(){
        return postcode;
    }
}
