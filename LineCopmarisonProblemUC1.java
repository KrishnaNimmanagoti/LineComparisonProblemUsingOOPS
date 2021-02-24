abstract class forLineComparisonProblem {
	
	abstract void display();
	
	abstract double calculatingLength();
	
}

public class LineCopmarisonProblemUC1 extends forLineComparisonProblem {
	
	double a[]=new double[4];
	
	//This method to display length.
	void display() {
		
		double length = calculatingLength();
		
		System.out.println(length);
		
	}
	
	//constructor to generate and assign random numbers to a[].
	public LineCopmarisonProblemUC1() {
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = Math.floor(Math.random() * 10) % 10 + 1;
			
		}
			
		//this line is to print four random numbers.
			System.out.println("x1 = " + a[0] + " y1 = " + a[1] + " x2 = " + a[2] + " y2 = " + a[3]);
			
	}
	
	//This method is to calculate length
	double calculatingLength() {
		
		double length = Math.sqrt(Math.pow(a[1] - a[0], 2) + Math.pow(a[3] - a[2], 2) * 1.0);
	
		return length;
		
	}
	
	public static void main(String[] args) {
		
		LineCopmarisonProblemUC1 lcp = new LineCopmarisonProblemUC1();
		
		lcp.display();
		
	}

}
