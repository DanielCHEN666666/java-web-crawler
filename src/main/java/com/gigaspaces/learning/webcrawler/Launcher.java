package com.gigaspaces.learning.webcrawler;

/**
 * @author Yohana Khoury
 * @since 12.1
 */
public class Launcher {

    public static void main(String[] args) throws InterruptedException {
        if (args.length != 3) {
            System.out.println("<Main> <baseUrl> <numOfThreads>");
        }

        String main = args[0];
        String baseUrl = args[1];
        String numOfThreads = args[2];
        if (main.equals("1")) {
            com.gigaspaces.learning.webcrawler.v1.Main.main(new String[]{baseUrl, numOfThreads});
        } else {
            com.gigaspaces.learning.webcrawler.v2.Main.main(new String[]{baseUrl, numOfThreads});
        }
    }
}
