package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] a = new int[25];
	public static int[][] f = new int[25][25];

	public static int max(int a, int b)
	{
		return a > b != 0?a:b;
	}

	public static void Main()
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		f[0][0] = a[0];
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (j == 0)
				{
					f[i][j] = max(f[i - 1][j], a[i]);
					continue;
				}
				if (f[i - 1][j - 1] >= a[i])
				{
					f[i][j] = max(f[i - 1][j], a[i]);
				}
				else
				{
					f[i][j] = f[i - 1][j];
				}
			}
		}
		j = k - 1;
		while (f[k - 1][j] == 0)
		{
			j--;
		}
		System.out.printf("%d",j + 1);
	}
}

