public class Main {
    public static void main(String[] args) {

        // OCP (rectangle, circle, and ellipse)
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape ellipse = new Ellipse(10,15);

        AreaCalculator calculator = new AreaCalculator();
        System.out.printf("Rectangle Area: %.2f%n" , calculator.calculateArea(rectangle));
        System.out.printf("Circle Area: %.2f%n" , calculator.calculateArea(circle));
        System.out.printf("Ellipse: %.2f%n" , calculator.calculateArea(ellipse));
        /* ถาม chat เกี่ยวกับถ้าจะให้แสดงทศนิมยมแค่สองตำแหน่ง ได้ว่าให้ใช้ System.out.printf() เพื่อจัดรูปแบบ %.2f หมายถึงการแสดงผลตัวเลขทศนิยม 2 ตำแหน่ง %n หมายถึงการขึ้นบรรทัดใหม่ (new line) */
        System.out.println();

        // LSP (penguin, ostrich, sparrow, and eagle)
        Penguin penpen = new Penguin();
        Ostrich ostrich = new Ostrich();
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        penpen.move();
        ostrich.move();
        sparrow.move();
        sparrow.fly();
        eagle.move();
        eagle.fly();

        System.out.println();

        // DIP
        Order order1 = new Order("696");
        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        orderProcessor.processOrder(order1);
        Order order2 = new Order("969");
        OrderProcessor orderProcessorWithSMS = new OrderProcessor(new SMSNotifier());
        orderProcessorWithSMS.processOrder(order2);
    }
}
