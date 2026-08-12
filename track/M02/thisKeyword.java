public class thisKeyword {
    String name;
    int age;
    int rollno;

    void input(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollno);
    }
}

class example {
    public static void main(String[] args) {
        thisKeyword t1 = new thisKeyword();
        t1.input("Sanju", 19, 21);
        t1.disp();
    }
}
