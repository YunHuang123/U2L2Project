public class U2L2Runner {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();
        rect.setWidth(125);
        rect2.setWidth(125);
        rect3.setWidth(125);
        rect.printRectangleInfo();
        rect2.printRectangleInfo();
        rect3.printRectangleInfo();
        System.out.println();

        int perimeter = 2 * rect.getLength() + 2 * rect.getWidth();
        System.out.println("The perimeter of the first rectangle is " + perimeter);
        int perimeter2 = 2 * rect2.getLength() + 2 * rect2.getWidth();
        System.out.println("The perimeter of the second recangle is " + perimeter2);
        int perimeter3 = 2 * rect3.getLength() + 2 * rect3.getWidth();
        System.out.println("The perimeter of rectangle 3 is " + perimeter3);
    }
}
