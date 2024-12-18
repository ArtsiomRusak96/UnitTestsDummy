import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleJUnitTests {

    @Test
    public void checkGettingLengthTest() {
        Rectangle rectangle = new Rectangle(4.6, 7.1);
        assertEquals("The length of rectangle should be:", 4.6, rectangle.getLength(), 0.000001);
    }

    @Test
    public void checkGettingWidthTest() {
        Rectangle rectangle = new Rectangle(3.0, 9.5);
        assertEquals("The width of rectangle should be:", 9.5, rectangle.getWidth(), 0.000001);
    }

    @Test
    public void checkSettingLengthTest() {
        Rectangle rectangle = new Rectangle(1.0, 1.1);
        rectangle.setLength(5.5);
        assertEquals("The length of rectangle should be:", 5.5, rectangle.getLength(), 0.000001);
    }

    @Test
    public void checkSettingWidthTest() {
        Rectangle rectangle = new Rectangle(1.0, 1.1);
        rectangle.setWidth(6.6);
        assertEquals("The width of rectangle should be:", 6.6, rectangle.getWidth(), 0.000001);
    }

    @Test
    public void checkGettingArea() {
        Rectangle rectangle = new Rectangle(3.3, 8.0);
        assertEquals("The area of rectangle should be:", 26.4, rectangle.getArea(), 0.000001);
    }
}
