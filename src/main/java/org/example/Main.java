package org.example;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String databaseName;
    static String databaseUsername;
    static String databasePass;
    static String category;
    static String categorySearch;

    static String tableName1;
    public static void main(String[] args) {
        boolean menue = true;

        System.out.print("Enter Database Name:      ");
        databaseName = sc.next();
        System.out.print("Enter Database Username:  ");
        databaseUsername= sc.next();
        System.out.print("Enter Database Password:  ");
        databasePass = sc.next();

        while(menue){
            System.out.print("Enter Category:  ");
            category = sc.next();

            API.API();

            System.out.print("Enter Category for Searching:  ");
            categorySearch = sc.next();
        }
    }
}