public class DoubleParameter {
    public DoubleParameter(){
    System.out.println("i am default constructor");
}
    public DoubleParameter(int id, String name){
    System.out.println("Employee ID : " + id + " Employee Name : " + name);
}

    public static void main(String[] args) {
        DoubleParameter myParameters = new DoubleParameter(12, "John Smith");
    }

}
