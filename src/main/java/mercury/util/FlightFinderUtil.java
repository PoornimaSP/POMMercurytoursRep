package mercury.util;

import java.util.ArrayList;

public class FlightFinderUtil {
	public static Xls_Reader reader;
	public static ArrayList<Object[]> getFlightDataFromExcel()
	{
		ArrayList<Object[]> myData = new 	ArrayList<Object[]>();
		
		reader = new Xls_Reader("C:\\Users\\welcome\\workspace\\Mercurytoursartifacts\\src\\main\\java\\mercury\\testdata\\Login.xlsx");
	
		
		for(int i=2;i<=reader.getRowCount("FlightDetails");i++)
		{
			String type = reader.getCellData("FlightDetails", "Type", i);
			String Passcount = reader.getCellData("FlightDetails", "PassengersCount", i);
			String DepFrom = reader.getCellData("FlightDetails", "DepFrom", i);
			String DepMonth = reader.getCellData("FlightDetails", "DepMonth", i);
			String DepDay = reader.getCellData("FlightDetails", "DepDay", i);
			String Destination = reader.getCellData("FlightDetails", "ArrivingIn", i);
			String ReturnMonth = reader.getCellData("FlightDetails", "ReturningMonth", i);
			String ReturnDay = reader.getCellData("FlightDetails", "ReturningDay", i);
			String Class = reader.getCellData("FlightDetails", "ServiceClass", i);
			String Airline = reader.getCellData("FlightDetails", "Airline", i);
			
			Object ob[]= {type,Passcount,DepFrom,DepMonth,DepDay,Destination,ReturnMonth,ReturnDay,Class,Airline};
			myData.add(ob);
			
		}
	
	
		return myData;
	}
	
}
