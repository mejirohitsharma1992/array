package array;

public class is121Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = is121Array(new int[]{2, 2, 2});
		System.out.println(result);
	}
//	static int is121Array(int[] a) {
//		  int len = a.length;
//		  int flag = 1;
//		  int first_one_count = 0, second_one_count = 0, two_count = 0;
//		  int prev_element = 0;
//		  int change_count = 0;
//		  if (a[0] != 1 || a[len - 1] != 1) flag = 0;
//		  for (int i = 0; i < len && flag == 1; i++) {
//		    if (a[i] == 2)
//		      two_count++;
//		    if (prev_element != a[i])
//		      change_count++;
//		    if (change_count == 1)
//		      if (a[i] == 1)
//		        first_one_count++;
//		    if (change_count == 3)
//		      if (a[i] == 1)
//		        second_one_count++;
//		    if (change_count > 3)
//		      flag = 0;
//		    prev_element = a[i];
//		  }
//		  if (two_count < 1)
//		    flag = 0;
//		  if (first_one_count != second_one_count)
//		    flag = 0;
//		  return flag;
//		}
	static int is121Array(int[] a) {
		int len=a.length;
		if(a[0] != 1 || a[len - 1] != 1) {return 0;}
		else {
			int midElement=a.length/2;
			if(a[midElement]!=2) {return 0;}
			int leftIndex=midElement-1,rightIndex=midElement+1;
			while(leftIndex<0 && rightIndex>=a.length) {
				if((a[leftIndex]!=1 || a[leftIndex]!=2)&&(a[rightIndex]!=1 ||a[rightIndex]!=2)){
					return 0;
				}else {
					if(a[leftIndex]!=a[rightIndex]) {
						return 0;
					}
				}
			}
		}
		return 1;
	}
}
