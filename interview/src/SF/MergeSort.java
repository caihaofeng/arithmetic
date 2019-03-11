package SF;

import java.util.Arrays;

public class MergeSort {

	private MergeSort(){
		
	}
	private static void merge(int [] arr,int l,int mid ,int r) {
		
		int [] aux =Arrays.copyOfRange(arr, l, r+1);
		
		int i = l, j = mid+1;
		for (int k = l ; k <= r; k ++ ) {
			if( i > mid ){  // 如果左半部分元素已经全部处理完毕
                arr[k] = aux[j]; j ++;
            }
            else if( j > r ){   // 如果右半部分元素已经全部处理完毕
                arr[k] = aux[i-l]; i ++;
            }
            else if( aux[i-l] < aux[j-l] ){  // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i-l]; i ++;
            }
            else{  // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = aux[j-l]; j ++;
            }
		}
	}
	
	private static void sort(int [] arr,int l, int r) {
		 System.out.println("in mergesort, l =" + l + ", r =" + r );
		if(l>=r)
			return ;	
		 System.out.println("in mergesort, l1 =" + l + ", r1 =" + r );
    	int mid =(l+r)/2;
    	 System.out.println("int mid =(l+r)/2, l2 =" + l + ", r2 =" + r + ", mid= "+mid);
		sort(arr,l,mid);	
		 System.out.println("isort(arr,l,mid), l3 =" + l + ", r3 =" + r + ", mid= "+mid );
		sort(arr,mid+1,r);
		 System.out.println("sort(arr,mid+1,r), l4 =" + l + ", r4 =" + r + ", mid= "+mid );
		merge(arr,l, mid,r);
		 System.out.println("merge(arr,l, mid,r), l5 =" + l + ", r5 =" + r + ", mid= "+mid );
	}
	
	
	public static void sort(int [] arr) {
		int n =arr.length;
		sort(arr, 0, n-1);
	}
	public static void main(String[] args) {
		int [] arr= {5,4,3,2,1};
		MergeSort.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);;
			System.out.print(" ");
		}
	}
}
