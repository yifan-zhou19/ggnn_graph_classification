package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] A = new int[300];
		int n;
		int i;
		int j;
		int k;
		int t;
		int num;
		num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= (n - 1);i++)
		{
			for (j = 0;j < i;j++)
			{
				if (A[j] == A[i])
				{
					A[i] = 0;
					num = num + 1;
					break;
				}
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (A[i] == 0)
				{
					t = A[i];
					A[i] = A[i + 1];
					A[i + 1] = t;
				}
			}
		}
		System.out.printf("%d",A[0]);
		for (i = 1;i <= (n - num - 1);i++)
		{
			System.out.printf(",%d",A[i]);
		}

	}



}

