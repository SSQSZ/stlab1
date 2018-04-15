package stlab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Tri tri = new Tri();
        assertEquals("等边三角形",tri.isTri(1, 1, 1));
        assertEquals("不是三角形",tri.isTri(0, 1, 2));
        assertEquals("直角三角形",tri.isTri(3, 4, 5));
        assertEquals("等腰三角形",tri.isTri(3, 3, 5));
        assertEquals("一般三角形",tri.isTri(4, 6, 7));
    }

}