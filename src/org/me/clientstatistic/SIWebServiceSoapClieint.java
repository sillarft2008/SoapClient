/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.clientstatistic;

import java.util.Scanner;

/**
 *
 * @author Flor
 */
public class SIWebServiceSoapClieint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        int letterCount;
        int lineCount;
        int wordCount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a text!");
        text = sc.nextLine();
        lineCount = getLineCount(text);
        wordCount = getWordCount(text);
        letterCount = getLetterCount(text);
        System.out.println("Line count = " + lineCount);
        System.out.println("Word count = " + wordCount);
        System.out.println("Letter count = " + letterCount); 
        
    }

    private static int getLetterCount(java.lang.String text) {
        org.me.filestatistic.Server_Service service = new org.me.filestatistic.Server_Service();
        org.me.filestatistic.Server port = service.getServerPort();
        return port.getLetterCount(text);
    }

    private static int getLineCount(java.lang.String text) {
        org.me.filestatistic.Server_Service service = new org.me.filestatistic.Server_Service();
        org.me.filestatistic.Server port = service.getServerPort();
        return port.getLineCount(text);
    }

    private static int getWordCount(java.lang.String text) {
        org.me.filestatistic.Server_Service service = new org.me.filestatistic.Server_Service();
        org.me.filestatistic.Server port = service.getServerPort();
        return port.getWordCount(text);
    }
    

    
    
}
