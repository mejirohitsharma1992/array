package array;

public class clusterCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result[] = clusterCompression(new int[]{3, 3, 3, 4, 4,1, 3, 2, 2, 2, 2, 4});
		for(int number : result){
			System.out.print(number + ", ");
		}
	}
	static int[] clusterCompression(int[] a) {
		  int len = a.length;
		  int numClusters = 0;
		  for (int i = 0; i < len; i++) {
		    if (i == 0) {
		    	numClusters = 1;
		    } else if (a[i] != a[i - 1]) {
		    	numClusters++;
		    }
		  }
		  int[] result = new int[numClusters];
		  int k = 0;
		  for (int j = 0; j < len; j++) {
		    if (j == 0) {
		    	result[k] = a[j];
		      k = 1;
		    } else if (a[j] != a[j - 1]) {
		    	result[k] = a[j];
		      k++;
		    }
		  }
		  return result;
		}
}
