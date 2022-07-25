package com.jap.textanalyzer;

public class LinkedList {

    Node startPtr;
    Node head;


    // This method adds a Word node to the linked list
    public boolean addNode(String item)
    {
        boolean result=false;
        Node newNode = new Node(new Word(item,0));

        if(head == null)
        {
            head = newNode;
            result=true;
        }
        else
        {
            if(updateOccurance(item)==false)
            {
                Node currNode = head;
                newNode.setNext(currNode);
                head=newNode;
                result=true;
            }
        }
        return result;
    }

    // This method checks if a given word occurs in the linked list and returns true of false
    public boolean updateOccurance(String item)
    {
        boolean result=false;

        Node currNode = head;
        int checking=0;

        while(currNode != null)
        {
            if(currNode.data.getWord().equalsIgnoreCase(item))
            {
                result=true;
                checking++;
                currNode.data.setOccurance(checking);
            }
            currNode = currNode.getNext();
        }
        return result;
    }

    // This method checks if the list is empty or not
    public boolean isEmpty()
    {
        return getSize() == 0;
        /*Boolean result = false;
        Node check = head;
        if(check==null){
            result=false;
        }
        else
            result=true;
            return result;
    }*/
    }

    // This method returns the size of the linked list
    public int getSize()
    {
        Node travNode=head;
        int size=0;
        while(travNode != null)
        {
            size++;
            travNode=travNode.getNext();
        }
        return size;
    }

    // This method displays words in descending order of their occurances
    public void showFrequentWords() {
    }
    //This method displays the word list
    public void showWordList(String item){

        Node trav = head;
        while (head != null)
        {
            System.out.print(trav+"//n");
            trav=trav.getNext();
        }
    }

}
