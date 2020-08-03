public class ToyStore {
    public static void main(String[] args) {
        ToyStore PlayingToy = new ToyStore();
        PlayingToy.BellBlvdStore();
        String MyToyStore = PlayingToy.BellBlvdStore();
        System.out.println(MyToyStore);

        PlayingToy.QueensBlvdStore();
        float ColorFullToy = PlayingToy.QueensBlvdStore();
        System.out.println(ColorFullToy);
    }
    public String BellBlvdStore(){
        String MyToyStore = "Bell Blvd has a really big toy store which has a great price.";
        return MyToyStore;
    }
    public float QueensBlvdStore(){
        float ColorFullToy = 4.55f;
        return ColorFullToy;

    }
}
