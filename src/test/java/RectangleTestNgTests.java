import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTestNgTests {

    @Test
    public void checkGettingLengthTest() {
        Rectangle rectangle = new Rectangle(3.3, 5.1);
        assertEquals(rectangle.getLength(), 3.3, "The length of rectangle should be:");
    }

    @Test
    public void checkGettingWidthTest() {
        Rectangle rectangle = new Rectangle(12.0, 8.8);
        assertEquals(rectangle.getWidth(), 8.8, "The width of rectangle should be:");
    }

    @Test
    public void checkSettingLengthTest() {
        Rectangle rectangle = new Rectangle(1.1, 2.2);
        rectangle.setLength(460.32);
        assertEquals(rectangle.getLength(), 460.32, "The length of rectangle should be:");
    }

    @Test
    public void checkSettingWidthTest() {
        Rectangle rectangle = new Rectangle(3333.44444, 0.123);
        rectangle.setWidth(13.58);
        assertEquals(rectangle.getWidth(), 13.58, "The width of rectangle should be:");
    }

    @Test
    public void checkGettingArea() {
        Rectangle rectangle = new Rectangle(2.5, 7.8);
        assertEquals(rectangle.getArea(), 19.5, "The area of rectangle should be:");
    }
}
