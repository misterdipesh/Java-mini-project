
import java.util.*; 

    

public class Main
{
	public static void main(String[] args) 
	{
	    for(int i=0;i<3;i++)
        {
            System.out.println("Welcome User");
            System.out.println("Please select an option");
            Scanner sc= new Scanner(System.in);
            String size="";
            String crust="";
            System.out.println("Pizza Size");
            System.out.println("1.small");
            System.out.println("2.medium");
            System.out.println("3.large");
            int size_in_int= sc.nextInt();
            if (size_in_int==1)
            {
               size="small"; 
            }
            else if(size_in_int==2)
            {
                size="medium";
            }
            else if(size_in_int==3)
            {
                size="large";
            }
            System.out.println("Please select an option:");
            System.out.println("Pizza Crust");
            System.out.println("1.thin");
            System.out.println("2.thick");
            int crust_in_int= sc.nextInt();
            if (crust_in_int==1)
            {
                crust="thin";
            }
            else if(crust_in_int==2)
            {
                crust="thick";
            }
            Pizza myPizza=new Pizza();
            Toppings myToppings=new Toppings();
            System.out.println("Please select an option: ");
            System.out.println("Sause");
            System.out.println("1.Tomato-paste");
            System.out.println("2.Barbeque-flavored");
            String sause="";
            int sause_in_int=sc.nextInt();
            if (sause_in_int==1)
           {
               sause="Tomato-paste";
           }
           else if (sause_in_int==2)
           {
               sause="barbeque-flavoured";
           }
           myToppings.addSause(sause);
           System.out.println("Meat Toppings");
           System.out.println("1.ham");
           System.out.println("2.salami");
           System.out.println("3.bacon");
           System.out.println("4.chicken");
           System.out.println("5.shrim");
           System.out.println("Select 3 of them");
           for (int i=0;i<3;i++)
           {
        	   int toppings_in_int=sc.nextInt();
        	   switch(toppings_in_int)
        	   {
        	       case 1:
                   myToppings.addMeatTopping("ham");
                   break;
                   case 2:
                   myToppings.addMeatTopping("salami");
                   break;
                   case 3:
                   myToppings.addMeatTopping("bacon");
                   break;
                   case 4:
                   myToppings.addMeatTopping("chicken");
                   break;
                   case 5:
                   myToppings.addMeatTopping("shrim");
                   break;
        	           
        	   }
           }
           System.out.println("Other Toppings");
           System.out.println("1.capsicum");
           System.out.println("2.onion");
           System.out.println("3.tomatoes");
           System.out.println("4.mushrooms");
           System.out.println("5.pineapples");
           System.out.println("Select 4 of them");
           for (int i=0;i<4;i++)
           {
        	   int toppings_in_int=sc.nextInt();
        	   switch(toppings_in_int)
        	   {
        	       case 1:
                   myToppings.addOtherTopping("capsicum");
                   break;
                   case 2:
                   myToppings.addOtherTopping("onion");
                   break;
                   case 3:
                   myToppings.addOtherTopping("tomatoes");
                   break;
                   case 4:
                   myToppings.addOtherTopping("mushrooms");
                   break;
                   case 5:
                   myToppings.addOtherTopping("pineapples");
                   break;
        	           
        	   }
           }
            myPizza.calcPrice();
            System.out.println("Price");
            myPizza.totalPrice(myToppings.returnPriceOfTopping());
            System.out.println("Toppings");
            myToppings.to_String();
            myPizza.to_String();
        }
    
        
	
	}
}
