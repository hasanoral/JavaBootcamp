package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeekOneHomework2 {

    public static boolean occursIn(String pattern, String str){
        int matchWords = 0;

        List<Character> wordWithoutStar = new ArrayList<>();

        for (int i = 0;i<pattern.length();i++){
            if(pattern.charAt(i)!='*'){
                wordWithoutStar.add(pattern.charAt(i));
            }

        }

        for(int j = 0;j<wordWithoutStar.size();j++){
            for (int k = 0;k<str.length();k++){
                if (wordWithoutStar.get(j) == str.charAt(k)){
                    matchWords++;
                    break;
                }
            }
        }

        if (wordWithoutStar.size() == matchWords){
            return true;
        }else{
            return false;
        }


        /*for (int i = 0;i<pattern.length();i++){
            if(pattern.charAt(i)=='*'){
                star++;
            }
            for(int j = 0;j<str.length();j++){
                if (pattern.charAt(i) == str.charAt(j)){
                    matchWords++;
                }
            }
        }

        int strWithoutStar = pattern.length() - star;
        System.out.println("star sayısı:" + star);
        System.out.println("str starsız:" + strWithoutStar);
        System.out.println("match:" + matchWords);

        if(strWithoutStar == matchWords){
            return true;
        }
        else{
            return false;
        }*/


        /*int notStar = 0;


        for (int k = 0;k<str.length();k++){
            if (str.charAt(k)!='*'){
                notStar++;

            }
        }

        String[] strWords = new String[notStar];
        for (int j = 0;j<str.length();j++){
            if (str.charAt(j)=='*'){

                continue;
            }

        }



        int patternWords = pattern.length();

        for (int i = 0;i<patternWords;i++){


        }*/

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a pattern:");
        String pattern = scanner.nextLine();

        while(true){

            System.out.println("Please enter a String:");
            String str = scanner.nextLine();

            if(str.equals("exit")){
                System.out.println("Bye");
                break;
            }

            else{

                if(occursIn(pattern,str) == true){
                    System.out.println(str + " occurs in " + pattern);
                }
                else{
                    System.out.println(str + " does NOT occur in " + pattern);
                }
            }

        }

    }
}
