public class PizzaHut {
    public PizzaHut(){
        System.out.println("I am default constructor");
    }
    public PizzaHut(String storeName){
        System.out.println("Store Name : " + storeName);
    }
    public PizzaHut(String address, String location){
        System.out.println("Street Address : " + address + " Store Location : " + location);
    }

    public static void main(String[] args) {
        PizzaHut myPizza = new PizzaHut("JVM", "102 34th ave");
    }
}
