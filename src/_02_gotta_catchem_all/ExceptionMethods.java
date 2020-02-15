package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException{
		if(b==0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	public String reverse(String s) throws IllegalStateException{
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		String ss = "";
		for(int i=s.length()-1; i>=0; i--) {
			ss+=s.charAt(i);
		}
		return ss;
	}
}
