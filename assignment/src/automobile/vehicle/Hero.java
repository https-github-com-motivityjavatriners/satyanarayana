 package automobile.vehicle;

import com.automobile.Vehicle;

// here method was package level visiblity ,so you cant override the method at another package

public class Hero// extends com.automobile.Vehicle
{
	public String getModelName()
	{
		return "splenderplus";
	}
	 String getRegistrationNumber()
	 {
		 return "AP 37 BP 1008";
	 }
	String getOwnerName()
	{
		return "Subbarao Rangina";
	}

}