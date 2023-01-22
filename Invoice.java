public class Invoice {
    private String number; /* part number */
    private String description; /* part description */
    private int quantity; /* quantity of item */
    private double price;/* price per item */
    private double amount;

    /* constructor */
    public Invoice(String initial_number,
            String initial_description,
            int initial_quantity,
            double initial_price) {
        number = initial_number;
        description = initial_description;
        quantity = initial_quantity;
        price = initial_price;
    }

    /* setters */

    public void setNumber(String initial_number) {
        number = initial_number;
    }

    public void setDescription(String initial_description) {
        number = initial_description;
    }

    public void setQuantity(int initial_quantity) {
        number = initial_quantity;
    }

    public void setPrice(double initial_price) {
        number = initial_price;
    }

    /* getters */

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        amount = quantity * price;
        if (quantity < 0) {
            quantity = 0;
        }
        if (price < 0.0) {
            price = 0.0;
        }
        return amount;

    }

}