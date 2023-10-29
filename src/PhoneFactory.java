class PhoneFactory {
    public iPhone createiPhone(iPhoneModel model, String color, int storage) {
        double price = 0.0;

        switch (model) {
            case IPHONE_15:
                price = 999.99;
                break;
            case IPHONE_14:
                price = 799.99;
                break;
            case IPHONE_SE3:
                price = 399.99;
                break;
        }

        return new iPhone(model.name(), color, storage, price);
    }
}
