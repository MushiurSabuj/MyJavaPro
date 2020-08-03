public class Computer {
    public static void main(String[] args) {
        Computer SuperComputer = new Computer();
        SuperComputer.Laptop();
        String MyComputer = SuperComputer.Laptop();
        System.out.println(MyComputer);

        SuperComputer.Desktop();
        int NumberOfComputer = SuperComputer.Desktop();
        System.out.println(NumberOfComputer);

        SuperComputer.OldComputer();
        Double MyOldComputer = SuperComputer.OldComputer();
        System.out.println(MyOldComputer);
    }

    public String Laptop(){
        String MyComputer= "I have a Laptop that is old and super slow.";
        return MyComputer;
    }
    public int Desktop(){
        int NumberOfDesktop = 2;
        return NumberOfDesktop;

    }
    public Double OldComputer(){
        Double MyOldComputer = 4.999999999;
        return MyOldComputer;
    }
}
