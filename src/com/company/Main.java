package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String input = scanner.nextLine();

	    char[] inputArr = input.toCharArray();
		boolean flag = true;
	    for (int i = 0 ; i<inputArr.length/2 ; i ++){
			if (inputArr[i] != inputArr[inputArr.length-i-1])
				flag = false;
        }
		System.out.println(flag);
    }

}
