public class CustomizedParameter {

    public CustomizedParameter(String peopleOfUSA){
        System.out.println("The population of USA : " + peopleOfUSA);
    }
    public CustomizedParameter(String peopleOfChina, int population){
        System.out.println("China's Population : " + peopleOfChina + "Total Population : " + population);
    }
    public CustomizedParameter(String peopleOfRusia, float populations, String ageGroup){
        System.out.println("The total population of Rusia : " + peopleOfRusia + " total population : " + populations + " People age group : " + ageGroup);
    }

    public static void main(String[] args) {
        CustomizedParameter countryOfUSA = new CustomizedParameter("Americans");
        CustomizedParameter countryOfChina = new CustomizedParameter("Chines", 120);
        CustomizedParameter countryOfRusia = new CustomizedParameter("Rusian", 100, "Twenty");
    }




}
