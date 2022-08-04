package string;

public class StudentAttendance551 {

	public static void main(String[] args) {
		
		StudentAttendance551 obj=new StudentAttendance551();
		
		String s = "PPALLL";
		System.out.println(obj.checkRecord(s));

	}
	
    public boolean checkRecord(String s) {
		
    	int acount=0;
    	int lcount=0;
    	
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)=='A') {
    			acount++;
    		}
    	}
    	
    	for(int i=0;i<s.length()-2;i++) {

    		if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L') {
    			lcount++;
    		}
    	}
    	
    	if(acount<2 && lcount<1) {
    		return true;
    	}else {
    		return false;
    	}
    }

}
