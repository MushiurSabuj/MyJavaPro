public class BengalBay {

    public static void main(String[] args) {
        BengalBay MyBay = new BengalBay();
        MyBay.Enjoy();
        String Party = MyBay.Enjoy();
        System.out.println(Party);

        BengalBay MyPeople = new BengalBay();
        MyPeople.Wave();
        String People = MyPeople.Wave();
        System.out.println(People);
    }
    public String Wave(){
        String People = "Who are those People";
        return People;
    }
    public String Enjoy(){
        int NumberOfNum = 4;
        String Party = "Let's go party";
        return Party;
    }
}
