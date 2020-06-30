import java.text.NumberFormat;

public class Product {

    protected String code;
    protected String description;
    protected double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    public Product(String code,String description,double price){
        this.code=code;
        this.description=description;
        this.price=price;
    }

    public void setCode(String code){
        this.code=code;
    }
    public String getCode() {
        return this.code;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription() {
        return this.description;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }
    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}
