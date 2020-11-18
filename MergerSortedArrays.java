package com.capability.training;

import java.util.Arrays;

public class MergerSortedArrays {

	public static void main(String[] agrs) {
		
		int[] a = {0,3,40};
		int[] b = {1,5,30,50,65};
		
		int[] c = new int[a.length+b.length];
		
		int i = 0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			} else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		
		while (i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		
		while (j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(c));
	}
}
