package academy.pocu.comp2500.assignment2;

public class WallCalendar extends Calendar {

    protected WallCalendar(int productId, ShippingMethod shippingMethod) {
        super(productId, 40, 40, 1000, 0xFFFFFF, shippingMethod);
    }
}