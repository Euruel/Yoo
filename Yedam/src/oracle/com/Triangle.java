package oracle.com;

public class Triangle {
	double width;

	double height;
	Triangle(){		//������		
	} 
	
	Triangle(double a, double b){	// �ʱⰪ..
	 	width = a;
		height = b;
	}
		double getArea() {
			if(height !=0 && width !=0)
			return width * height / 2;
			else
				return 0,0;
	}		
		double getArea(double a) {
		return a*a/2;
			
	}
		double getArea(double a, double b) {
		return a*b/2;
		
	}
	
}

public class TriangleEx {

}