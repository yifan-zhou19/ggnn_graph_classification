package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int a1 = -1;
		int a2 = -1;
		int b1 = -1;
		int b2 = -1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((i == 0 && j == 0 && a[i][j] == 0) || (a[i][j] == 0 && a[i + 1][j] == 0 && a[i][j + 1] == 0 && a[i - 1][j] != 0 && a[i][j - 1] != 0))
				{
					a1 = i;
					b1 = j;
					break;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if ((i == n - 1 && j == n - 1 && a[i][j] == 0) || (a[i][j] == 0 && a[i + 1][j] != 0 && a[i][j + 1] != 0 && a[i - 1][j] == 0 && a[i][j - 1] == 0))
				{
					a2 = i;
					b2 = j;
					break;
				}
			}
		}
		int sum = 0;
		for (i = a1 + 1;i < a2;i++)
		{
			for (j = b1 + 1;j < b2;j++)
			{
				if (a[i][j] != 0)
				{
					sum += 1;
				}
			}
		}
		System.out.printf("%d\n",sum);
	}
}

