package Merge;



import java.util.Arrays;

public class MergeSort {

	private MergeSort(){
		
	}
	private static void merge(int [] arr,int l,int mid ,int r) {
		
		int [] aux =Arrays.copyOfRange(arr, l, r+1);
		
		int i = l, j = mid+1;
		for (int k = l ; k <= r; k ++ ) {
			if( i > mid ){                    // �����벿��Ԫ���Ѿ�ȫ���������
                arr[k] = aux[j]; j ++;
            }
            else if( j > r ){                // ����Ұ벿��Ԫ���Ѿ�ȫ���������
                arr[k] = aux[i-l]; i ++;
            }
            else if( aux[i-l] < aux[j-l] ){  // ��벿����ָԪ�� < �Ұ벿����ָԪ��
                arr[k] = aux[i-l]; i ++;
            }
            else{                              // ��벿����ָԪ�� >= �Ұ벿����ָԪ��
                arr[k] = aux[j-l]; j ++;
            }
		}
	}
	
	private static void sort(int [] arr,int l, int r) {
		if(l>=r)
			return ;	
    	int mid =(l+r)/2;
		sort(arr,l,mid);	
		sort(arr,mid+1,r);
		if(arr[mid]>arr[mid+1])
		merge(arr,l, mid,r);
	
	}
	
	
	public static void sort(int [] arr) {
		int n =arr.length;
		sort(arr, 0, n-1);
	}
	public static void main(String[] args) {
		int [] arr= {4,3,2,1};
		MergeSort.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);;
			System.out.print(" ");
		}
	}
}
