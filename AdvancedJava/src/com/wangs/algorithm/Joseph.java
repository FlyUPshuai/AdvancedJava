package com.wangs.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 约瑟夫环
 * @author wang
 *
 */
public class Joseph {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i+1);
		}
		System.out.println("约瑟夫环的值为："+joseph(list,1,3).get(0));
	}
	/**
	 * 
	 * @param list 全部的人
	 * @param number1 计数变量
	 * @param number2 约瑟夫环指数
	 * @return
	 */
	public static List<Integer> joseph(List<Integer> list,int number1,int number2) {
		if(list.size()>1){
			if(number1%number2==0){
				list.remove(0);
			}
			list.add(list.get(0));
			list.remove(0);
			return joseph(list, (number1+1), number2);
		}else{
			return list;
		}
	}

}
