//package com.MOVIETICKETBOOKINGSYSTEM;
//
//public class movie1 {
//
//	public movie1() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
package com.MOVIETICKETBOOKINGSYSTEM;
import java.util.Scanner;
public class movie1{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int status=1;
	movie movlist[]=null;
	do {
	System.out.println("Welcome to The cinema hall");
	System.out.println("1. Add Movie details");
	System.out.println("2. Search and book");
	System.out.println("3. View all");
	System.out.println("Enter your choice: ");
	int ch=sc.nextInt ();
	switch(ch)
	{
	case 1:
		System.out.println("Enter no. of movies: ");
		int no=sc.nextInt ();
		movlist=new movie [no];
		for (int i=0; i<movlist.length; i++)
			{
			int j=i;
			System.out.println("Enter movie "+ ++j +" Details");
			movlist[i]=new movie();
			}
		System.out.println("Data saved....");
		break;
	case 2:
		boolean flag = true;
		sc.nextLine();
		System.out.println("Enter the movie name: ");
		String name=sc.nextLine();
		for(int i=0;i<movlist.length; i++)
		{
		if(movlist[i].getName().equals(name)) 
		{
			movlist[i].viewAllDetails();
			flag = true;
			System.out.println("Would you like to book tickets for this movie?:");
			System.out.println("Enter 1 to book and 2 to exit: ");
			int c=sc.nextInt();
			if (c==1)
				{
				System.out.println("Enter the no. of tickets:");
				int tick=sc.nextInt ();
				double tc=movlist[i].getPrice()*tick;
				System.out.println("The bill comes up to: "+tc);
				}
			else
			    break;
			}
			else 
					flag = false;
			}
			if(flag==false)
			System.err.println("Not Found");
			break;
		
		case 3:
			for (int i=0;i<movlist.length; i++)
			{
				movlist[i].viewAllDetails();
			}
		
	    default: 
	    	System.out.println("Wrong choice....");
		}
		System.out.println("Do you want to continue (1.yes / 2.No): ");
		status = sc.nextInt ();
		}while(status==1);
			System.out.println("Execution completed succefully.....");
	}
}