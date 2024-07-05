class behaviour {
    String name;
    String angry, sad, happy, enjoying, dancing, walking, sleeping, eating;

    public behaviour(String angry, String enjoying, String sad, String happy, String dancing, String walking,
            String sleeping, String eating) {
        this.angry = angry;
        this.sad = sad;
        this.happy = happy;
        this.enjoying = enjoying;
        this.dancing = dancing;
        this.walking = walking;
        this.sleeping = sleeping;
        this.eating = eating;
    }
}

class person extends behaviour {
    String area = "Rural";

    public person(String name, String angry, String enjoying, String sad, String happy, String dancing, String walking,
            String sleeping, String eating) {
        super(angry, enjoying, sad, happy, dancing, walking, sleeping, eating);
        this.name = name; // Now it will work correctly
    }

    public String name(String name) {
        System.out.println("Your name is : " + name);
        return personBehave();
    }

    public String personBehave() {
        System.out.println(name + " is " + angry);
        System.out.println(name + " is " + sad);
        System.out.println(name + " is " + dancing);
        return name;

    }
}

public class class1 {
    public static void main(String[] args) {
        person per = new person("Pihu", "angrily", "sadly", "happily", "enjoying", "dancing", "walking", "sleeping",
                null);
        per.name("Piyush");
    }

}