package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:/MyText.txt");
        FileOutputStream fos = new FileOutputStream(file);

        Scanner scn = new Scanner(System.in);

        System.out.println("Please, input your employee ID");
        int inputID = scn.nextInt();

        System.out.println("Please, enter your name");
        String inputName = scn.next();

        System.out.println("Please, enter your title or position within the company");
        String inputTitle = scn.next();

        Employee e1 = new Employee(inputName, inputTitle);

        byte bytesArray[] = inputName.getBytes();
        fos.write(bytesArray);
        fos.flush();
        System.out.println("Your name " + inputName + " was written to a file MyText.txt");

        Database d1 = new Database();
        d1.dbInput(inputID, e1);

        System.out.println("Please input your ID number");
        int x = scn.nextInt();

        System.out.println("Your database entry is");
        System.out.println("Name: " + d1.m1.get(x).getName());
        System.out.println("Position: " +d1.m1.get(x).getTitle());

    }
}
