package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// INFO5100 Assignment1 Code by Rui Zhou
        // Question 1:
        String str1 = "abaccaba";
        System.out.println(isPalindrome(str1));
        // Question 2:
        String str2 = "abcdefHH";
        System.out.println(haveAllUniqueChars(str2));
        // Question 3:
        String str3 = "abccdeff";
        System.out.println(containsDuplicates(str3));
        // Question 4:
        String s = "abc*/bde";
        String t = "abbcde*/*";
        System.out.println(isAnagram(s, t));
        // Question 5:
        int year1 = 1998;
        int year2 = 1990;
        int year3 = 2000;
        System.out.println(isLeapYear(year1));
        System.out.println(isLeapYear(year2));
        System.out.println(isLeapYear(year3));
        // Question 6:
        int calls = 140;
        System.out.println("Your bill is " + calculateBills(calls));
        // Question 7:
        String ransomNote = "Twin Peek";
        String magazine = "TTeekKwinP ";
        System.out.println(construct(ransomNote, magazine));
        // Question 8:
        displayGrades('C');
        // Question 9:
        Book book1 = new Book("Twin Cities", 6890, "Novel", 25);
        // Question 10:
        Box box1 = new Box(2.5, 4.5, 9.5);
    }

    // Question 1: Write a program find if String is Palindrome?
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Question2: Write a program to check if a string has all unique characters.
    public static boolean haveAllUniqueChars(String str) {
        if (str == null || str.length() == 0) return true;

        Map<Character, Integer> hashmap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (hashmap.containsKey(c)) {
                return false;
            }
            else {
                hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
            }
        }
        return true;
    }

    // Question 3. Write a program to check if string contains duplicates
    public static boolean containsDuplicates(String str) {
        if (str == null || str.length() == 0) return false;

        Map<Character, Integer> hashmap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (hashmap.containsKey(c)) {
                return true;
            }
            else {
                hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
            }
        }
        return false;
    }

    // Question 4: Write a program to check if two strings are anagrams.
    // Anagrams are strings which can be made by rearranging characters in string.
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s == null && t == null) return true;

        if (s.length() != t.length()) return false;

        Map<Character, Integer> hashmap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!hashmap.containsKey(c)) {
                return false;
            }
            else {
                hashmap.put(c, hashmap.get(c) - 1);
            }
        }
        for (char c : hashmap.keySet()) {
            if (hashmap.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    // Question 5:  Write a program to determine whether the year is a leap year or not.
    // Leap Years are any year that can be evenly divided by 4.
    // A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (year % 4 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    // Question 6: Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
    // Plus $ 0.60 per call for next 50 calls.
    // Plus $ 0.50 per call for next 50 calls.
    // Plus $ 0.40 per call for any call beyond 200 calls.
    // Use Switch Statement in the function.
    public static double calculateBills(int calls) {
        double sum = 0;
        int a = 0;
        if (calls <= 100) {
            a = 1;
        }
        else if (calls > 100 && calls <= 150) {
            a = 2;
        }
        else if (calls > 150 && calls <= 200) {
            a = 3;
        }
        else {
            a = 4;
        }

        switch (a) {
            case 1:
                sum = 200;
                break;
            case 2:
                sum = 200 + (calls - 100) * 0.6;
                break;
            case 3:
                sum = 200 + (50 * 0.6) + (calls - 150) * 0.5;
                break;
            case 4:
                sum = 200 + (calls - 200) * 0.4;
                break;
        }

        return sum;
    }

    // Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
    // Each letter in magazine can only be used once in ransomNote.
    public static boolean construct(String ransomNote, String magazine) {
        Map<Character, Integer> hashmap1 = new HashMap<>();
        Map<Character, Integer> hashmap2 = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            hashmap1.put(c, hashmap1.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!hashmap1.containsKey(c)) {
                return false;
            }
            else {
                hashmap2.put(c, hashmap2.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : hashmap2.keySet()) {
            if (hashmap1.containsKey(c)) {
                // each character only can be used once, such as "ee" can be used as "ee"
                if (hashmap1.get(c) - hashmap2.get(c) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Question 8 : Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
    public static void displayGrades(char grade) {
        if (grade == 'A') {
            System.out.println("Your grade is Excellent!");
        }
        else if (grade == 'B') {
            System.out.println("Your grade is Good!");
        }
        else if (grade == 'C') {
            System.out.println("Your grade is Average!");
        }
        else if (grade == 'D') {
            System.out.println("Your grade is Deficient!");
        }
        else {
            System.out.println("Your grade is Failing!");
        }
    }

    // Question 9: Write a program to create a book class. The Book class would have following private variables
    public static class Book {
        String name;
        int bookID;
        String genres;
        double prices;

        public Book(String name, int bookID, String genres,double prices) {
            this.name = name;
            this.bookID = bookID;
            this.genres = genres;
            this.prices = prices;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBookID() {
            return bookID;
        }

        public void setBookID(int bookID) {
            this.bookID = bookID;
        }

        public String getGenres() {
            return genres;
        }

        public void setGenres(String genres) {
            this.genres = genres;
        }

        public double getPrices() {
            return prices;
        }

        public void setPrices(double prices) {
            this.prices = prices;
        }

    }

    // Question 10: Implement a class Box
    public static class Box {
        double width;
        double height;
        double depth;
        public Box(double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getDepth() {
            return depth;
        }

        public void setDepth(double depth) {
            this.depth = depth;
        }
    }
}

