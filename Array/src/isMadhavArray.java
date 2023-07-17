
public class isMadhavArray {
	public static void main(String[] args) {
		int result = isMadhavArray(new int[]{2, 1, 1});
		System.out.println(result);
		result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
		System.out.println(result);
		result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
		System.out.println(result);
		result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
		System.out.println(result);
		result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
		System.out.println(result);
	}

//	static int isMadhavArray(int[] a){
//		int isMadhavArray = 0;int arrayLength = a.length;int startIndex = 0; // start index of current array elements under consideration
//		int endIndex = 0; // end index of current array elements under consideration
//		int n = 1; // track current length of array elements between start and end index
//		int currentSum = 0; // current sum of array elements
//		int sum = 0; // sum of elements of array between startIndex and endIndex
//		int currentLengthOfArray = 1; // length of array from index 0 to endIndex
//		int calculatedLengthOfArray = 1; // length calculating n * (n+1)/2
//		while(currentLengthOfArray <= arrayLength){
//			if(currentLengthOfArray == calculatedLengthOfArray){
//				for(int index = startIndex; index <= endIndex; index++){
//					sum += a[index];
//				}
//			}else{				// Fail ::: The length of a Madhav array must be n*(n+1)/2 for some n
//				isMadhavArray = 0;
//				break;
//			}
//			if((currentSum == sum) || (startIndex == endIndex)){ // startIndex == endIndex to satisfy initial condition
//				currentSum = sum;
//				sum = 0;
//				isMadhavArray = 1;
//			}else{
//				// Fail ::: The sum is not equal
//				isMadhavArray = 0;
//				break;
//			}
//			if(currentLengthOfArray == arrayLength){				// already at the end of the array
//				break;
//			}else{
//				startIndex = endIndex + 1;
//				endIndex = startIndex + n;
//				if((startIndex < arrayLength && endIndex < arrayLength)){
//					// operating inside the array bounderies
//					n++;
//				}else{					// adjusting boundries; so that lastIndex points last element of array
//					endIndex = arrayLength - 1;
//					n = endIndex - startIndex;
//				}
//				calculatedLengthOfArray = n * (n + 1)/2;
//				currentLengthOfArray = endIndex + 1;
//			}
//		}
//		return isMadhavArray;
//	}
	
	static int isMadhavArray(int[] a){
		int count = 0;int len = a.length;int start = 0; // start index of current array elements under consideration
		int end = 0; // end index of current array elements under consideration
		int n = 1; // track current length of array elements between start and end index
		int currentSum = 0; // current sum of array elements
		int calculatedSum = 0; // sum of elements of array between startIndex and endIndex
		int currentLength = 1; // length of array from index 0 to endIndex
		int calculatedLength = 1; // length calculating n * (n+1)/2
		while(currentLength <= len){
			if(currentLength == calculatedLength){
				for(int i = start; i <= end; i++){
					calculatedSum += a[i];
				}
			}else{				// Fail ::: The length of a Madhav array must be n*(n+1)/2 for some n
				count = 0;
				break;
			}
			if((currentSum == calculatedSum) || (start == end)){ // startIndex == endIndex to satisfy initial condition
				currentSum = calculatedSum;
				calculatedSum = 0;
				count = 1;
			}else{
				// Fail ::: The sum is not equal
				count = 0;
				break;
			}
			if(currentLength == len){				// already at the end of the array
				break;
			}else{
				start = end + 1;
				end = start + n;
				if((start < len && end < len)){
					// operating inside the array bounderies
					n++;
				}else{					// adjusting boundries; so that lastIndex points last element of array
					end = len - 1;
					n = end - start;
				}
				calculatedLength = n * (n + 1)/2;
				currentLength = end + 1;
			}
		}
		return count;
	}
//	static int isMadhavArray(int[] a){
//	int len=a.length;
//	int c=2,x=1,i;
//	int y=a[0];
//	while(c<=len) {
//		int s=0;
//		for(i=x;i<=c;i++) {
//			s=s+a[i];
//		}
//
//		i=c+1;
//		c=c+i;
//		x=i;
//		if(y==s) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
//	return 0;
//	}
}
