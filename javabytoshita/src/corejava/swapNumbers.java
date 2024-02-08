package corejava;

public class swapNumbers{
	static void swap(int m,int n) {
	m=m-n;
	n=m+n;
	m=n-m;
	System.out.println("the value of m is "+m+" the value of n is "+n);
	}
	public static void main(String[] args) {
		int m=9;
		int n=5;
      swapNumbers.swap(m, n);
     
	}

}
