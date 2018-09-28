package <missing>;

public class GlobalMembers
{
	public static void duqu(int[] a, int[] b, int M, int N)
	{
		int i;
		for (i = 0;i < M;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
	}
	public static void paixu(int[] a, int[] b, int M, int N)
	{
		int i = 0;
		int j = 0;
		int temp;
		for (i = 0;i < M;i++)
		{
			for (j = i;j < M;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = i;j < N;j++)
			{
				if (b[j] < b[i])
				{
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}
			}
		}
	}

	public static void hebing(int[] a, int[] b, int[] c, int M, int N)
	{
		int i;
		for (i = 0;i < M;i++)
		{
			c[i] = a[i];
		}
		for (i = M;i < M + N;i++)
		{
			c[i] = b[i - M];
		}
	}
	public static void shuchu(int[] C, int M, int N)
	{
		int i;
		for (i = 0;i < M + N - 1;i++)
		{
			System.out.printf("%d ",C[i]);
		}
		System.out.printf("%d",C[M + N - 1]);
	}


	public static int Main()
	{
		int m;
		int n;
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		int[] a3 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		duqu(a1, a2, m, n);
		paixu(a1, a2, m, n);
		hebing(a1, a2, a3, m, n);
		shuchu(a3, m, n);
		return 0;
	}

}

