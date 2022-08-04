package string;

import java.math.BigInteger;

public class AddStrings {

	public static void main(String[] args) {
		
		String num1 = "11", num2 = "123";
		
		AddStrings obj=new AddStrings();
		
		System.out.println(obj.addStrings(num1, num2));
		
		

	}
	
    public String addStrings(String num1, String num2) {
    	
    	BigInteger n1=new BigInteger(num1);
    	BigInteger n2=new BigInteger(num2);
    	
    	BigInteger ans=n1.add(n2);
		
    	
    	return ans.toString();
        
    }

}
