abstract class forLineComparisonProblem {
	
	abstract void display();
	
	abstract void calculatingLength();
	
}

public class LineCopmarisonProblemUC2 extends forLineComparisonProblem {
	
	double a[]=new double[4];
	double b[]=new double[4];
	
	double length1;
	double length2;
	
	//This method to display length.
	void display() {
		
		calculatingLength();
		
		String length1String = Double.toString(length1);
		String length2String = Double.toString(length2);
		
		boolean compare = length1String.equals(length2String);
		
		if(compare == true ){

			System.out.println("Line-1 is Equal to Line-2");

		}

		else{

			System.out.println("Line-1 is not Equal to Line-2");

		}

	}
	
	//constructor to generate and assign random numbers to a[].
	public LineCopmarisonProblemUC2() {
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = Math.floor(Math.random() * 10) % 10 + 1;
			b[i] = Math.floor(Math.random() * 10) % 10 + 1;
			
		}
			
		//this line is to print four random numbers.
			System.out.println("x1 = " + a[0] + " y1 = " + a[1] + " x2 = " + a[2] + " y2 = " + a[3]);
			System.out.println("m1 = " + b[0] + " n1 = " + b[1] + " m2 = " + b[2] + " n2 = " + b[3]);
			
	}
	
	//This method is to calculate length
	void calculatingLength() {
		
		length1 = Math.sqrt(Math.pow(a[1] - a[0], 2) + Math.pow(a[3] - a[2], 2) * 1.0);
		length2 = Math.sqrt(Math.pow(b[1] - b[0], 2) + Math.pow(b[3] - b[2], 2) * 1.0);
		
	}
	
	public static void main(String[] args) {
		
		LineCopmarisonProblemUC2 lcp = new LineCopmarisonProblemUC2();
		
		lcp.display();
		
	}

}
