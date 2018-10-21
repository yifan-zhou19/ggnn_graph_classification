package <missing>;

public class GlobalMembers
{
	public static void bubbleSort(int[] A, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
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
	public static int Main()
	{
		int s;
		int i;
		int[] A = new int[N];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (i = 0;i < s;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		bubbleSort(A, s);

		System.out.printf("%d\n%d\n",A[s - 1],A[s - 2]);

		return 0;
	}

}

