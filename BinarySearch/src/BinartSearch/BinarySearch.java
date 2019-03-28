package BinartSearch;

public class BinarySearch {

	public int binarySearch(int[] arr ,int k) {
		int i=0;
		int j=arr.length;
		
		while(i<j) {
					
			int m =i+(j-i)/2;//int m =(i+j)/2;可能导致溢出
			if(k<arr[m]) {
				j=m;
			}
			else if (k>arr[m]) {
				i=m+1;
			}
			else {
				return m;
			}
			
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch Binary =new BinarySearch();
	
		System.out.println(Binary.binarySearch(new int[] {1,2,3,4,5}, 1));
		System.out.println(Binary.binarySearch(new int[] {1}, 1));
		System.out.println(Binary.binarySearch(new int[] {}, 1));
		System.out.println(Binary.binarySearch(new int[] {1,2}, 1));
		System.out.println(Binary.binarySearch(new int[] {1,2}, 2));

		
	}
	

}
