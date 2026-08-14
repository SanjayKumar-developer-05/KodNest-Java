public class constructor {
    String name;
    int age;
    double height;

    constructor(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

}

class studentApply {
    public static void main(String[] args) {
        /*
         * constructor s1 = new constructor();
         * s1.input("Sanjay", 20, 170);
         */
        constructor s1 = new constructor("Sanjay", 20, 170);
        s1.disp();
    }
}