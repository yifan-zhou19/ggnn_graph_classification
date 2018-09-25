package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k1;
		int k2;
		int m1;
		int m2;
		int s;
		int[][] a = new int[1001][1001];
		k1 = 0;
		k2 = 0;
		m1 = 0;
		m2 = 0;
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j - 1] != 0 && a[i - 1][j] != 0 && a[i][j + 1] == 0 && a[i][j] == 0)
				{
					k1 = i;
					m1 = j;
				}
				else if (a[i][j - 1] == 0 && a[i + 1][j] != 0 && a[i][j + 1] != 0 && a[i][j] == 0)
				{
					k2 = i;
					m2 = j;
				}
			}
		}
		s = (k2 - k1 - 1) * (m2 - m1 - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

