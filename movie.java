package com.MOVIETICKETBOOKINGSYSTEM;

import java.util.Scanner;

public class movie {

	//public movie() {
		String Name;
		String Theater;
		int seats;
		double price;
		movie()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Movie Name:");
			Name=sc.nextLine();
			System.out.print("Enter Theator Name:");
			Theater=sc.nextLine();
			System.out.print("Enter No.of Seats:");
			seats=sc.nextInt();
			System.out.print("Enter Price:");
			price=sc.nextDouble();
			
		}
		public void setName(String name) {
			this.Name = name;
		}

		public void setTheater(String theater) {
			this.Theater = theater;
		}

		public void setSeats(int seats) {
			this.seats = seats;
		}

		public void setPrice(double price) {
			this.price = price;
		}
	    public String getName() {
			return Name;
		}
		public String getTheater() {
			return Theater;
		}
		public int getSeats() {
			return seats;
		}
		public double getPrice() {
			return price;
		}
	void storedetails(String Name,String Theater,int Seats,double price)
	{
		this.Name=Name;
		this.Theater=Theater;
		this.seats=Seats;
		this.price=price;
	}
	void viewAllDetails()
	{
		System.out.println("Movie Name :"+Name);
		System.out.println("Theator Name :"+Theater);
		System.out.println("No of seats :"+seats);
		System.out.println("cost per ticket:"+price);
		
	}

}
