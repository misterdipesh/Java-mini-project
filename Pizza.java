public class Pizza
{
    String Size;
    String Crust;
    float Price;
    Pizza()
    {
        Size="medium";
        Crust="thin";
        Price=0.00f;
    }
    public void calcPrice()
    {
        switch(Size)
        {
            case "small":
                Price=5.50f;
            break;
            case "medium":
                Price=9.10f;
            break;
            case "large":
                Price=12.70f;
            break;
        }
      if (Crust=="thick")
      {
          Price=Price+2.20f;
      }
    }
    public void display()
    {
        System.out.println("Pizza size = "+Size);
        System.out.println("Pizza crust = "+Crust);
        System.out.println("Pizza price = "+Price);
    }
    public void setSize(String size)
    {
        Size=size;
    }
    public void setCrust(String crust)
    {
        Crust=crust;
    }
    public void totalPrice(float price)
    {
       Price=Price+ price;
       System.out.println(Price);
    }
    public void to_String()
    {
        System.out.println(Crust);
        System.out.println(Size);
    }
}
