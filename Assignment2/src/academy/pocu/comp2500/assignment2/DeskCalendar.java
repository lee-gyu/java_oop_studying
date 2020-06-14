package academy.pocu.comp2500.assignment2;

public class DeskCalendar extends Calendar {

    public DeskCalendar(int productId, ShippingMethod shippingMethod) {
        super(productId, 20, 15, 1000, 0xFFFFFF, shippingMethod);
    }
}
