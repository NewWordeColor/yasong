package test;


public class Triangle {
	double a, b, c ;
	public Triangle(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isValid() {
		if(a>0 && b>0 && c>0) 			
			if(a+b>c && b+c>a && a+c>b) {
				return true;
		}
		return false;
	}
	public boolean isocelestriangle() {
		if(isValid());
		if(a==b || b==c || a==c) {
			return true;
		}
		return false;
	}
	public boolean equilateraltriangle() {
		if(isValid());
		if(a==b && b==c) {
			return true;
		}
		return false;
	}
}
