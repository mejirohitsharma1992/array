package array;

public class fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//not done completely
//		int[] result = fill(new int[]{1,2,3,5, 9, 12,-2,-1}, 3, 10);
//		System.out.println(result);
		int[] data = {1,2,3,5,9,12,-2,-1};

	    int[] val = fill(data,3,10);  // calling function.

	      for(int i=0;i< val.length; i++)
	      {
	        System.out.print(val[i]+" ");

	      }
	}
	public int[] fill(int[] arr, int k, int n)
	{
	int[] array = new int[n];
	int j = 0;
	for (int i = 0; i < n; i++)
	{

	if(k>0)
	{
	array[i] = arr[j];
	j++;
	if(j>=k)
	{
	j = 0;
	}
	}

	}
	return array;
	}


}
