import java.util.Scanner;

import sun.jvm.hotspot.code.Location.Where;

public class smallestLargestDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Largest difference between two numbers of an array Where largest Number appearNumber after the small number
		//5 2 6 4 3
		//2 appear before 6
		Scanner sc=new Scanner(System.in);
		int[] myarray=new int[5];
		System.out.println("enter numbers");
		for(int i=0;i<5;i++) {
			myarray[i]=sc.nextInt();
		}
		int small,i,pos=0;
		int big=small=myarray[0];
		for(i=1;i<5;i++) {
			if(myarray[i]>big) {
				big=myarray[i];
				pos=i;
			}
		}
		for(i=1;i<pos;i++) {
			if(myarray[i]<small) {
				small=myarray[i];
			}
		}
		System.out.println("the largest difference is "+(big-small)+"and largest difference is "+big+" and "+small);
		
	}

}
