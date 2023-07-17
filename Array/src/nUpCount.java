
public class nUpCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5);
		System.out.println(result);
		result = nUpCount(new int[]{6, 3, 1}, 6);
		System.out.println(result);
		result = nUpCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 20);
		System.out.println(result);
	}

	static int nUpCount(int[] a, int n){
		int nUpCount = 0;
		int partialSum = 0;
		int previousPartialSum = 0;
		for(int i=0; i<a.length; i++){
			previousPartialSum = partialSum;
			System.out.println(previousPartialSum+"\n");
			partialSum += a[i];
			System.out.println(partialSum+"\n");
			if(previousPartialSum <= n && partialSum > n){
				nUpCount++;
				System.out.println(nUpCount+"\n");
			}
		}
		System.out.println(nUpCount+"\n");
		return nUpCount;
	}

}
