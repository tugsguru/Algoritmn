package array;

public class ReplaceElements {

	public static void main(String[] args) {
		
		int[] arr= {17,18,5,4,6,1};
		
		ReplaceElements obj=new ReplaceElements();
		
		/*for(int i=0;i<obj.replaceElements(a).length;i++) {
			System.out.println(obj.replaceElements(a)[i]);
		}*/
		
        int max=-1;
		
		for(int i=0;i<arr.length;i++) {
			max=0;
				for(int j=i+1;j<arr.length;j++) {
					if(max<=arr[j]) {
						max=arr[j];
					}
				}
				System.out.println(i +"----"+max+"---");
				//arr[i]=max;
		}
	}
	
	public int[] replaceElements(int[] arr) {
		
		int max=-1;
		
		for(int i=0;i<arr.length;i++) {
			max=0;
				for(int j=i+1;j<arr.length;j++) {
					if(max<=arr[j]) {
						max=arr[j];
					}
				}
				//System.out.println(i +"----"+max+"---");
				arr[i]=max;
		}
		arr[arr.length-1]=-1;
		
		return arr;
    }

}
