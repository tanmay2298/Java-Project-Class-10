import java.io.*;
public class project
{
public static String s1;
public void qwe(int x)throws IOException
{
InputStreamReader anumba= new InputStreamReader(System.in);
BufferedReader bnumba= new BufferedReader(anumba);
System.out.print("\f");
System.out.println("************************************************************************************************");
System.out.println("************************************WELCOME TO THE SNACKS BAR***********************************");
System.out.println(" 1.Coke(Rs.50)        2.Popcorn(Rs.80)     3.Nachos(Rs.65)    4.Burger(Rs.50)  5.Hot-Dog(Rs.90) ");
System.out.println(" 6.Sandwiches(Rs.60)  7.Kathi Roll(Rs.95)  8.Dimsums(Rs.85)   9.Puffs(Rs.90)  10.Pasta(Rs.150)  ");
System.out.print(" Pick the Category Number Of What Would You Like To Order: ");
String s20=bnumba.readLine();
int qwe=Integer.parseInt(s20);
switch(qwe)
{
case 1:
System.out.print("How many Cokes would you like ? :");
String s22=bnumba.readLine();
int y=Integer.parseInt(s22);
x=x+(y*50);
break;
case 2:
System.out.print("How many Bowls of Popcorn would you like ? :");
String s23=bnumba.readLine();
int s=Integer.parseInt(s23);
x=x+(s*80);
break;
case 3:
System.out.print("How many Nachos would you like ? :");
String s24=bnumba.readLine();
int a=Integer.parseInt(s24);
x=x+(a*65);
break;
case 4:
System.out.print("How many Burgers would you like ? :");
String s25=bnumba.readLine();
int b=Integer.parseInt(s25);
x=x+(b*50);
break;
case 5:
System.out.print("How many Hot-Dogs would you like ? :");
String s26=bnumba.readLine();
int c=Integer.parseInt(s26);
x=x+(c*50);
break;
case 6:
System.out.print("How many Sandwiches would you like ? :");
String s27=bnumba.readLine();
int d=Integer.parseInt(s27);
x=x+(d*60);
break;
case 7:
System.out.print("How many Kathi Rolls would you like ? :");
String s28=bnumba.readLine();
int e=Integer.parseInt(s28);
x=x+(e*95);
break;
case 8:
System.out.print("How many Dimsums would you like ? :");
String s29=bnumba.readLine();
int f=Integer.parseInt(s29);
x=x+(f*85);
break;
case 9:
System.out.print("How many Puffs would you like ? :");
String s30=bnumba.readLine();
int g=Integer.parseInt(s30);
x=x+(g*90);
break;
case 10:
System.out.print("How many Pasta would you like ? :");
String s31=bnumba.readLine();
int h=Integer.parseInt(s31);
x=x+(h*150);
break;
default:
System.out.println("###WRONG INPUT###");
break;
}
System.out.print("Please Select A Method For Payment Of Bill('Card' for Credit Card and 'Cash' for Cash on Delivery): ");
String s90=bnumba.readLine();
if(s90.equalsIgnoreCase("Card"))
{
System.out.print("Please Input Your Credit Card Number: ");
String s32=bnumba.readLine();
System.out.print("Please Input Your Name: ");
String s33=bnumba.readLine();
System.out.print("\f");
System.out.println("********************************************************");
System.out.println("**********************Your Bill:************************");
System.out.println("Your Name              : "+s33);
System.out.println("Your Credit Card Number: "+s32);
System.out.println("Cost to be Paid        : Rs."+x);
System.out.println("**Thank You For Using The Indian Ticket Booking System**");
}
else
{
System.out.print("Please Input Your Sector: ");
String s34=bnumba.readLine();
System.out.print("Please Input Your House Number: ");
String s35=bnumba.readLine();
System.out.print("Please Input Your Name: ");
String s36=bnumba.readLine();
System.out.print("\f");
System.out.println("********************************************************");
System.out.println("**********************Your Bill:************************");
System.out.println("Your Name        : "+s36);
System.out.println("Your House Number: "+s35);
System.out.println("Your Sector      : "+s34);
System.out.println("Cost to be Paid  : Rs."+x);
System.out.println("Your Bill Will Be Reaching Your Home Shortly");
System.out.println("**Thank You For Using The Indian Ticket Booking System**");
}
}
public void xyz()throws IOException
{
int i;
InputStreamReader anumba= new InputStreamReader(System.in);
BufferedReader bnumba= new BufferedReader(anumba);
System.out.print("Enter The Number of Tickets You Want(Rs.150 per each ticket): ");
String s23=bnumba.readLine();
int n=Integer.parseInt(s23);
int tcost=n*150;
System.out.print("Your Seat Number/s is/are ");
for(i=1;i<=n;i++)
{
System.out.print(14+i+" ");
}
System.out.println();
System.out.println("Your Tickets Have been Booked !!");
System.out.println("*********************************************************");
System.out.println("************ THANK YOU FOR BUYING TICKETS ***************");
System.out.println();
System.out.println("*****************UPCOMMING RELEASES********************");
System.out.println("RADIO                       HINDI");
System.out.println("ROCKET SINGH                HINDI");
System.out.println("PAA                         HINDI");
System.out.println("AVATAR                      ENGLISH");
System.out.println("3 IDIOTS                    HINDI");
System.out.println("MY NAME IS KHAN             HINDI");
System.out.println("PYAAR IMPOSSIBLE            HINDI");
System.out.println("KITES                       HINDI");
System.out.println("THE TWILIGHT SAGA:NEW MOON  ENGLISH");
System.out.println("LAW ABIDING CITIZEN         ENGLISH");
System.out.println("BRUNO                       ENGLISH");
System.out.println("Batman:Arkham City          HINDI");
System.out.println("********************************************************");
System.out.print("Would You Like To Order Some Snacks('Y' for Yes and 'N' for No): ");
String s25=bnumba.readLine();
if(s25.equalsIgnoreCase("y"))
{
project obj99=new project();
obj99.qwe(tcost);
System.out.println("************************************************************************************************");
System.out.println("*********************Thank You For Using The Indian Ticket Booking System***********************"); 
}
else
{
System.out.print("Please Select A Method For Payment Of Bill('Card' for Credit Card and 'Cash' for Cash on Delivery): ");
String s31=bnumba.readLine();
if(s31.equalsIgnoreCase("Card"))
{
System.out.print("Please Input Your Credit Card Number: ");
String s32=bnumba.readLine();
System.out.print("Please Input Your Name: ");
String s33=bnumba.readLine();
System.out.print("\f");
System.out.println("********************************************************");
System.out.println("**********************Your Bill:************************");
System.out.println("Your Name              : "+s33);
System.out.println("Your Credit Card Number: "+s32);
System.out.println("Cost to be Paid        : Rs."+tcost);
System.out.println("**Thank You For Using The Indian Ticket Booking System**");
}
else
{
System.out.print("Please Input Your Sector: ");
String s34=bnumba.readLine();
System.out.print("Please Input Your House Number: ");
String s35=bnumba.readLine();
System.out.print("Please Input Your Name: ");
String s36=bnumba.readLine();
System.out.print("\f");
System.out.println("********************************************************");
System.out.println("**********************Your Bill:************************");
System.out.println("Your Name        : "+s36);
System.out.println("Your House Number: "+s35);
System.out.println("Your Sector      : "+s34);
System.out.println("Cost to be Paid  : Rs."+tcost);
System.out.println("Your Bill Will Be Reaching Your Home Shortly");
System.out.println("**Thank You For Using The Indian Ticket Booking System**");
}
}

}
public void display()throws IOException
{
int f;
System.out.println("************************** NOW SHOWING ***************************");
System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
System.out.println();
System.out.println("KURBAAN                        A          HINDI       01:00pm");
System.out.println("TWILIGHT                       U/A        ENGLISH     06:15pm");
System.out.println("A CHRISTMAS CAROL              U          ENGLISH     03:20pm");
System.out.println("TUM MILE                       U/A        HINDI       06:15pm");
System.out.println("2012                           U/A        ENGLISH     12:45pm");
System.out.println("AJAB PREM KI GHAJAB KAHANI     U          HINDI       10:30am");
InputStreamReader anumba= new InputStreamReader(System.in);
BufferedReader bnumba= new BufferedReader(anumba);
System.out.print("Enter The Name of Your Movie From the List Mentioned Above : ");
String s2=bnumba.readLine();
{
if(s2.equalsIgnoreCase("Kurbaan"))
{
System.out.println("You Have Selected The Movie "+s2+" which is an A rated Hindi movie and will begin at 1pm"); 
f=1;
}
else if(s2.equalsIgnoreCase("Twilight"))
{
System.out.println("You Have Selected The Movie "+s2+" which is an U/A rated English Movie and will begin at 6:15pm");
f=1;
}
else if(s2.equalsIgnoreCase("A Christmas Carol"))
{
System.out.println("You Have Selected The Movie "+s2+" which is an U rated English Movie and will begin at 3:20pm");
f=1;
}
else  if(s2.equalsIgnoreCase("Tum Mile"))
{
System.out.println("You Have Selected The Movie "+s2+" which is an U/A rated Hindi Movie and will begin at 6:15pm");
f=1;
}
else if(s2.equalsIgnoreCase("2012"))
{
System.out.println("You Have Selected The Movie "+s2+" which is an U/A rated English Movie and will begin at12:45pm");
f=1;
}
else if(s2.equalsIgnoreCase("Ajab Prem ki Ghajab Kahani"))
{
System.out.println("You Have Selected The Movie "+s2+" which is an U rated Hindi Movie and will begin at 10:30am");
f=1;
}
else
{
System.out.println("The Movie entered by you is not in the List");
f=0;
}
}
if(f==1)
{
project obj40=new project();
obj40.xyz();
}
else
{
System.out.println("Hence program is TERMINATED and will need to be restarted");
}
}
public static void main(String[]args)throws IOException
{
InputStreamReader anumba= new InputStreamReader(System.in);
BufferedReader bnumba= new BufferedReader(anumba);
System.out.println("******************Welcome To The Indian Ticket Booking System******************");
System.out.println("**********************Select Your City From The Following:*********************");
System.out.println("*******************Chandigarh Delhi Mumbai Gurgaon Bangalore*******************");//Displaying Everything
System.out.print("ENTER THE CORRECT NAME OF YOUR CITY FROM THE ABOVE MENTIONED:");
String s1=bnumba.readLine();
System.out.print("\f");//to clear the screen for the next window
{
if(s1.equalsIgnoreCase("Chandigarh"))
{
System.out.println("**********In Chandigarh there are currently 3 Cinemas Playing Movies***********");
System.out.println("**********************************They are:************************************");
System.out.println("*****************************1)Fun Republic Cinemas****************************");
System.out.println("*****************************2)DT Cinemas**************************************");
System.out.println("*****************************3)Elante Cinemas**********************************");
System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE FOR YOUR MOVIE THEATRE:");
String s2=bnumba.readLine();
int n1=Integer.parseInt(s2);
switch(n1)
{
case 1:
System.out.println("Fun Republic have the following movies playing: ");
project obj=new project();
obj.display();
break;
case 2:
System.out.println("DT Cinemas have the following movies playing: ");
project obj1=new project();
obj1.display();
break;
case 3:
System.out.println("Elante Cinems have the following movies playing: ");
project obj2=new project();
obj2.display();
break;
default:
System.out.println("These Cinemas do not EXIST");
}
}
else if(s1.equalsIgnoreCase("Delhi"))
{
System.out.println("************In Delhi there are currently 3 Cinemas Playing Movies**************");
System.out.println("**********************************They are:************************************");
System.out.println("********************************1)INOX Cinemas*********************************");
System.out.println("********************************2)Prasads Cinemas******************************");
System.out.println("********************************3)EROS Cinemas*********************************");
System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE FOR YOUR MOVIE THEATRE:");
String s3=bnumba.readLine();
int n2=Integer.parseInt(s3);
switch(n2)
{
case 1:
System.out.println("INOX Cinemas have the following movies playing: ");
project obj4=new project();
obj4.display();
break;
case 2:
System.out.println("Prasads Cinemas have the following movies playing: ");
project obj5=new project();
obj5.display();
break;
case 3:
System.out.println("EROS Cinemas have the following movies playing: ");
project obj6=new project();
obj6.display();
break;
default:
System.out.println("These Cinemas do not EXIST");
}
}
else if(s1.equalsIgnoreCase("Mumbai"))
{
System.out.println("************In Mumbai there are currently 3 Cinemas Playing Movies*************");
System.out.println("**********************************They are:************************************");
System.out.println("********************************1)Sterling Cineplex****************************");
System.out.println("********************************2)Metro Big Cinemas****************************");
System.out.println("********************************3)Regal Cinemas********************************");
System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE FOR YOUR MOVIE THEATRE:");
String s4=bnumba.readLine();
int n3=Integer.parseInt(s4);
switch(n3)
{
case 1:
System.out.println("Sterling Cineplex have the following movies playing: ");
project obj7=new project();
obj7.display();
break;
case 2:
System.out.println("Metro Big Cinemas have the following movies playing: ");
project obj8=new project();
obj8.display();
break;
case 3:
System.out.println("Regal Cinemas have the following movies playing: ");
project obj9=new project();
obj9.display();
break;
default:
System.out.println("These Cinemas do not EXIST");
}
}
else if(s1.equalsIgnoreCase("Gurgaon"))
{
System.out.println("***********In Gurgaon there are currently 3 Cinemas Playing Movies*************");
System.out.println("**********************************They are:************************************");
System.out.println("********************************1)Omaxe Cinemas********************************");
System.out.println("********************************2)Ambience Cinemas*****************************");
System.out.println("********************************3)PVR Cinemas**********************************");
System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE FOR YOUR MOVIE THEATRE:");
String s5=bnumba.readLine();
int n4=Integer.parseInt(s5);
switch(n4)
{
case 1:
System.out.println("Omaxe Cinemas have the following movies playing: ");
project obj10=new project();
obj10.display();
break;
case 2:
System.out.println("Ambience Cinemas have the following movies playing: ");
project obj11=new project();
obj11.display();
break;
case 3:
System.out.println("PVR Cinemas have the following movies playing: ");
project obj12=new project();
obj12.display();
break;
default:
System.out.println("These Cinemas do not EXIST");
}
}
else if(s1.equalsIgnoreCase("Bangalore"))
{
System.out.println("***********In Bangalore there are currently 3 Cinemas Playing Movies***********");
System.out.println("**********************************They are:************************************");
System.out.println("********************************1)Forum Cinemas********************************");
System.out.println("********************************2)Vision Cinemas*******************************");
System.out.println("********************************3)Cauvery Theatre******************************");
System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE FOR YOUR MOVIE THEATRE:");
String s6=bnumba.readLine();
int n5=Integer.parseInt(s6);
switch(n5)
{
case 1:
System.out.println("Forum Cinemas have the following movies playing: ");
project obj13=new project();
obj13.display();
break;
case 2:
System.out.println("Vision Cinemas have the following movies playing: ");
project obj14=new project();
obj14.display();
break;
case 3:
System.out.println("Cauvery Theatre have the following movies playing: ");
project obj16=new project();
obj16.display();
break;
default:
System.out.println("These Cinemas do not EXIST");
}
}
else
{
System.out.println("WE DO NOT HAVE ANY CINEMAS AVAILABLE FOR THIS CITY");
}
}
}
}






