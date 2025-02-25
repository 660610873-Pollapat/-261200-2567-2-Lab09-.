public class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        // Process order
        System.out.println("Order processed: " + order.getOrderId());
        notificationService.notify("Order processed");
    }
}