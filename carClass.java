// 3
class car {
    String model;
    int year;

    public void setModel(String model) {
        this.model = model;
        System.out.println("Model : "+model);
    }

    public void setYear(int year) {
        this.year = year;
        System.out.println("Year : "+year);
    }

    public void startEngine() {
        System.out.println("Vroom!");
    }

}
public class carClass {

    public static void main(String[] args) {
        car Car = new car();
        Car.setModel("BMW");
        Car.setYear(2003);
        Car.startEngine();

    }
}