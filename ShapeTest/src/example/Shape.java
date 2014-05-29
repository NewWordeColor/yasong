package example;

import java.util.*;

public class Shape {
	private double sides[];
	int num;

	public Shape(double sides[]) {
		this.num = sides.length;
		this.sides = sides;
	}

	public boolean isValidShape() {
		double max = 0, sum = 0;
		//判断是否小于3条边
		if(num<3){
			return false;
		}
		//首先判断是否为正数
		for (int i = 0; i < num; i++) {			
			if (sides[i] <= 0) {
				return false;
			}
						
		}
		//找到sides[]中的最大值，并算出数组中数据总和
		for (int i = 0; i < num; i++) {
		if (sides[i] > max) {
			max = sides[i];
		}		
		sum = sum + sides[i];//求数组总和
		}
		//比较最大一条边与其它所有边的和的大小
		if (sum <= 2 * max) { //sum是sides[i]的所有数值之和，sum<2*max是除去最大的数外，其它数之和与最大数比较
			return false;
		} else {
			return true;
		}
	}
}
