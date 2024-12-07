package com.example.finalproject;

public class Details {
    double accuracy;
    int wordPerMinute;
    long charactersCount;

    public Details(){
        System.out.println(this.accuracy);
        System.out.println(this.wordPerMinute);
        System.out.println(this.charactersCount);

    }
    public void setAccuracy(){

    }
    public int setWordPerMinute(String levels , String userInp){

        this.wordPerMinute = (wordCounter(levels) - wordCounter(userInp)) / 60  ;
        return this.wordPerMinute;
    }
    public long setCharactersCount(String sentence){
        return sentence.length();
    }

    public int wordCounter(String sentence){
        int totalNoOfWords = 1;

        for (int i = 0 ; i < sentence.length() ; i++){
            if(sentence.charAt(i) == ' '){
                totalNoOfWords++;
            }
        }
        return totalNoOfWords;
    }
}
