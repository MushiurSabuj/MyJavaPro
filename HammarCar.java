public class HammarCar {

    public static void main(String [] args) {
        HammarCar MyCar = new HammarCar();
        MyCar.StrongEnginePower();
        String SmoothCar = MyCar.StrongEnginePower();
        System.out.println(SmoothCar);


        MyCar.NumberOfCar();
        int Numbers = MyCar.NumberOfCar();
        System.out.println(Numbers);

        MyCar.LongDrive();
        boolean DoYouWantLongDrive = MyCar.LongDrive();
        System.out.println(DoYouWantLongDrive);
    }
    public String StrongEnginePower(){
        String SmoothCar = " Hammer is the best interms of engine power";
        return SmoothCar;
    }
    public int NumberOfCar(){
        int Numbers = 10;
        return Numbers;
    }
    public boolean LongDrive(){
        boolean DoYouWantLongDrive = true;
        return DoYouWantLongDrive;
    }
}

