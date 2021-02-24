abstract class forLineComparisonProblem {
	
	abstract void display();
	
}

public class StartLineComparison extends forLineComparisonProblem{
	
	public static void main(String[] args) {
		
		StartLineComparison slc = new StartLineComparison();
		
		slc.display();
		
	}
	
	void display() {
		
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		
	}

}
