import java.util.*;
class pr
{
Scanner sc = new Scanner(System.in);
private int roll[] = new int[5];
private int lab[] = new int[5];
private int canteen[] = new int[5];
private int tech[] = new int[5];
private int other[] = new int[5];

private int avail[] = new int[5];
private int regular[] = new int[5];
private int prof[] = new int[5];
private int skill[] = new int[5];

private int infeedch;
static int a = 0;

public void set_roll()
{	a++;
	System.out.print("\nEnter the Enrollment number \t");
	roll[a]=sc.nextInt();
	}

public void set_inlab()
{
	System.out.print("\nEnter the ratings out of 5 for the labs \t");
	lab[a] = sc.nextInt();
	
}

public void set_incanteen()
{
	System.out.print("\nEnter the ratings out of 5 for the Canteen \t");
	canteen[a] = sc.nextInt();
	
}

public void set_intech()
{
	System.out.print("\nEnter the ratings out of 5 for the technology \t");
	tech[a] = sc.nextInt();
	
}

public void set_inother()
{
	System.out.print("\nEnter the ratings out of 5 for the other activities \t");
	other[a] = sc.nextInt();
	
}

public void set_sfavail()
{
	System.out.print("\nEnter the ratings out of 5 for the availability \t");
	avail[a] = sc.nextInt();	
}

public void set_sfregular()
{
	System.out.print("\nEnter the ratings out of 5 for the regular \t");
	regular[a] = sc.nextInt();
	
}

public void set_sfprof()
{
	System.out.print("\nEnter the ratings out of 5 for the proficiency \t");
	prof[a] = sc.nextInt();
	
}


public void set_sfskill()
{
	System.out.print("\nEnter the ratings out of 5 for the skills \t");
	skill[a] = sc.nextInt();	
}



public void display_roll()
{	
for(int i=1;i<=a;i++)
	{
	System.out.print(roll[i]);
	}
	
}

public void display_inlab()
{
	System.out.println("\n\t Feedback of lab in campus ");
	System.out.println("\tEnrollment \t\t Ratings");
	for(int i=1;i<=a;i++)
	{
	System.out.println("\t"+roll[i]+"\t\t"+"------->"+"\t"+lab[i]);
	}

} 

public void display_intech()
{
	System.out.println("\n\tFeedback of technology in campus");	
	System.out.println("\tEnrollment \t\t Ratings");	
	for(int i=1;i<=a;i++)
	{
	System.out.println("\t"+roll[i]+"\t"+"------->"+"\t"+tech[i]);
	}
} 

public void display_inother()
{
	System.out.println("\n\tFeedback of other facilites in campus");	
	System.out.println("\tEnrollment \t\t Ratings");
	for(int i=1;i<=a;i++)
	{
	System.out.println("\t"+roll[i]+"\t"+"------->"+"\t"+other[i]);
	}
} 


public void display_incanteen()
{
	System.out.println("\n\tFeedback of Canteen in campus");
	System.out.println("\tEnrollment \t\t Ratings");
	for(int i=1;i<=a;i++)
	{
	System.out.println("\t"+roll[i]+"\t"+"------->"+"\t"+canteen[i]);
	}
} 

public void display_sfavail()

{
	System.out.println("\n\tFeedback of availability of faculty");
	System.out.println("\tEnrollment \t\t Ratings");
	for(int i=1;i<=a;i++)
	{
	System.out.println("\t"+roll[i]+"\t"+"------->"+"\t"+avail[i]);
	}
} 

public void display_sfregular()
{
	System.out.println("\n\tFeedback of regularity of faculty");	
	System.out.println("\tEnrollment \t\t Ratings");
	for(int i=1;i<=a;i++)
	{
	System.out.println("\t"+roll[i]+"\t"+"------->"+"\t"+regular[i]);
	}
} 

public void display_sfprof()
{
	System.out.println("\n\tFeedback of proficiency of faculty");	
	System.out.println("\tEnrollment \t\t Ratings");
	for(int i=1;i<=a;i++)
	{
	System.out.println("\t"+roll[i]+"\t"+"------->"+"\t"+prof[i]);
	}
} 
public void display_sfskill()
{
	System.out.println("\n \tFeedbacks of the skills");	
	System.out.println("\tEnrollment \t\t Ratings");
	for(int i=1;i<=a;i++)
	{
	
	System.out.println("\t"+roll[i]+"\t"+"------->"+"\t"+skill[i]);
	}
} 

public static void main(String args[])
{

	pr obj = new pr();
	Scanner s = new Scanner(System.in);
	int ch,ch1;
	System.out.println("\n\n");
	System.out.println("\t**********************************************************");	
	System.out.println("\t\tWelcome to College Feedback Management System ");
	System.out.println("\t**********************************************************");
do
{		
	System.out.println(" \n \tEnter your choice \n \t 1. Enter Feedback \n \t 2. Display Feedback \n \t 3. Exit");
	System.out.print("\t Enter your choice \t");	
	ch= s.nextInt();
	if(ch==1)
	{
	System.out.println("\t*****************************************************");
	System.out.println(" \t \tWelcome to FeedBack Entry System");
	System.out.println(" \n \tAll the rating should be given out of 5 in numbers");	
	System.out.println("\t*****************************************************");
	System.out.println(" \n \t \tYou are going to enter the Institute Feedback \n \t");
	obj.set_roll();
	obj.set_intech();
	obj.set_incanteen();
	obj.set_inother();
	obj.set_inlab();
	System.out.println("\t--------------------------------------------------------");	
	System.out.println("\tYour institute feedback is valuable and noted for further use");
	System.out.println("\t--------------------------------------------------------");
	System.out.println("\tYou are going to enter the Staff Feedback");
System.out.println("\t--------------------------------------------------------");
	obj.set_sfavail();
	obj.set_sfregular();
	obj.set_sfprof();
	obj.set_sfskill();	
	}

	if(ch==2)   
	{
	System.out.println("\n\tEnter your choice \n\t 1. Institute Feedback \n \t 2. Staff Feedback");
	System.out.print("\n \tEnter your choice \t");	
	ch1=s.nextInt();
		if(ch1==1)
		{
		obj.display_intech();
		obj.display_incanteen();
		obj.display_inlab();
		obj.display_inother();
		}	
		else if(ch1==2)
		{
		obj.display_sfavail();
		obj.display_sfregular();
		obj.display_sfprof();
		obj.display_sfskill();
		}
	}
	

}while(ch!=3);
}
}

