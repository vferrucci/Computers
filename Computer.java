/**
*@author: Veranika Tolkach
*Assignment 5
This code creates a class that holds computers' values in instance fields.
*/

public class Computer
{
   private String brand;
   private String name;
   private String color;
   private String ram;
   private String storageCapacity;
   private String operatingSys;
   private double price;
   
   public String toString()
   {
   String compInfo;
   compInfo="Laptop "+brand+" "+name+". Color: "+color+
            ". RAM: "+ram+". Storage capacity: "+storageCapacity+
            ". Operating system: "+operatingSys+". Price: $"+price;
   return compInfo;
   }//end toString
   
   //default constructor
   public Computer()
   {
      brand="Microsoft";
      name="Surface";
      color="Blue";
      ram="8GB";
      storageCapacity="256GB";
      operatingSys="Windows 10 Home";
      price=1299.00;
   }//end of default constructor

   //constructor with parameters
   public Computer(String brand, String name, String color, String ram, 
                   String storageCapacity, String operatingSys, double price)
   {
      this.brand=brand;
      this.name=name;
      this.color=color;
      this.ram=ram;
      this.storageCapacity=storageCapacity;
      this.operatingSys=operatingSys;
      this.price=price;
   }//end of constructor with parameters
                   
   /**
   the setColor methods allows code outside the class
   to store a value in the color field
   */
   public void setColor(String col)
   {
      color=col;
   }
   
    /**
   The setRam methods allows code outside the class
   to store a value in the ram field
   */
     public void setRam(String ramMemo)
   {
      ram=ramMemo;
   }
   
   /**
   The getColor method allows the code outside the class
   to get the value stored in the color field
   */
   public String getColor()
   {
      return color;
   }
   
   /**
   The getRam method allows the code outside the class
   to get the value stored in the ram field
   */
   public String getRam()
   {
      return ram;
   }

}//end Computer classs