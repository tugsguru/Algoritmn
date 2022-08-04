package string;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		
		KeyboardRow obj=new KeyboardRow();
		
		String[] words = {"Hello","Alaska","Dad","Peace"};
		
		for(int i=0;i<obj.findWords(words).length;i++) {
			System.out.println(obj.findWords(words)[i]);
		}
	}
	
    public String[] findWords(String[] words) {
    	
    	String[] key= {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
    	
    	int ikey;
    	int count;

    	List<String> list=new ArrayList<String>();  
    	
    	for(int i=0;i<words.length;i++) {
    		
    		for(int j=0;j<key.length;j++) {
    			if(key[j].contains(Character.toString(words[i].charAt(0)))) {
    				ikey=j;
    				count=0;
    				
    				for(int k=0;k<words[i].length();k++) {
        				if(key[j].contains(Character.toString(words[i].charAt(k)))) {
        					count++;
        				}
        			}
    				
    				if(count==words[i].length()) {
    					//System.out.println(words[i]);
    					list.add(words[i]);
    				}
        			
    				
    				
    			}
    			//----------
    			
    			
    		}
    	}
    	
    	String[] ret=new String[list.size()];
    	for(int i=0;i<list.size();i++) {
    		ret[i]=list.get(i);
    	}
    	
    	return ret;
        
    }

}
