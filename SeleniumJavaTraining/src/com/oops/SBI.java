package com.oops;

public class SBI implements RBI, Bank{
	
		
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.setInterestRate();
		sbi.displayGuidelines();
		sbi.setWithdrwalLimit();
		sbi.setKYC();
		sbi.loans();
		sbi.branches();
		RBI.dematAccount();
		//sbi.minDeposit=1000; // The final field RBI.minDeposit cannot be assigned
		System.out.println(sbi.minDeposit);
	}

	@Override
	public void setInterestRate() {
		System.out.println("SBI sets the interest rate at 6.5%.");		
	}

	@Override
	public void setWithdrwalLimit() {
		System.out.println("SBI sets the daily withdrawl limit to Rs 40,000.");
	}

	@Override
	public void displayGuidelines() {
		System.out.println("SBI follows RBI guidelie on cash reserves and lending rates.");
	}

	@Override
	public void setKYC() {
		System.out.println("SBI takes care of KYC for every customer.");
		
	}

	@Override
	public void loans() {
		System.out.println("SBI personal and home loan facility is available");
	}
}
