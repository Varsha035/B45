package Daytwo;

public class PrimitiveDataType {

	public static void main(String[] args) {
		byte byteMax =127;       
		byte byteMin =-128;
		
		System.out.println("Min range fo byte is"+byteMin+ " max limit of byte is"+byteMax );
		
		
		short shortMax= 32767;
		short shortMin = -32768;
		
		System.out.println("Minshort range of byte is"+shortMin + " Maxshort range of byte is"+shortMax );
		
		
		int maxint=2147483647;
		int minint=-2147483648;
		
		System.out.println(" minint range of byte is "+ minint+" maxint range of byte is"+ maxint);
		
		long maxlong=  9223372036854775807L;          
		long minlong = -9223372036854775808L;
		                                           
		System.out.println(" max limit for maxlong is "+ maxlong + " min limit for minlong is "+ minlong);
		
		boolean flag= false;
		System.out.println("boolean value is "+ flag);

	}


}
