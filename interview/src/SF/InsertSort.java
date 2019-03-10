package SF;

public class InsertSort {

	private InsertSort() {
		
	}
	

	public static void sort(int [] arr) {
		
		int n =arr.length;
		for(int i=1;i<n;i++) {
			
		   for (int j=i;j>0&&arr[j]<arr[j-1];j--)	
			
			swap(arr,j);
			}
			
		
	}
	public static  void swap(int [] arr,int j) {
		int t =arr[j-1];
		arr[j-1]=arr[j];
		arr[j]=t;
	}	
	public static void main(String[] args) {
		int [] arr = {9,8,7,6,5,4,3,2,1,0};		
		InsertSort.sort(arr);	
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
}
