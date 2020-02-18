package com.company;

/*
0812 The longest sequence

1. Create a list of numbers.
2. Add 10 numbers from the keyboard to the list.
3. Display the length of the longest sequence of repeating numbers in the list.
Example for list 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
3
The desired value is 3, because the longest sequence of repeating numbers consists of three fours.

Requirements:
1. The program should display the number on the screen.
2. The program should read the values ​​from the keyboard.
3. In the main method, declare an ArrayList type variable with the Integer element type and immediately initialize ee.
4. The program should add 10 numbers to the collection, according to the condition.
5. The program should display the length of the longest sequence of repeating numbers in the list.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
        public static void main(String[] args) throws IOException {
            ArrayList<Integer> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 10; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            int l = 1;
            int maxL =1;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).equals(list.get(i - 1))) l++;
                else  l = 1;
                if (l > maxL) maxL = l;
            }
            System.out.println(maxL);
        }
    }




