package com.jap.textanalyzer;

import java.io.*;

public class TextAnalyzer {

// This method reads a file and inserts the file data into the linked list

    public LinkedList readAndParseFile(String filePath) {

        LinkedList linkedList=new LinkedList();

        try
        {
            File file = new File("src/main/resources/daffodils.txt");
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            String str;

            while ((str = buffer.readLine()) != null)
            {
                String data [] = str.toLowerCase().split("[   , - : . ; \\s]");
                for(int i=0; i< data.length; i++)
                {
                    linkedList.addNode(data[i]);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(" Refer logs for more info");
        }
        return linkedList;
    }
}