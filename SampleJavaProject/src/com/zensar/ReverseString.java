package com.zensar;

public class ReverseString {
	public static String reverse(String s) {
		String res="";
		for(int i=s.length()-1; i>=0;i-- ) {
			res+=s.charAt(i)+"";
		}
		return res;
	}
	public static void main(String[] args) {
		String s ="Satwik";
		System.out.println(reverse(s));
	}
}
