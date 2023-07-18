package testNG;

import org.testng.annotations.Test;

public class TestNGTest {
	@Test(priority=1)
	public void createCustomer()
	{
		System.out.println("customer is created");
	}
@Test(priority=-1)
public void modifyCustomer()
{
	System.out.println("customer is modified");
	}
@Test(priority=2)
public void deleteCustomer()
{
	System.out.println("customer is deleted");

}
}
