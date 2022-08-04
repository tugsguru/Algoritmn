package string;

public class Largest3 {

	public static void main(String[] args) {
		
		String num = "6771330009";
		
		Largest3 obj=new Largest3();
		
		System.out.println(obj.largestGoodInteger(num));
		
		
	}
	
    public String largestGoodInteger(String num) {
    	
    	int max=-1;
    	int ch;
    	int index=0;
    	String ret="";
    	char ch2;
    	
    	for(int i=0;i<num.length()-2;i++) {
    		
    		if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)) {
    			
    			ch=num.charAt(i);
    			if(max<ch) {
    				max=ch;
    				index=i;
    			}
    			//System.out.println(num.charAt(i));
    		}
    		
    	}
    	if(max!=-1) {
    		ch2=num.charAt(index);
    	
    		ret=ret + ch2 + ch2 + ch2;
    	}
		
    	return ret;
    }

}
