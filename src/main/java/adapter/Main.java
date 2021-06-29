package adapter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://test.text");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        while(line != null && !line.equals("")) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
