package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m1 = 0;
		int n1 = 0;
		int m2 = 0;
		int n2 = 0;
		int s = 0;

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
				if (a[i][j] == 0 && a[i][j + 1] == 0 && a[i + 1][j] == 0)
				{
				 m1 = i;
				 n1 = j;
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0 && a[i - 1][j] == 0 && a[i][j - 1] == 0)
				{
				 m2 = i;
				 n2 = j;
				}
			}

		}

		s = (m2 - m1 - 1) * (n2 - n1 - 1);
		System.out.printf("%d\n",s);
		return 0;
	}
}

