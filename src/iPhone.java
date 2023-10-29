class iPhone {
    private String model;
    private String color;
    private int storage;
    private double price;

    public iPhone(String model, String color, int storage, double price) {
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("iPhone Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + price);
    }
}
