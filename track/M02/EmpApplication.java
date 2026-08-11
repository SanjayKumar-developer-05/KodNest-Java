public class EmpApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 21;
        e1.name = "Sanju";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        Employee e2;
        e2 = e1;
        e2.id = 28;
        e2.name = "Sanjay";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();

        /*
         * Output
         * 21
         * Sanju
         * Working
         * 28
         * Sanjay
         * 28
         * Sanjay
         * Working
         */

    }
}
