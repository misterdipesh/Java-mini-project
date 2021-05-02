import java.io.*;
import java.util.*;
public class Toppings
{
    String Sause;
    ArrayList<String> meatToppings=new ArrayList<String>();
    ArrayList<String> otherToppings=new ArrayList<String>();
    
    float Price=0.00f;
    public void addSause(String sause)
    {
        Sause=sause;
        if (sause=="Tomato-paste")
        {
            Price=Price+1.00f;
        }
        else if (sause=="barbeque-flavoured")
        {
            Price=Price+1.80f;
        }
        
    }
    public void addMeatTopping(String topping)
    {
        meatToppings.add(topping);
        switch (topping)
        {
            case "ham":
                Price=Price+0.50f;
                break;
            case "salami":
                Price=Price+0.50f;
                break;
            case "bacon":
                Price=Price+0.90f;
                break;
            case "chicken":
                Price=Price+2.00f;
                break; 
            case "shrimp":
                Price=Price+1.40f;
                break;
        }
    }
    public void addOtherTopping(String topping)
    {
        otherToppings.add(topping);
        switch (topping)
        {
            case "capsicum":
                Price=Price+0.30f;
                break;
            case "onion":
                Price=Price+0.20f;
                break;
            case "tomatoes":
                Price=Price+0.40f;
                break;
            case "mushrooms":
                Price=Price+0.45f;
                break; 
            case "pineapples":
                Price=Price+0.45f;
                break;
        }
    }
    public float returnPriceOfTopping()
    {
        return Price;
    }
    public void to_String()
    {
        for (String item : meatToppings) { 		      
           System.out.println(item); 		
      }
      for (String item : otherToppings) { 		      
           System.out.println(item); 		
      }
    }
}