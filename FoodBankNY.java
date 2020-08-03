public class FoodBankNY {
    public FoodBankNY() {
        System.out.println("I am default constructor.");
    }
    public FoodBankNY(String asianFood) {
        System.out.println("Tasty food: " + asianFood);
    }
    public FoodBankNY(String bangladeshiFood, int numberOfDish){
    System.out.println("Tasty Bangladeshi Food : " + bangladeshiFood + " Number of dish : " + numberOfDish);
    }
    public FoodBankNY (String indianFood, int numberOfDish, String takeHome){
    System.out.println("Tasty Indian Food : " + indianFood + " Number of dish : " + numberOfDish + " Do you want take home : " + takeHome);
    }

    public static void main(String[] args) {
        FoodBankNY myFood = new FoodBankNY();
        FoodBankNY bengaliFood = new FoodBankNY("Rice" , 10);
        FoodBankNY myAsianFood = new FoodBankNY("Curry", 20);
        FoodBankNY tastyIndianFood = new FoodBankNY("Pani-Puri", 15);
        FoodBankNY saltyFood = new FoodBankNY("Roti");
        FoodBankNY serviceType = new FoodBankNY("Samasa",25,"yes");

    }
}

