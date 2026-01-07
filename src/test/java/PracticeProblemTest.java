import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   public void q1Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q1();

     // assertion
     assertEquals("10\n30\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q2Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q2();

     // assertion
     assertEquals("3\n1\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q3Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q3();

     // assertion
     assertEquals("1.0192307692307692\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q4Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q4();

     // assertion
     assertEquals("20\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q5Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q5();

     // assertion
     assertEquals("8.5\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   
}
