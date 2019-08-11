package Gym_project;

class Client {
    private String id;
    private int timeSpent;
    private double height;
    private double weight;
    private double BMI;

    Client() {}

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    double getTimeSpent() {
        return timeSpent;
    }

    void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
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
