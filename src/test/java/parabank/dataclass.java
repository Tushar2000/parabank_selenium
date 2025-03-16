package parabank;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataclass {

	@DataProvider(name="dataset")
	public Object[][] datafunction() {
		
		return new Object[][]
				{
			{"demo1","demo2"},
			{"demo3","demo4"},
			{"demo5","demo6"}
				};
	}
	
	@DataProvider
	public Object[][] datafunction2(Method m)
	{
		Object[][] dataset = null;
		if(m.getName().equals("userLogin"))
		{
			dataset = new Object[][]
				{
					{"demo1111","demo2222"},
					{"demo33333","demo4"},
					{"demo55555555","demo6"}
				};
		}
		else if(m.getName().equals("userLogin2"))
		{
			dataset = new Object[][]
					{
						{"demo1","demo2","demo7"},
						{"demo3","demo4","demo8"},
						{"demo5","demo6","demo9"}
					};
		}
		return dataset;
	}
}
