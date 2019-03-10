package SF;

public class SelectSort {
private SelectSort() {
	
}
	public static void sort(int[] arr) {
		
		int n =arr.length;
		
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min =j;
					
				}
				swap(arr,i, j);
				
			}
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		int t= arr[i];
		arr[i]=arr[j];
		arr[j]=t;
		
	}
	
	public static void main(String[] args) {
		
		
		int[] arr= {10,9,8,7,6,5,4,3,2,1};
		SelectSort.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(' ');
		}
			
	}
}

