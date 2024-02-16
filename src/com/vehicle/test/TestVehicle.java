package com.vehicle.test;
import com.vehicle.Vehicle;

import java.util.Scanner;

import com.vehicle.Car;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vehicle details : ");
		System.out.println("Enter Vehicle Number : ");
		int vehicleNo=sc.nextInt();
		
		System.out.println("Enter Engine Status : ");
		String engineStatus=sc.next();
		
		System.out.println("Enter Current Gear : ");
		int currentGear=sc.nextInt();
		
		System.out.println("Power Stearing ? : ");
		boolean powerStearing=sc.nextBoolean();
		
		System.out.println("Enter Fuel Type : ");
		String fuelType=sc.next();
		
		Vehicle car = new Car(vehicleNo,engineStatus,currentGear,powerStearing,fuelType);
		
		((Car) car).showCarDetails();
		
		System.out.println("Do you want to ignite your car?: ");
		String ignite= sc.next();
		if(ignite.toLowerCase().equals("yes")) {
			car.ignite();
			
		}else {
			System.out.println("Engine status not updated");
		}
		
		System.out.println("Do you want to stop your car ?: ");
		String stop = sc.next();
		if(stop.toLowerCase().equals("yes")) {			
			car.stop();
			
		}else {
			System.out.println("Engine status not updated");
		}
		
		System.out.println("Do you want to change gear? : Type 1 to increase and -1 to decrease ");
		int change = sc.nextInt();
		car.changeGear(change);
		
		((Car) car).showCarDetails();
		
		

	}

}
