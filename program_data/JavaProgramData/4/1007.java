package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int sum = 0;
		int max;
		int min;
		int[][] a = new int[100][100];
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	for (k = 0;k < m + n - 1;k++)
	{
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i + j == k)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}
	}

	}

}

