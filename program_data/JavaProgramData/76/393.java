package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int[] A = new int[5000];
		int[] B = new int[5000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				B[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (A[i] > A[i + 1])
				{
					int tap;
					tap = A[i];
					A[i] = A[i + 1];
					A[i + 1] = tap;
					int tbp;
					tbp = B[i];
					B[i] = B[i + 1];
					B[i + 1] = tbp;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			if (B[j] > B[j + 1])
			{
				int tmp;
				tmp = B[j];
				B[j] = B[j + 1];
				B[j + 1] = tmp;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (A[i + 1] <= B[i])
			{
				k++;
			}
		}
		if (k == n - 1)
		{
			System.out.printf("%d %d\n",A[0],B[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

