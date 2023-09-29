
public class DataTypes {
	public static void main(String[] args) {
		int a=9/2;
		System.out.println(a);  //4 
		
		float a1=9/2;
		System.out.println(a1);  //4.0  
		
		float a2=9f/4;
		System.out.println(a2);  //2.25
		
		float x=101f/61f;
		System.out.println(x);   //1.6557378
		
		double d=101/61;
		System.out.println(d);  //1.0
		
		double d1=101d/61d;
		System.out.println(d1);  //1.6557377049180328
		
		double d2=101f/61f;  //8bytes=4bytes ok
		System.out.println(d2);  //1.6557377576828003
		
		//float f3=101d/61d;   //4bytes =8bytes not ok
		//System.out.println(f3); //cannot convert double to float
		
		int marker=512;
		double percentage=marker*0.46f; // float is converted to double
		System.out.println(percentage);//235.52000427246094
		
		
		
		
		
		
		
		
		
	}

}
