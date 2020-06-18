package testNGTraining;

import org.testng.annotations.Test;

public class TestNG_Introduction {
	
	@Test
	public void loginTest() {
				System.out.println("Login to the application");
	}
	
	@Test(dependsOnMethods ="loginTest" )
	public void createPO() {
		System.out.println("po creation");
}

}
