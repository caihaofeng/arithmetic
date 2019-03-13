package Quick;

public class QuickSort {

	private QuickSort() {
		
	}
	private static int   partition(int[] arr,int l,int r) {
		
		int v=arr[l];
		int j=l;
		for(int i=l+1;i<=r;i++) {
			if(arr[i]<v) {
				j++;
				swap(arr,j,i);
			}
		}
		
		
		swap(arr,l,j);
		return j;
	}
	
	private static void swap(int[] arr,int i,int j) {
		int t = arr[i];
	    arr[i]= arr[j];
	    arr[j]=t;
	}
	
	
	
	private static void  sort(int[] arr, int l,int r) {
		
		if(l>=r)
		return;
		int p =partition(arr,l,r);
		
		sort(arr,l,p-1);
		sort(arr,p+1,r);
	}
	
	public static void sort(int[] arr) {
		int n=arr.length;
		sort(arr,0,n-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {
				2,4,3,1
		};
		
		QuickSort.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
