package com.training;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amazon ab= new Amazon();
		
		ab.cashOnDelivery();
		
		System.out.println("cash on delivery is available");
		
		ab.upipayments();
		
		System.out.println("upipayments is possible");
		
		ab.cardpayments();
		
		System.out.println("card payments is debit/credit is possible");
		
		System.out.println(ab.internetBanking());
		
		ab.recordPaymentDetails();
		
		System.out.println("record payment is not possible");
	}

	private void recordPaymentDetails() {
		// TODO Auto-generated method stub
		
	}

	private char[] internetBanking() {
		// TODO Auto-generated method stub
		return null;
	}

	private void cardpayments() {
		// TODO Auto-generated method stub
		
	}

	private void upipayments() {
		// TODO Auto-generated method stub
		
	}

	private void cashOnDelivery() {
		// TODO Auto-generated method stub
		
	}

		
	}



