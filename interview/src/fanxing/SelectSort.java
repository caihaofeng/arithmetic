package fanxing;



import java.util.*;

import SF.SortTestHelper;

public class SelectSort {

    // ���ǵ��㷨�಻��������κ�ʵ��
    private SelectSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        for( int i = 0 ; i < n ; i ++ ){
            // Ѱ��[i, n)���������Сֵ������
            int minIndex = i;
            for( int j = i + 1 ; j < n ; j ++ )
                // ʹ��compareTo�����Ƚ�����Comparable����Ĵ�С
                if( arr[j].compareTo( arr[minIndex] ) < 0 )
                    minIndex = j;

            swap( arr , i , minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        // ���������㷨��������
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SelectSort.sort( arr );
        SortTestHelper.printArray(arr);

        return;
    }
}
