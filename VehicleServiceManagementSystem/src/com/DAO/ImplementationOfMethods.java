package com.DAO;

import java.text.SimpleDateFormat;
import java.util.*;

import com.Bean.ServiceRecord;
import com.Bean.Vehicle;

public class ImplementationOfMethods implements MethodsOFVehicleService{
	
	
    ArrayList<Vehicle>v=new ArrayList<>();
    ArrayList<ServiceRecord> sr=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public ImplementationOfMethods()
    {
    	v=new ArrayList<>();
    	sr=new ArrayList<>();
    }
	@Override
	public void addVehicle() {
		System.out.println("enter the no of vehicle you want to add");
		int num=sc.nextInt();
		for (int i=0;i<num;i++)
		{
		System.out.println("Enter the vehicle id.");
		int vid=sc.nextInt();
		System.out.println("Enter the make of car.");
		String make=sc.next();
		System.out.println("Enter the vehicle model.");
		String model=sc.next();
		System.out.println("Enter the Vehicle Type(Car, Truck, Motorcycle)");
		String type=sc.next();
		//VehicleType type=VehicleType.valueOf(typezString.toUpperCase());
		System.out.println("Enter the year of vehicle made");
		int year=sc.nextInt();
		System.out.println("Enter the mileage of vehicle");
		int mileage=sc.nextInt();
		Vehicle vehicle=new Vehicle();
		vehicle.setId(vid);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicle.setType(type);
        vehicle.setYear(year);
        vehicle.setMileage(mileage);
        v.add(vehicle);
		}
		
	}

	@Override
	public void removeVehicle() {
		System.out.println("Enter the vehicle id you want to remove ..");
		int vid=sc.nextInt();
		Iterator<Vehicle>it=v.iterator();
		while(it.hasNext())
		{
			Vehicle vl=it.next();
			if (vl.getId()==vid)
			{
				it.remove();
				System.out.println("Record deleted sucessfully...");
			}
			
		}
		
	}

	@Override
	public void displayListOfVehicle() {
		Iterator<Vehicle>it=v.iterator();
		while(it.hasNext())
		{
			Vehicle vl=it.next();
			System.out.println(vl.getId());
			System.out.println(vl.getMake());
			System.out.println(vl.getMileage());
			System.out.println(vl.getModel());
			System.out.println(vl.getType());
			System.out.println(vl.getYear());
			System.out.println("...................................");
		}
		
	}

	@Override
	public void searchVehicle() {
		System.out.println("Enter the choice for searching vehicle");
		System.out.println("1.Search by make \n2. Search by model \n3. Search by type");
		int choice=sc.nextInt();
		Iterator<Vehicle>it=v.iterator();
		while(it.hasNext())
		{
			Vehicle vl=it.next();
		switch(choice)
		{
		case 1 : System.out.println("Entre the make you want to search");
		         String make=sc.next();
		         if (vl.getMake().equalsIgnoreCase(make))
		         {
		        	 System.out.println(vl.getId());
		        	 System.out.println(vl.getMake());
		        	 System.out.println(vl.getMileage());
		        	 System.out.println(vl.getModel());
		        	 System.out.println(vl.getYear());
		        	 System.out.println(vl.getType());
		         }
		 break;
		case 2: System.out.println("Enter the model you want to search..");
		       String model=sc.next();
		       if (vl.getModel().equalsIgnoreCase(model))
		       {
		    	   System.out.println(vl.getId());
		        	 System.out.println(vl.getMake());
		        	 System.out.println(vl.getMileage());
		        	 System.out.println(vl.getModel());
		        	 System.out.println(vl.getYear());
		        	 System.out.println(vl.getType());
		    	   
		       }
		 break;
		case 3:  System.out.println("Entre type of vehicle");
		         String type=sc.next();
		         //VehicleType type=VehicleType.valueOf(typezString.toUpperCase());
		         if (vl.getType().equalsIgnoreCase(type))
		         {
		        	 System.out.println(vl.getId());
		        	 System.out.println(vl.getMake());
		        	 System.out.println(vl.getMileage());
		        	 System.out.println(vl.getModel());
		        	 System.out.println(vl.getYear());
		        	 System.out.println(vl.getType());
		        	 
		         }
		         break;
		         default : System.out.println("Invalid choice..");
		}
		}
		
	}

	@Override
	public void recordService() {
		System.out.println("Enter the vehicle id you want to add service record for it");
		int vid=sc.nextInt();
		ServiceRecord ser=new ServiceRecord();
		Iterator<Vehicle>it=v.iterator();
		while(it.hasNext())
		{
		    Vehicle vl=it.next();
		    if (vl.getId()==vid)
		{
			System.out.println("Enter the date of service.");
			String d=sc.next();
			
			System.out.println("Enter Service description...");
			String des=sc.next();
			System.out.println("Enter cost of Service..");
			double cost=sc.nextDouble();
			
			//ser.setDate(d);;
			ser.setDescription(des);
			ser.setCost(cost);
			sr.add(ser);
			
		}
		}
		
	}

	@Override
	public void displayServiceRecord() {
		for (ServiceRecord s:sr)
		{
			System.out.println(s.getVehicle());
			System.out.println("Service date is : "+s.getDate());
			System.out.println(s.getCost());
			System.out.println(s.getDescription());
		}
		
	}

	

}
