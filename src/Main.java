public class Main {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();

        iPhone iPhone15 = factory.createiPhone(iPhoneModel.IPHONE_15, "Black", 512);
        iPhone iPhone14 = factory.createiPhone(iPhoneModel.IPHONE_14, "Green", 256);
        iPhone iPhoneSE3 = factory.createiPhone(iPhoneModel.IPHONE_SE3, "Red", 128);

        System.out.println("iPhone 15 Details:");
        iPhone15.displayInfo();

        System.out.println("\niPhone 14 Details:");
        iPhone14.displayInfo();

        System.out.println("\niPhone SE3 Details:");
        iPhoneSE3.displayInfo();
    }
}