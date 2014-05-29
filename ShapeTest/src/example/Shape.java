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
		//�ж��Ƿ�С��3����
		if(num<3){
			return false;
		}
		//�����ж��Ƿ�Ϊ����
		for (int i = 0; i < num; i++) {			
			if (sides[i] <= 0) {
				return false;
			}
						
		}
		//�ҵ�sides[]�е����ֵ������������������ܺ�
		for (int i = 0; i < num; i++) {
		if (sides[i] > max) {
			max = sides[i];
		}		
		sum = sum + sides[i];//�������ܺ�
		}
		//�Ƚ����һ�������������бߵĺ͵Ĵ�С
		if (sum <= 2 * max) { //sum��sides[i]��������ֵ֮�ͣ�sum<2*max�ǳ�ȥ�������⣬������֮����������Ƚ�
			return false;
		} else {
			return true;
		}
	}
}
