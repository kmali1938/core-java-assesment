package com.vehicle;

public class Car extends Vehicle{

	private boolean powerStearing;
	private String fuelType;
	private String ignite;
	private String stopCar;
	

	public Car(int vehicleNo, String engineStatus, int currentGear, boolean powerStearing, String fuelType) {
		super(vehicleNo, engineStatus, currentGear);
		this.powerStearing = powerStearing;
		this.fuelType = fuelType;
	}

	@Override
	public void ignite() {
		// TODO Auto-generated method stub
		if(this.engineStatus.toLowerCase().equals("on") && this.currentGear >= 1) {
			System.out.println("Car Already running");
		} else {
			System.out.println("Car started");
			this.engineStatus = "On";
			this.currentGear = 1;
		}
	}

	@Override
	public int changeGear(int flag) {
		// TODO Auto-generated method stub
		if(flag==1) {
			if(this.currentGear==6) {
				System.out.println("Car is on 6th Gear! Cannot change gear");
			} else {				
				this.currentGear+=1;
			}
		}else if(flag==-1) {
			if(this.currentGear==1) {
				System.out.println("Car is on 1st Gear! Cannot change gear");
			} else {
				if(this.currentGear != 0) {					
					this.currentGear-=1;
				}
			}
		}
		return 0;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		if(this.engineStatus.toLowerCase().equals("on") && this.currentGear >= 1) {
			this.engineStatus = "OFF";
			this.currentGear = 0;
			System.out.println("Car stopped");
		} else {
			System.out.println("Car Already stopped");
		}
		
	}
	
	public void showCarDetails() {
		System.out.println("Car details are :");
		System.out.println("Vehicle number : "+vehicleNo+" \nEngine Status : "+engineStatus+" \nCurrent Gear : "+currentGear+" \nPower Stearing status: "+powerStearing+"\nFuel type : "+fuelType);
		
	}
	

}
