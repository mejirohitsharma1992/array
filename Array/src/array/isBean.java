package array;

public class isBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isBean(new int[]{3,6,5});
		System.out.println(result);
	}
	public static int isBean(int[] a) {
		  int len = a.length;
//		  int result = 1;
		  int count=0;
		  for (int i = 0; i < len; i++) {
//		    int flag = 0;
		    for (int j = 0; j < len; j++) {
		      if (a[i] == 2 * a[j] || a[i] == (2 * a[j] + 1) || a[i] == a[j] / 2) {
//		        flag = 1;
//		    	  count++;
//		    	  System.out.println(a[i]);
		    	  System.out.println(a[j]);
		    	  count=1;
		        break;
		      }
		    }
//		    if (flag == 0) {
//		      result = 0;
//		    }
		    if(count==0) {
		    	return 0;
		    }
		  }
//		  return result;
		  return count;
		}

}
