package com.oops;

public class PVR extends Theatre{

	public static void main(String[] args) {
		PVR pvr = new PVR();
		pvr.onlineTicketbooking();
		pvr.fireandSafety();
		pvr.carParking();
		pvr.bikeParking();
		pvr.cateferia();
		Theatre.soundSystem();
	}

	void fireandSafety() {
		System.out.println("fire and Safety precautions were taken at PVR");
	}

	@Override
	void carParking() {
		System.out.println("Car parking facility is available to park 100 cars");
	}

	@Override
	void bikeParking() {
		System.out.println("Bike parking facility is available to park 200 bikes");
	}

	@Override
	void cateferia() {
		System.out.println("Cafeteria facility is available");
	}

}
