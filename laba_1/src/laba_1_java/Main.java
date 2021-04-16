package laba_1_java;

public class Main {

    public static void main(String[] args) {

        Book doItNow = new Book("Brian Tracy", "Do it now", 106, 100,
                "Motivational guidelines", 9.5);
        Book stonemason = new Book("Ivan Franko", "Stonemason", 405, 299);
        Book kobzar = new Book();

        System.out.println(doItNow);
        System.out.println(stonemason);
        System.out.println(kobzar + "\n");

        doItNow.resetValues("Tracy", "Do", 10, 10,
                "Motivational", 9.0);
        System.out.println("Changing the value of the object: ");
        System.out.println(doItNow + "\n");

        System.out.print("Number of objects from non-static method: ");
        Book.printStaticCountBook();
        System.out.print("\nNumber of objects from static method: ");
        kobzar.printCountBook();
    }

}
