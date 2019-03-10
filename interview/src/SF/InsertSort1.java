package SF;

public class InsertSort1 {
   
	private  InsertSort1() {
		
	}
	public static void sort( int [] arr) {	
		for(int i =1;i<arr.length;i++) {
			int a =arr[i];
			int j;
			for( j=i;j<0&&arr[j-1]>a;j--) {
				arr[j]=arr[j-1];
			}
			arr[i]=a;
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr= {9,8,7,6,5,4,3,2,1};
		InsertSort.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);;
			System.out.print("");
		}
	}
}
