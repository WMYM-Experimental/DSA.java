/*
    9. Palindrome Number
    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.
*/

package com.dsa.leet_code;

class Solution {
    // 12 ms, faster than 80.74%
    // 45.1 MB, less than 33.55%
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int rev = 0;
        int aux = x;
        while (aux > 0) {
            rev = rev * 10 + aux % 10;
            aux /= 10;
        }
        return rev == x;
    }
}