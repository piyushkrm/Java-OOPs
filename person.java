class personInfo {
    private String name;
    private int age;
    private String address;

    public personInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void printInfo() {
        // person("Piyush", 21, "Araria Bihar");
        System.out.println("Name : " + name + "\nAge : " + age + "\nAddress : " + address);
    }
}

public class person {

    public static void main(String[] args) {
        personInfo person = new personInfo("Piyush", 21, "Araria Bihar");
        person.printInfo();
    }
}
