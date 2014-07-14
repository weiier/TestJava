package com.zhangb.eleven;

public class TestPrams {
	public static void change(int[] c,int i){
		c[0] = 6;
		i=5;
	}
	public static void main(String args[]){
			int[] count = {1,2,3};
			int i = 10;
			change(count,i);
			System.out.println(count[0]+";"+i);
			System.out.print("");
	}
}
