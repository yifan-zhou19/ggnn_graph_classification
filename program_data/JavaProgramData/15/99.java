package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int i1;
		int i2;
		int j1;
		int j2;
		int p;
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
		p = 1;
		for (i = 0;i < n && p != 0;i++)
		{
			for (j = 0;j < n && p != 0;j++)
			{
				if (a[i][j] == 0)
				{
				i1 = i;
				j1 = j;
				p = 0;
				}
			}
		}
		p = 1;
		for (i = n - 1;i >= 0 && p != 0;i--)
		{
			for (j = n - 1;j >= 0 && p != 0;j--)
			{
				if (a[i][j] == 0)
				{
				i2 = i;
				j2 = j;
				p = 0;
				}
			}
		}
		System.out.printf("%d\n",(i2 - i1 - 1) * (j2 - j1 - 1));
		return 0;
	}
}

