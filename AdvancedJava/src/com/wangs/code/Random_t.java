package com.wangs.code;

import java.util.Scanner;

public class Random_t {
//	public static void main(String[] args) {
//		System.out.println(new Date().getTime());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Date().getTime());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Random(new Date().getTime()).nextInt());
//		System.out.println(new Random().nextInt());
//		System.out.println(new Random().nextInt());
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(new SecureRandom().nextInt());
//			
//		}
		public String first(String id,String cell,String phone){
			String flag="注册成功";
			String[] splitphone=new String[3];
			splitphone=phone.split("-",2);
//			if(id.length()!=16 && id.length()!=18){
//				flag="身份证号必须是16位或18位";
//			}else if(cell.length()!=11){
//				flag="手机号必须是11位";
//			}else 
				if(splitphone[0].length()!=4 && splitphone[0].length()!=7){
				flag="座机号码必须为4位，电话号码必须是7位";
			}
			return flag;
			
		}
		
		public static void main(String[] args) {
			Random_t l=new Random_t();
			Scanner input=new Scanner(System.in);
			String ID, p1,p2;
			String s;
			System.out.println("*****欢迎进入注册系统****");
			do{
//			System.out.println("请输入身份证:");
//			ID=input.next();
//			System.out.println("请输入手机号:");
//			p1=input.next();
			System.out.println("请输入座机号:");
			p2=input.next();
			
			s=l.first("", "", p2);
			System.out.println(s);
		}while(!s.equals("注册成功!"));
	}
//	}

}
