package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int n;
		int s1;
		int s2;
		int l1;
		int l2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (a[i][j] == 255 && a[i][j - 1] == 0 && a[i - 1][j] == 0 && a[i - 1][j - 1] == 0)
				{
					s1 = i;
					l1 = j;
				}
				if (a[i][j] == 0 && a[i][j + 1] == 255 && a[i + 1][j] == 255 && a[i + 1][j + 1] == 255)
				{
					s2 = i;
					l2 = j;
				}
			}
		}
		System.out.printf("%d",(s2 - s1) * (l2 - l1));
		return 0;
	}
}

