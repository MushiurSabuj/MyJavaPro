public class HardwareStore {
    public static void main(String[] args) {
        HardwareStore MyStore = new HardwareStore();
        MyStore.StoreHours();
        boolean StoreOpen = MyStore.StoreHours();
        System.out.println(StoreOpen);

        MyStore.GoodsType();
        String VariousType = MyStore.GoodsType();
        System.out.println(VariousType);
    }
    public boolean StoreHours(){
        boolean StoreOpen = true;
        return StoreOpen;
    }
    public String GoodsType(){
        String VariousType =" There are different Type of Goods in the hardware store";
        return VariousType;
    }
}
