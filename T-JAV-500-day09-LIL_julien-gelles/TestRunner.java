import java.lang.reflect.Method;

public class TestRunner {

    public static void runTests(Class<?> testClass) {
        Method[] methods = testClass.getDeclaredMethods();

        Method beforeClassMethod = null;
        Method afterClassMethod = null;

        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeClass.class)) {
                beforeClassMethod = method;
            } else if (method.isAnnotationPresent(AfterClass.class)) {
                afterClassMethod = method;
            }
        }

        try {

            if (beforeClassMethod != null) {
                beforeClassMethod.setAccessible(true);
                beforeClassMethod.invoke(null);
            }

            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {

                    // @Before case
                    if (method.isAnnotationPresent(Before.class)) {
                        try {
                            method.setAccessible(true);
                            method.invoke(testClass.getDeclaredConstructor().newInstance());
                        }catch (Exception e) {}
                    }

                    // @Test
                    Test testAnnotation = method.getAnnotation(Test.class);
                    if (testAnnotation.enabled()) {
                        try {
                            method.setAccessible(true);
                            System.out.println(testAnnotation.name());
                            method.invoke(testClass.getDeclaredConstructor().newInstance());
                        }catch (Exception e) {}
                    }

                    // @After case
                    if (method.isAnnotationPresent(After.class)) {
                        try {
                            method.setAccessible(true);
                            method.invoke(testClass.getDeclaredConstructor().newInstance());
                        }catch (Exception e) {}
                    }
                }
            }

            if (afterClassMethod != null) {
                afterClassMethod.setAccessible(true);
                afterClassMethod.invoke(null);
            }
            
        } catch (Exception e) {}
        
    }
}