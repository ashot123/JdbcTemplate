package net.codejava.spring;

/**
 *
 * @author www.codejava.net
 *
 */
public class Contact {
    private String name;
    private String email;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String toString() {
        return String.format("[%s - %s - %s - %s]", name, email, address, phone);
    }
}