import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    StringList stringList = new StringListImpl(10);
    String one = "ONE";
    String two = "TWO";
    String three = "THREE";

    @org.junit.jupiter.api.Test
    void add() {
        String actualOne = stringList.add(one);
        String actualTwo = stringList.add(two);

        String actualThree = stringList.add(2, three);

        assertEquals(one, actualOne);
        assertEquals(two, actualTwo);

        assertTrue(stringList.contains(one));

        assertTrue(stringList.size() == 3);



    }

    @org.junit.jupiter.api.Test
    void testAddNegative() {
        assertThrows(ItemNotBeNullException.class, ()
                -> stringList.add(null));

        assertThrows(IndexIsOutOfStorageException.class, ()
                -> stringList.add(3, three));

        assertThrows(UnavailableIndexValueException.class, ()
                -> stringList.add(-3, three));

    }

    @org.junit.jupiter.api.Test
    void set() {
        String actual = stringList.set(0, two);
        assertEquals(actual, two);

        assertThrows(ItemNotBeNullException.class, ()
                -> stringList.set(0, null));

        assertThrows(IndexIsOutOfStorageException.class, ()
                -> stringList.set(3, three));

        assertThrows(UnavailableIndexValueException.class, ()
                -> stringList.set(-3, three));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        stringList.add(one);
        stringList.add(two);
        String actual = stringList.remove(1);
        assertEquals(actual, two);

    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        stringList.add(one);
        String actual = stringList.remove(one);
        assertEquals(actual, one);
    }

    @org.junit.jupiter.api.Test
    void contains() {
        stringList.add(one);
        boolean actual = stringList.contains(one);
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        stringList.add(one);
        int actualInx = stringList.indexOf(one);
        assertEquals(0, actualInx);
    }

    @org.junit.jupiter.api.Test
    void lastIndexOf() {
        stringList.add(one);
        stringList.add(two);
        stringList.add(three);
        int actualInx = stringList.lastIndexOf(one);
        assertEquals(0, actualInx);

    }

    @org.junit.jupiter.api.Test
    void get() {
        stringList.add(one);
        String actual = stringList.get(0);
        assertEquals(one, actual );
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        stringList.add(one);

        StringListImpl otherArrayList = new StringListImpl(10);

        otherArrayList.add(one);

        assertTrue(stringList.equals(otherArrayList));
    }

    @org.junit.jupiter.api.Test
    void size() {
        stringList.add(one);
        int actual = stringList.size();
        assertEquals(1, actual);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(stringList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void clear() {
        stringList.add(one);
        stringList.add(two);
        stringList.add(three);
        stringList.clear();
        assertTrue(stringList.isEmpty());

    }

    @org.junit.jupiter.api.Test
    void toArray() {
        stringList.add(one);
        stringList.add(two);
        stringList.add(three);

        String[] expArray = {one, two, three};
        String[] actual = stringList.toArray();

        assertTrue(Arrays.equals(expArray, actual));
    }
}