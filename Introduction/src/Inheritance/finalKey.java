//// Demonstrating final keyword in Java
//
//// Final Class: cannot be extended
//final class Constants {
//    final int MAX_VALUE = 100;  // Final Variable
//
//    void printConstant() {
//        System.out.println("MAX_VALUE = " + MAX_VALUE);
//    }
//}
//
//// Class with a final method
//class Parent {
//    final void show() {
//        System.out.println("This is a final method.");
//    }
//}
//
//// Uncommenting this will cause an error: Cannot override final method
//class Child extends Parent {
//    // void show() {
//    //     System.out.println("Trying to override final method."); // ❌ Error
//    // }
//}
//
//// Main class must match file name
//public class finalKey {
//    public static void main(String[] args) {
//        // Final variable
//        final int number = 10;
//        System.out.println("Final variable: " + number);
//
//        // number = 20; // ❌ Error: cannot assign a value to final variable
//
//        Constants constants = new Constants();
//        constants.printConstant();
//
//        Parent p = new Parent();
//        p.show();
//    }
//}
