package <missing>;

public class GlobalMembers
{
	public static void a()
	{
		int[] A = new int[100];
		int[] B = new int[100];
		int[] C = new int[200];
		int i;
		int j;
		int k;
		int m;
		int n;
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				B[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (A[j] > A[j + 1])
				{
					k = A[j + 1];
					A[j + 1] = A[j];
					A[j] = k;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (B[j] > B[j + 1])
				{
					k = B[j + 1];
					B[j + 1] = B[j];
					B[j] = k;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			C[i] = A[i];
		}
		for (i = 0;i < n;i++)
		{
			C[m + i] = B[i];
		}
		for (i = 0;i < m + n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",C[i]);
			}
			else
			{
				System.out.printf(" %d",C[i]);
			}
		}
	}
	public static void Main()
	{
		a();
	}
}

