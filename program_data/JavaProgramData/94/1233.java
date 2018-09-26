package <missing>;

public class GlobalMembers
{
	public static void paixu(int n, int[] A)
	{
		int i;
		int t;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (A[j] < A[j - 1])
				{
					t = A[j - 1];
					A[j - 1] = A[j];
					A[j] = t;
				}
			}
		}
	}
	public static int Main()
	{
		int n = 0;
		int i;
		int N;
		int[] a = new int[500];
		int[] A = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				A[n] = a[i];
				n++;
			}
		}
		paixu(n, A);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d,",A[i]);
		}
		System.out.printf("%d",A[n - 1]);
		return 0;
	}
}

