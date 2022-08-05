package array;

public class PrefixOfArray {

	public static void main(String[] args) {
		
		PrefixOfArray obj=new PrefixOfArray();
		
		String[] words = {"i","love","leetcode","apples"};
		String s = "iloveleetcode";
		
		System.out.println(obj.isPrefixString(s, words));
		

	}
	
    public boolean isPrefixString(String s, String[] words) {
		
    	String str="";
    	
    		for(int i=0;i<words.length;i++) {
        		str+=words[i];
        		
        		if(s.equals(str)) {
        			return true;
        		}
        	}
        	
        	return false;

    }

}
