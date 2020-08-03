public class FastFood {
    public static void main(String[] args) {
        FastFood MyFastFood = new FastFood();
        MyFastFood.FriedChicken();
        String TypeOfChicken = MyFastFood.FriedChicken();
        System.out.println(TypeOfChicken);

        FastFood MyChickenOverRice = new FastFood();
        MyChickenOverRice.Method();
        int x = MyChickenOverRice.Method();
        System.out.println(x);

        //FastFood MyChickenOverRice = new FastFood();
        MyChickenOverRice.BeefBurger();
        String EnjoyFood = MyChickenOverRice.BeefBurger();
        System.out.println(EnjoyFood);
    }
    public String FriedChicken() {
        String TypeOfChicken =" It is very eazy to cook fried chicken";
        return TypeOfChicken;

    }
    public int Method() {
        int x = 202;
        return x;
    }
    public String BeefBurger() {
        String EnjoyFood ="I like Beef Burger, because it is ful of taste";
        return EnjoyFood;
    }
}
