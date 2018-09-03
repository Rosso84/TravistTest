


import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class AppTest {


    @Test
    public void getI() {
        int i = 2;

        App foo = new App();

        int iVariable = foo.getI();

        assertEquals(i, iVariable);
    }

}
