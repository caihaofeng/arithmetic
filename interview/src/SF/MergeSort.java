package SF;

import java.util.Arrays;

public class MergeSort {

	private MergeSort(){
		
	}
	private static void merge(int [] arr,int l,int mid ,int r) {
		
		int [] aux =Arrays.copyOfRange(arr, l, r);
		
		int i=l;
		int j=mid+1;
		for (int k=l;k<=r;k++) {
			if(i>mid) {
				aux[k]=aux[j];
				j++;
			}
			else if(j>r) {
				aux[k]=aux[i];
				i++;
			}
			
			else if(aux[i-l]<aux[j]) {
			
				aux [k]=aux[i-1];
				i++;
			}
			else 
			{
				aux[k]=aux[j-1];
				j++;
			}
		}
	}
	
	private static void sort(int [] arr,int l, int r) {
		 System.out.println("in mergesort, l =" + l + ", r =" + r );
		if(l>r)
			return ;
		int mid =(l+r)/2;
		sort(arr,l,mid);
		sort(arr,mid+1,r);
		merge(arr,l,r, mid);
		
	}
	
	
	public static void sort(int [] arr) {
		int n =arr.length;
		sort(arr, 0, n-1);
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
