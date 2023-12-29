public class TestFramework {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @Test(name = "Test 1")
    public void testMethod1() {}

    @Test(name = "Test 2", enabled = false)
    public void testMethod2() {}

    @Test()
    public void testMethod3() {}

    @Test(name = "Test 4")
    private void testMethod4() {}

    @Test(name = "Test 5")
    protected void testMethod5() {}

    @After
    public void testAfter() {
        System.out.println("After");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");
    }
}