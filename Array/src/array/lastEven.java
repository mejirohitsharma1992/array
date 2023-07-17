package array;

public class lastEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = lastEven(new int[]{3, 2, 5, 6, 7,8});
		System.out.println(result);
	}
	static int lastEven(int[] a) {
		{
			int len=a.length;
            int count = 0;
            for (int i = len-1; i > 0;i-- )
            {
                if (a[i] % 2 == 0)
                {
                	count = i;
                    break;
                }
            }
            return count;
        }
	}
}
