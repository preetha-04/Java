interface VehicleDispInfo
	{
	void vehicleDisplay();
	}
class VehicleDetail implements VehicleDispInfo
	{
	public void vehicleDisplay()
		{
		final String regisrationNo = "TN1503";
        final String number = "TN10 BJ1809";
		String vehicle_type = "4 tier vehicle";

		System.out.println("The registration number is"+regisrationNo+'\n'+"The vehicle number is"+number+'\n'+"The vehicle type is"+vehicle_type);
		
		}

		void vehicle_price(){
        double price=250000;
        System.out.println("price of the vehicle is  :"+price);
		}
	}

                
class Vehicle
{
	public static void main(String[] args) 
	{
		VehicleDispInfo refobj= new VehicleDetail();
		VehicleDetail cobj=new VehicleDetail();

		refobj.vehicleDisplay();
		cobj.vehicle_price();
		
	}
}
