/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC14_Group_02_Assignment_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void itemTests(){
        Item testItem = new Item("testCategory", 101, "food1", 2, 1.5f);

        assertEquals(testItem.getCategory(), "testCategory");
        testItem.setCategory("changedCategory");
        assertEquals(testItem.getCategory(), "changedCategory");

        assertEquals(testItem.getCode(), 101);
        testItem.setCode(555);
        assertEquals(testItem.getCode(), 555);

        assertEquals(testItem.getQuantity(), 2);
        testItem.setQuantity(50);
        assertEquals(testItem.getQuantity(), 50);

        assertEquals(testItem.getName(), "food1");
        testItem.setName("drink1");
        assertEquals(testItem.getName(), "drink1");

        assertEquals(testItem.getPrice(), 1.5f);
        testItem.setPrice(3.5f);
        assertEquals(testItem.getPrice(), 3.5f);

        String expected = "===== Item Details: =====\n";
        expected += ("Item Code: " + testItem.getCode() + "\n");
        expected += ("Item Name: " + testItem.getName() + "\n");
        expected += ("Item Quantity: " + testItem.getQuantity() + "\n");
        expected += ("Item Price: " + testItem.getPrice() + "\n");

        assertEquals(expected, testItem.viewItemDetails(testItem));

    }

}
