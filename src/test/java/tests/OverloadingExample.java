package tests;

    public class OverloadingExample {

        // method with 2 int parameters
        void add(int a, int b) {
            System.out.println("Sum of 2 numbers: " + (a + b));
        }

        // method with 3 int parameters
        void add(int a, int b, int c) {
            System.out.println("Sum of 3 numbers: " + (a + b + c));
        }

        // method with double parameters
        void add(double a, double b) {
            System.out.println("Sum of double numbers: " + (a + b));
        }

        public static void main(String[] args) {
            OverloadingExample obj = new OverloadingExample();

            obj.add(10, 20);        // calls 2-parameter method
            obj.add(10, 20, 30);    // calls 3-parameter method
            obj.add(5.5, 4.5);      // calls double method
        }
    }

