package Practices.day04;

public class Carpet {

    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(double width, double length, boolean isPersian,
                  double unitPrice) {
        this.width = width;
        this.length = length;
        this.isPersian = isPersian;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;

        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = width * length * unitPrice;

        if (isPersian) {
            totalPrice += 200;

        }
    }

    @Override
    public String toString() {
        return (isPersian ? "The Persian Carpet " : "The Carpet ") +
                "\n has dimensions of " + length + " x " + width +
                "\n The unit price is " + unitPrice +
                "\n All coming price is " + totalPrice;

    }
}

