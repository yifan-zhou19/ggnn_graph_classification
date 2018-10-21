package <missing>;

public class GlobalMembers
{
	public static void bubbleSort(int[] A, int n)
	{
		int i;
		int j;
		int t;

		for (i = 0; i < n; i++)
		{
			for (j = n - 1;j > i;j--)
			{
					if (A[j] < A[j - 1])
					{

						t = A[j];
						A[j] = A[j - 1];
						A[j - 1] = t;
					}
			}
		}
	}
	public static void Main(String[] args)
	{
		int length;
		int i;
		int[] A = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			length = Integer.parseInt(tempVar);
		}
		for (i = 0;i < length;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		bubbleSort(A, length);

		System.out.printf("%d\n",A[length - 1]);
		System.out.printf("%d\n",A[length - 2]);


	}


}

