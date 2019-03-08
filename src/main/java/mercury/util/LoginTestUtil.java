package mercury.util;

import java.util.ArrayList;

public class LoginTestUtil {
	public static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData = new 	ArrayList<Object[]>();
		
		reader = new Xls_Reader("C:\\Users\\welcome\\workspace\\Mercurytoursartifacts\\src\\main\\java\\mercury\\testdata\\Login.xlsx");
	
		
		for(int i=2;i<=reader.getRowCount("Loginparam");i++)
		{
			String username = reader.getCellData("Loginparam", "UserName", i);
			String password = reader.getCellData("Loginparam", "Password", i);
			System.out.println(i+username+password);
			Object ob[]= {username,password};
			myData.add(ob);
			
		}
	
	
		return myData;
	}
}
