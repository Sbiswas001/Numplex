package com.sbiswas001.numplex;

import java.util.*;

public class Numplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<String> result = new ArrayList<>();
        result.add(Number_Names.tech_check(num) ?
                num+" is a Tech Number!" : num+" is not a Tech Number!");
        result.add(Number_Names.prime_check(num) ?
                num+" is a Prime Number!" : num+" is not a Prime Number!");
        result.add(Number_Names.palindrome_check(num) ?
                num+" is a Palindrome Number!" : num+" is not a Palindrome Number!");
        result.add(Number_Names.disarium_check(num) ?
                num+" is a Disarium Number!" : num+" is not a Disarium Number!");
        result.add(Number_Names.niven_check(num) ?
                num+" is a Niven Number!" : num+" is not a Niven Number!");
        result.add(Number_Names.emirp_check(num) ?
                num+" is a Emirp Number!" : num+" is not a Emirp Number!");
        result.add(Number_Names.pronic_check(num) ?
                num+" is a Pronic Number!" : num+" is not a Pronic Number!");
        result.add(Number_Names.special_check(num) ?
                num+" is a Special Number!" : num+" is not a Special Number!");
        result.add(Number_Names.lucas_check(num) ?
                num+" is a Lucas Number!" : num+" is not a Lucas Number!");
        result.add(Number_Names.smith_check(num) ?
                num+" is a Smith Number!" : num+" is not a Smith Number!");
        result.add(Number_Names.armstrong_check(num) ?
                num+" is a Armstrong Number!" : num+" is not a Armstrong Number!");
        result.add(Number_Names.tech_check(num) ?
                num+" is a Tech Number!" : num+" is not a Tech Number!");
        result.add(Number_Names.tech_check(num) ?
                num+" is a Tech Number!" : num+" is not a Tech Number!");
        result.add(Number_Names.tech_check(num) ?
                num+" is a Tech Number!" : num+" is not a Tech Number!");
        result.add(Number_Names.tech_check(num) ?
                num+" is a Tech Number!" : num+" is not a Tech Number!");

       //TODO
        if(Number_Names.fibonacci_check(num))
            System.out.println(num+" is a Fibonacci Number!");
        if(Number_Names.kaprekar_check(num))
            System.out.println(num+" is a Kaprekar Number!");
        if(Number_Names.happy_check(num))
            System.out.println(num+" is a Happy Number!");
        if(Number_Names.spy_check(num))
            System.out.println(num+" is a Spy Number!");
        if(Number_Names.neon_check(num))
            System.out.println(num+" is a Neon Number!");
        if(Number_Names.ugly_check(num))
            System.out.println(num+" is a Ugly Number!");
        if(Number_Names.fermat_check(num))
            System.out.println(num+" is a Fermat Number!");
        if(Number_Names.abundant_check(num))
            System.out.println(num+" is a Abundant Number!");
        if(Number_Names.isbn_check(num))
            System.out.println(num+" is a ISBN Number!");
        if(Number_Names.circular_prime_check(num))
            System.out.println(num+" is a Tech Number!");
        if(Number_Names.prime_palindrome_check(num))
            System.out.println(num+" is a Prime Palindrome Number!");
        if(Number_Names.automorphic_check(num))
            System.out.println(num+" is a Automorphic Number!");
        if(Number_Names.duck_check(String.valueOf(num)))
            System.out.println(num+" is a Duck number!");
    }
}