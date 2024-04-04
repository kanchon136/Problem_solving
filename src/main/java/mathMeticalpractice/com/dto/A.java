package mathMeticalpractice.com.dto;

public class A {
	A test() {
		return new A();
		
	}

	
	public static void main(String ar[]) {
		String s = new String("abc");
		String b= new String("abc");
		
		String c ="kanchon";
		String e = "kanchon";
		
		if(c==e) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("==================two dimemntion array===========");
		
		
		int v [][] = new int [3][4];
		
		v[0][0]=1;
		v[0][1]=2;
		v[0][2]=3;
		v[0][3]=4;
		
		v[1][0]=5;
		v[1][1]=6;
		v[1][2]=7;
		v[1][3]=4;
		
		v[2][0]=9;
		v[2][1]=10;
		v[2][2]=11;
		v[2][3]=12;
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("first loop=:"+v.length);
			for (int j = 0; j < v[i].length; j++) {
				 System.out.println(v[i][j]);
				
			}
			
			
		}
		
		System.out.println("=============multi dimentional array==================");
		
		
		int [][][] myarray = new int [2][2][3];
		
		for (int i = 0; i < myarray.length; i++) {
			 for(int j=0; j<myarray[i].length; j++) {
				 for(int k=0;k<myarray[j].length;k++) {
					// System.out
					 myarray[i] [j][k]= i+j+k;
				 }
			 }
		}
		
		for (int i = 0; i < myarray.length; i++) {
			 for(int j=0;j<myarray[i].length;j++) {
				 for(int k=0;k<myarray[j].length;k++) {
					 System.out.println("Muyarray"+"["+i+"]"+"["+j+"]"+"["+k+"]="+myarray[i][j][k]);
				 }
			 }
			
		}
		
		
		int [] gh = {1,3,6,};
		int kj[] = new int[gh.length];
		kj= gh.clone(); 
		
		
	}
}

  