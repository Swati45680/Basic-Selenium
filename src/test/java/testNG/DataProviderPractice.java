package testNG;

public class DataProviderPractice {


		@Test(dataProvider="getData")
		public void dataProviderDemo(Stringname,int price)
		{
			System.out.println("Phone is:-"+name+ "and);
		}

	

}
