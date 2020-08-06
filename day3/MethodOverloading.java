package javaPgm.day3;

public class MethodOverloading {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public float add(float a, float b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String args[]) {
		
		MethodOverloading mo = new MethodOverloading();
		
		System.out.println("Result of adding two integers: " +mo.add(5,6));
		System.out.println("Result of adding two float numbers: " +mo.add(9.1f,6.4f));
		System.out.println("Result of adding three integers: " +mo.add(5,6,9));
		
		
	}

	

}
