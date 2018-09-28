package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int i;
		int j;
		int[][] a = new int[100][10];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = 100;
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			while ((a[i][j] + 3 * (j + 1)) < 60)
			{
				j++;
			}
			sum = 60 - 3 * j;
			if (a[i][j] + 3 * (j + 1) < 63)
			{
				sum = sum - (63 - a[i][j] - 3 * (j + 1));
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

