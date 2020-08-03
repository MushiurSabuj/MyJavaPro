public class GoogleMeeting {

    public GoogleMeeting(){
        System.out.println("I am default constructor.");
    }
    public GoogleMeeting(String weCanCall){
        System.out.println("We can call : " + weCanCall);
    }

    public static void main(String[] args) {
        GoogleMeeting myGoogleMeeting = new GoogleMeeting("value");
    }



}
