/*
Trevis Fields
CIS 18A Mon/Wed 3:00-5:10PM
OCT 31, 2016
*/
package service1;
import java.util.Scanner;

public class salonReport1 
{
	public static void main(String[] args) 
        {
		
		//class		object		= new Class with length
		Service1[]	services	= new Service1[6];
                int num = 0;
		
		//object		= new constructor method
		services[0]		= new Service1("Cut", 8.00, 15);
		services[1]		= new Service1("Shampoo", 4.00, 10);
		services[2]		= new Service1("Manicure", 18.00, 30);
		services[3]		= new Service1("Style", 48.00, 55);
		services[4]		= new Service1("Permanent", 18.00, 35);
		services[5]		= new Service1("Trim", 6.00, 5);
                
                
                
                System.out.println("Please enter 1 for Description, 2 for Price or 3 for Duration.");
                Scanner input = new Scanner(System.in);
                num = input.nextInt();
		switch (num) 
		{
			case 1:
				System.out.println("What do you want to sort by? \nEnter one of the following: \n1 - Ascending;"
						+ "\n2 - Descending");
				num = input.nextInt();
				if(num == 1)
				{
					sortDescriptionAscending(services);
				}
				else if(num == 2)
				{
					sortDescriptionDescending(services);
				}
				break;
				
			case 2:
				System.out.println("What do you want to sort by? \nEnter one of the following: \n1 - Ascending;"
						+ "\n2 - Descending");
				num = input.nextInt();
				if(num == 1)
				{
					sortPriceAscending(services);
				}
				else if(num == 2)
				{
					sortPriceDescending(services);
				}
				break;
				
			case 3:
				System.out.println("What do you want to sort by? \nEnter one of the following: \n1 - Ascending;"
						+ "\n2 - Descending");
				num = input.nextInt();
				if(num == 1)
				{
					sortDurationAscending(services);
				}
				else if(num == 2)
				{
					sortDurationDescending(services);
				}
			default:
				break;
	
		}
		
	}
	
	//method for displaying sorted Services by Ascending Price
	public static void sortPriceAscending(Service1[] services)
        {
	
		Service1 temp; //singular
		
		for (int i = 0; i < services.length-1; i++) 
                {
			for (int j = 0; j < services.length-1; j++) 
                        {
				if (services[j].getPrice() > services[j+1].getPrice()) 
                                {
					temp = services[j];				//temporary put service her
					services[j] = services[j+1];	//swap value j to j+1
					services[j+1] = temp;			//swap value j+1 to temp
				}
			}
		}
		for (int i = 0; i < services.length; i++) {
			System.out.println(services[i].getDescription() + "\t" +
									"$" + services[i].getPrice() + "\t" +
										services[i].getDuration() + "mins");
		}
	}
        public static void sortPriceDescending(Service1[] services)
        {
	
		Service1 temp; //singular
		
		for (int i = 0; i < services.length-1; i++) 
                {
			for (int j = 0; j < services.length-1; j++) 
                        {
				if (services[j].getPrice() < services[j+1].getPrice()) 
                                {
					temp = services[j];				//temporary put service her
					services[j] = services[j+1];	//swap value j to j+1
					services[j+1] = temp;			//swap value j+1 to temp
				}
			}
		}
		for (int i = 0; i < services.length; i++) {
			System.out.println(services[i].getDescription() + "\t" +
									"$" + services[i].getPrice() + "\t" +
										services[i].getDuration() + "mins");
		}
	}
	//TODO sort description descending
	public static void sortDescriptionDescending(Service1[] services){
		
		Service1 temp; //singular
		
		for (int i = 0; i < services.length-1; i++) 
                {
			for (int j = 0; j < services.length-1; j++) 
                        {
				if (services[j].getDescription().compareTo(services[j+1].getDescription())<0) 
                                {
					temp = services[j];				//temporary put service her
					services[j] = services[j+1];	//swap value j to j+1
					services[j+1] = temp;			//swap value j+1 to temp
				}
			}
		}
		for (int i = 0; i < services.length; i++) 
                {
			System.out.println(services[i].getDescription() + "\t" +
									"$" + services[i].getPrice() + "\t" +
										services[i].getDuration() + "mins");
		}
	}
        
        public static void sortDescriptionAscending(Service1[] services){
		
		Service1 temp; //singular
		
		for (int i = 0; i < services.length-1; i++) 
                {
			for (int j = 0; j < services.length-1; j++) 
                        {
				if (services[j].getDescription().compareTo(services[j+1].getDescription())>0) 
                                {
					temp = services[j];				//temporary put service her
					services[j] = services[j+1];	//swap value j to j+1
					services[j+1] = temp;			//swap value j+1 to temp
				}
			}
		}
		for (int i = 0; i < services.length; i++) 
                {
			System.out.println(services[i].getDescription() + "\t" +
									"$" + services[i].getPrice() + "\t" +
										services[i].getDuration() + "mins");
		}
	}

public static void sortDurationAscending(Service1[] services){
		
		Service1 temp; //singular
		
		for (int i = 0; i < services.length-1; i++) 
                {
			for (int j = 0; j < services.length-1; j++) 
                        {
				if (services[j].getDuration() > (services[j+1].getDuration())) 
                                {
					temp = services[j];				//temporary put service her
					services[j] = services[j+1];	//swap value j to j+1
					services[j+1] = temp;			//swap value j+1 to temp
				}
			}
		}
		for (int i = 0; i < services.length; i++) {
			System.out.println(services[i].getDescription() + "\t" +
									"$" + services[i].getPrice() + "\t" +
										services[i].getDuration() + "mins");
		}
	}

public static void sortDurationDescending(Service1[] services){
		
		Service1 temp; //singular
		
		for (int i = 0; i < services.length-1; i++) 
                {
			for (int j = 0; j < services.length-1; j++) 
                        {
				if (services[j].getDuration() < (services[j+1].getDuration())) 
                                {
					temp = services[j];				//temporary put service her
					services[j] = services[j+1];	//swap value j to j+1
					services[j+1] = temp;			//swap value j+1 to temp
				}
			}
		}
		for (int i = 0; i < services.length; i++) 
                {
			System.out.println(services[i].getDescription() + "\t" +
									"$" + services[i].getPrice() + "\t" +
										services[i].getDuration() + "mins");
		}
	}
}


