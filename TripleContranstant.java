public class TripleContranstant {

    public TripleContranstant(){
        System.out.println("I am Default");
    }
    public TripleContranstant(int weather){
        System.out.println("What is the weather Today : " + weather);
    }
    public TripleContranstant(String hotWeather, int temparature){
        System.out.println("Hot Weather Today : " + hotWeather + "Today's Temparature : " + temparature);
    }
    public TripleContranstant(String isHotToday, String TodayTemparature, int newsChannel){
        System.out.println("Is hot Today : " + isHotToday + "Today's temparature : " + TodayTemparature + "News Channel : " + newsChannel);
    }

    public static void main(String[] args) {
        TripleContranstant myWeather = new TripleContranstant(35);
        TripleContranstant hotWeather = new TripleContranstant("No", 24);
        TripleContranstant hotSummer = new TripleContranstant("No","ten",9);
    }
}
