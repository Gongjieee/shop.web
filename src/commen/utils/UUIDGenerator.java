package commen.utils;

import java.util.UUID;

public class UUIDGenerator{
	
	public static String GeneratorUUID() {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		//去掉-符号
		String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
		return temp;
	}
	
	public static void main(String[] args) {
		String []arr=new String[10];
		for(int i=1;i<10;i++) {
			System.out.println(arr[i]=GeneratorUUID());
		}
	}
}
