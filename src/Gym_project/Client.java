package Gym_project;

abstract class Client {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private double height;
    private double weight;
    private double BMI;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    double getBMI() {
        return BMI;
    }

    void setBMI(double BMI) {
        this.BMI = BMI;
    }
}
