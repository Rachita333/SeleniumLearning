package javaBasics;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc = "";
		
		LearningObjects objlr = new LearningObjects();
		

		objlr.forLoopTest();
		objlr.forLoopTest1();
		
		LearningStatic objls = new LearningStatic();
		objls.t1();
		objls.t4();
		
		LearningStatic.t2();
		
		

		
		testingprivate();
		
		String a = "Hi Training";
		System.out.println(a);
		
		int b = 80;
		System.out.println("he value of b is " + b );
		
		double c = 90.8;
		System.out.println("he value of c is " + c );
		
		boolean d = false;
		System.out.println("he value of d is " + d );
		
		
		char e = 'V';
		System.out.println("he value of e is " + e );
		
		
				

	}

	private static void testingprivate() {
		// TODO Auto-generated method stub
		System.out.println("private");
		
	}
	

	
	
}


