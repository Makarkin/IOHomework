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
        String directory = scanner.nextLine();
        String fileString = ReadClass.fileToString(directory);
        System.out.println("Enter the directory for image.");
        directory = scanner.nextLine();
        SaveImageClass.bytesToImage(decodeBytes(fileString), directory);
    }
}


