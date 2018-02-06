import java.util.*;
import java.lang.*;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;



public class TransposeMatrixTest {
    @Test
    public  void TestTransposeMatrix()
    {
        try {
            ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
            Scanner input = new Scanner(new File("src/test2.txt"));
            while(input.hasNextLine())
            {
                Scanner colReader = new Scanner(input.nextLine());
                ArrayList col = new ArrayList();

                while(colReader.hasNextInt())
                {
                    col.add(colReader.nextInt());
                }
                expected.add(col);
            }

            ArrayList<ArrayList<Integer>>actual = TransposeMatrix.Transpose();

            assertTrue(expected.equals(actual));


        } catch (IOException ex) {

        }

    }
}
