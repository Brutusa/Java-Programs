/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

public class Midsize_Car extends Vehicle {
    private int daily_rental_rate;

    Midsize_Car(String color, String make, String model, int currentMileage, int originalCost, int daily_rental_rate) {
        this.setColor(color);
        this.setMake(make);
        this.setModel(model);
        this.setCurrentMileage(currentMileage);
        this.setOriginalCost(originalCost);
        this.daily_rental_rate = daily_rental_rate;
    }

    @Override
    public String toString() {
        return "Midsized Car: " + super.toString();
    }
}
