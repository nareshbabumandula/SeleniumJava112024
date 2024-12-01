package com.oops;

public class PVR extends Theatre{

	public static void main(String[] args) {
		PVR pvr = new PVR();
		pvr.onlineTicketbooking();
		pvr.fireandSafety();
	}

	void fireandSafety() {
		System.out.println("fire and Safety precautions were taken at PVR");
	}

}
