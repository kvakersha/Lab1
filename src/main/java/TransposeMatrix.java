import java.util.*;
import java.lang.*;
import java.io.*;


public class TransposeMatrix {

    public static ArrayList<Integer>Init() throws  IOException
    {
        int columns;
        int rows;
        ArrayList<Integer>list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        Scanner input = new Scanner(new File("src/test.txt"));
        //catch(FileNotFoundExeption){}
        while (input.hasNextLine()) {
            Scanner colReader = new Scanner(input.nextLine());
            ArrayList col = new ArrayList();

            while (colReader.hasNextInt()) {
                col.add(colReader.nextInt());
            }
            a.add(col);
        }
        rows = a.size();
        columns = a.get(0).size();
        list.add(rows);
        list.add(columns);
        return list;
    }

    public static ArrayList<ArrayList<Integer>>Init2() throws  IOException
    {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        Scanner input = new Scanner(new File("src/test.txt"));
        //catch(FileNotFoundExeption){}
        while (input.hasNextLine()) {
            Scanner colReader = new Scanner(input.nextLine());
            ArrayList col = new ArrayList();

            while (colReader.hasNextInt()) {
                col.add(colReader.nextInt());
            }
            a.add(col);
        }
        return a;
    }

    public static ArrayList<ArrayList<Integer>> Transpose() throws IOException{
        ArrayList<Integer>list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
        a = Init2();
        list = Init();
        int rows = list.get(0);
        int columns = list.get(1);
        int[][] t = new int[rows][columns];
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                t[j][i] = a.get(i).get(j);
            }
        }

        for(int i=0; i<a.size(); i++)
        {
            ArrayList<Integer>list2 = new ArrayList<Integer>();
            for(int j=0; j<a.get(0).size(); j++)
            {
                list2.add(t[i][j]);
            }
            b.add(list2);
        }

        return b;
    }
}