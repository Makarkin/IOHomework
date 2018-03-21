package main;

import readMethods.ReadClass;
import readMethods.SaveImageClass;

import java.io.*;
import java.util.Scanner;

import static readMethods.DecodeClass.decodeBytes;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the directory with Base64 image file.");
        String directory = scanner.nextLine();// "C:\\Users\\jk\\Desktop\\Netcracker_\\enc.txt";
        String fileString = null;
        ReadClass.fileToString(directory, fileString);
        System.out.println("Enter the directory for image.");
        directory = scanner.nextLine();// "C:\\Users\\jk\\Desktop\\Netcracker_"
        SaveImageClass.bytesToImage(decodeBytes(fileString), directory);
    }
}


