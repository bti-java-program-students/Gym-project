package Gym_project;

public class Client {
    private String id;
    private int timeSpent;
    private double height;
    private double weight;
    private double BMI;

    public Client(String id, int timeSpent, double height, double weight, double BMI) {
        this.id = id;
        this.timeSpent = timeSpent;
        this.height = height;
        this.weight = weight;
        this.BMI = BMI;
    }

    public Client() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
}

