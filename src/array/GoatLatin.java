package array;

public class GoatLatin {

	public static void main(String[] args) {
		
		String sentence = "I aspeak Goat eLatin";
		
		GoatLatin obj=new GoatLatin();
		
		System.out.println(obj.toGoatLatin(sentence));

	}
	
    public String toGoatLatin(String sentence) {
    	
    	sentence.trim();
    	String vowels="aeiouAEIOU";
    	
    	String[] parts=sentence.split(" ");
    	char first=' ';
    	String second="";
    	String last="maa";
    	
    	String retStr="";
    	
    	//System.out.println(vowels.contains("a"));
    	
    	for(int i=0;i<parts.length;i++) {
    		
    		if(!vowels.contains(Character.toString(parts[i].charAt(0)))) {
    			first=parts[i].charAt(0);
    			second=parts[i].substring(1);
    			
    			retStr+=second+first;
    		}else {
    			retStr+=parts[i];
    		}
		
    		retStr+=last+" ";
    		last+="a";	
    	}
    	
    	return retStr.trim();
    }

}
