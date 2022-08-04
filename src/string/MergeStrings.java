package string;

public class MergeStrings {

	public static void main(String[] args) {
		
		String word1 = "abc", word2 = "pqr98";
		
		MergeStrings obj=new MergeStrings();
		
		System.out.println(obj.mergeAlternately(word1, word2));
		
	}
	
    public String mergeAlternately(String word1, String word2) {
    	
    	String ret="";
    	int dif=0;
    	
    	if(word1.length()>word2.length()) {
    		dif=word1.length()-word2.length();
    		for(int i=0;i<dif;i++) {
    			word2+=" ";
    		}
    	}else {
    		dif=word2.length()-word1.length();
    		
    		for(int i=0;i<dif;i++) {
    			word1+=" ";
    		}
    	}
    	
    	
    	for(int i=0;i<word1.length();i++) {
    		ret+=Character.toString(word1.charAt(i)) + Character.toString(word2.charAt(i));
    	}
    	
	return ret.replace(" ", "");
        
    }

}
