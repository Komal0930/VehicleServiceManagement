package com.App;
import java.util.*;

import com.DAO.ImplementationOfMethods;

public class VehicleServiceManagementMainApp {

	public static void main(String[] args) {
		char ch;
		ImplementationOfMethods im=new ImplementationOfMethods();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("...................Vehicle Service Management App.....................");
			System.out.println("Enter choice from below options..");
			System.out.println("1. Add vehicle \n2. Remove Vehicle \n3. Display list of vehicles \n4.Search Vehicle \n5. Record service for vehicle \n6. Display service history ");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1 : im.addVehicle();
			break;
			case 2 : im.removeVehicle();
			break;
			case 3 : im.displayListOfVehicle();
			break;
			case 4 : im.searchVehicle();
			break;
			case 5 : im.recordService();
			break;
			case 6 : im.displayServiceRecord();
			break;
			default : System.out.println("Invalid choice...");
			}
			System.out.println("Do you want to continue..");
			ch=sc.next().charAt(0);
		}
		
		while(ch=='Y'||ch=='y');
		{
			System.out.println("..........THANK YOU.......");
		}

	}

}
