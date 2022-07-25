package com.jap.textanalyzer;

public class Word {

    // The Word class declare the word and the occurance

    String word;
    int occurance;


    public Word() {
    }

// Declare parameterized constructor and initialize values
   public Word(String word,int occurance)
   {
       this.word=word;
       this.occurance=occurance;
   }


// getters and setters

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getOccurance() {
        return occurance;
    }

    public void setOccurance(int occurance) {
        this.occurance = occurance;
    }

    // Override the toString() method in this format Word={word=xxx,wordOccurance=x}
    @Override
    public String toString()
    {
        return ("Word{word='"+word+"', wordOccurance="+occurance+"}");
    }
}
