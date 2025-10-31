package h3;

public class H3_main {
	public static void main(String[] args) {
		int i =5, j=7, k=-10; 
		
		if (i>j) {
			k=1;
			if (i>200) {
				k=2;
				if (j>100) {
					k=3;
				}
			}
			
		}
		System.out.println("k ist " +k);
		
	}

}
