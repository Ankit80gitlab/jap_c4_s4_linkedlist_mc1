package com.jap.textanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/daffodils.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        String str;
        String str1="";

        int count=0;
        int k=0;
        while ((str = buffer.readLine()) != null)
        {
            String [] fg = str.split("[,   ]");
            k=k+fg.length;
            //System.out.println(k);
            str1=str1+str;
        }

        //String [] arr= str1.split("[. , ; :   ]+");
        String[] arr= str1.split("[,:.;\\s]");
        int n= arr.length;

        for (String s : arr) {
            System.out.println(s);
            count++;
        }


        //System.out.println(n);
        //System.out.println(count);
    }
}
