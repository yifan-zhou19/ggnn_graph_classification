package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		int result = 0;
		int max;
		int min;
		int k;
		int num = 1;
		int[][] a = new int[3][50001];
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
				a[0][i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][i] = Integer.parseInt(tempVar3);
			}
		}
		max = min = a[0][0];
		for (j = 0;j < 2;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[j][i] > max)
				{
					max = a[j][i];
				}
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (a[0][i] >= a[0][i + 1])
				{
					for (k = 0;k < 2;k++)
					{
						e = a[k][i + 1];
						a[k][i + 1] = a[k][i];
						a[k][i] = e;
					}
				}
			}
		}

		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[1][j] >= a[0][i])
				{
					num++;
					break;
				}
			}
		}
		if (num == n)
		{
			result = 1;
		}
		if (result == 0)
		{
			System.out.print("no");
		}
		if (result == 1)
		{
			System.out.printf("%d %d",min,max);
		}

		return 0;
	}
}

