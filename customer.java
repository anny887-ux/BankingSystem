package bd.edu.diu;

public class customer {

    private int customerId;
    private String name;
    private String address;
    private String phone;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public customer() {
    }

    public void showCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("***********************************");
    }

    public static void main(String[] args) {

        customer customers = new customer();

        customers.showCustomer();

        customers.setCustomerId(101);
        customers.setName("Esrat");
        customers.setAddress("Savar, Dhaka");
        customers.setPhone("01712345678");

        customers.showCustomer();
    }
}