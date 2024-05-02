package Entites;

public class User {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;


    public User(String phone, String password, String email, String lastName, String firstName, String username) {
        this.phone = phone;
        this.password = password;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
    }



    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
