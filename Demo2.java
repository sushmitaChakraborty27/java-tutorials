//static variable, method and block

class Mobile {
   private String brand;
   private int price;
   private static String type;


    public static void getInfo(){
        System.out.println("Accomodity Type is : " +type);
    }

    public void getInfo1(){
        System.out.println(brand + " : " + price);
    }


    //default constructor
    public Mobile() {
        System.out.println("Inside Default Constructor.");
        this.brand = "Vivo";
        this.price = 10000;
    }

    //parameterized constructor
    public Mobile(String brand, int price) {
        System.out.println("Inside Parameterized Constructor.");
        this.brand = brand;
        this.price = price;
    }

    //static block
    static {
        type = "Smartphone";
        System.out.println("Inside STATIC block.");
    }

   //setters and getters
   public String getBrand() {
    return brand;
   }
   public void setBrand(String brand) {
    this.brand = brand;
   }
   public int getPrice() {
    return price;
   }
   public void setPrice(int price) {
    this.price = price;
   }
   public static String getType() {
    return type;
   }
   public static void setType(String type) {
    Mobile.type = type;
   } 

   
}

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("Mobile");
        /*Mobile new_mob_obj_1 = new Mobile();
        Mobile.getInfo();

        new_mob_obj_1.getInfo1();*/
    }
}
