public class Example {
    public static void main(String[] args) {
        System.out.println("\n--- Ex 01 ---"); // Create new inspector and display informations as asked.
        Inspector<Number> inspector = new Inspector<>(Number.class);
        inspector.displayInformations();
        
        System.out.println("\n--- Ex 02 ---"); // Try to create a Number and a String instance | Number dosnt have default constructor -> return Error null | String works well.
        try {
            Inspector<String> inspectorString = new Inspector<>(String.class);
            String instance = inspectorString.createInstance();
            System.out.println("New instance created !" + instance);
        } catch (Exception e) {
            System.out.println("Exception occurred while creating an instance: " + e.getMessage());
        }
        try {
            Inspector<Number> inspectorNumber = new Inspector<>(Number.class);
            Number instance = inspectorNumber.createInstance();
            System.out.println("New instance created !" + instance);
        } catch (Exception e) {
            System.out.println("Exception occurred while creating an instance: " + e.getMessage());
        }

        System.out.println("\n--- Ex 03 to 06 ---"); // Test the runTests method on our TestFramework class
            Class<?> testClass = TestFramework.class;
            TestRunner.runTests(testClass);
    }
}
