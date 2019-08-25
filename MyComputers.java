/**
*@author: Veronika Ferrucci
This program displays information about 6 computers.
It uses a constructor to initialize the values.
*/

public class MyComputers
{
   public static void main(String[] args)
   {
      //creates computer objects and initializes them with values
      Computer comp1=new Computer("Dell","Inspiron Chromebook","Black",
                                  "4GB","16GB","Chrome",129.00);
      System.out.println(comp1.toString());
      
      Computer comp2=new Computer("HP","AMD A-6","Jet Black",
                                  "4GB","1TB","Windows 10 Home in S mode",249.99);
      System.out.println(comp2.toString());
      
      Computer comp3=new Computer("ASUS","AMD A-12","Matte Silver",
                                  "8GB","128GB","Windows 10 Home",299.99);
      System.out.println(comp3.toString());
      
      Computer comp4=new Computer("Lenovo","330S","Midnight Blue",
                                  "4GB","128GB","Windows 10 Home in S mode",339.99);
      System.out.println(comp4.toString());
      
      Computer comp5=new Computer("HP","Pavilion x360","Natural Silver",
                                  "8GB","128GB","Windows 10 Home",499.99);
      System.out.println(comp5.toString());
      
      Computer compDefault=new Computer();//calls the default constructor
      System.out.println(compDefault.toString());
   
      //changes the color and ram values of one of the computers
      comp1.setColor("Purple dots");
      comp1.setRam("32GB");
      comp1.getColor();
      comp1.getRam();
      System.out.println("The updated laptop:\n"+
                          comp1.toString());
   }//end main

}//end MyComputers class
