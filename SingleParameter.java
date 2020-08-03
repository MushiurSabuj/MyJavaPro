public class SingleParameter {
    public SingleParameter() {
        System.out.println("I am default printer");
    }

    public SingleParameter(String firstName) {
        System.out.println("Employee First Name : " + firstName);
    }

    public static void main(String[] args) {
        SingleParameter myParameter =new SingleParameter("John");
    }
}
