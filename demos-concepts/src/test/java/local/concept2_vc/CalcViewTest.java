package local.concept2_vc;

import org.junit.jupiter.api.Test;

// import java.io.ByteArrayInputStream;
// import java.io.ByteArrayOutputStream;
// import java.io.InputStream;
// import java.io.PrintStream;
// import java.util.NoSuchElementException;

// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;

// import org.mockito.Mockito;

public class CalcViewTest {

    @Test
    void testShow() {

        CalcController ctrl = new CalcController();
        CalcView view = new CalcView(ctrl);
        view.show();
        
    }

    // private CalcController ctrMock;
    // private CalcView view;

    // InputStream originalIn;
    // ByteArrayInputStream inputStream;

    // PrintStream originalOut;
    // ByteArrayOutputStream outputStream;

    // @BeforeEach
    // public void setUp() {

    //     System.out.println("Setting up ConsoleTest...");
    //     originalIn = System.in;

    //     System.out.println("Setting up ConsoleTest...");
    //     originalOut = System.out;
    //     outputStream = new ByteArrayOutputStream();
    //     System.setOut(new PrintStream(outputStream));

    //     ctrMock = Mockito.mock(CalcController.class);
    //     view = new CalcView(ctrMock);
    // }

    // @Test
    // public void testShowAdd() {
    //     ctrMock.setNum1(2);
    //     ctrMock.setNum2(3);
    //     Mockito.when(ctrMock.add()).thenReturn(5);

    //     // Simulate user input 3
    //     inputStream = new ByteArrayInputStream("3".getBytes());
    //     System.setIn(inputStream);
    //     try {
    //         view.show();
    //     } catch (NoSuchElementException e) {

    //     }

    //     // Verify that the controller's add method was called
    //     Mockito.verify(ctrMock).add();
    //     // Verify terminal output

    //     String output = outputStream.toString().trim();
    //     assert output.contains("El resultado de la suma es 5") : "Output did not contain expected result.";

    // }

    // @Test
    // public void testShowSubtraction() {
    //     ctrMock.setNum1(5);
    //     ctrMock.setNum2(3);
    //     Mockito.when(ctrMock.subtract()).thenReturn(2);

    //     // Simulate user input 3
    //     inputStream = new ByteArrayInputStream("4".getBytes());
    //     System.setIn(inputStream);
    //     try {
    //         view.show();
    //     } catch (NoSuchElementException e) {

    //     }

    //     // Verify that the controller's add method was called
    //     Mockito.verify(ctrMock).subtract();
    //     // Verify terminal output

    //     String output = outputStream.toString().trim();
    //     assert output.contains("El resultado de la resta es 2") : "Output did not contain expected result.";

    // }

    // @AfterEach
    // public void tearDown() {
    //     System.setIn(originalIn);
    //     System.setOut(originalOut);
    // }
}
