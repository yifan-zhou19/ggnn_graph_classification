package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int q = 0;
		int n;
		int i;
		int j;
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
			i = 0;
	for (j = 0;j < n;j++)
	{
				i = 0;
				while (a[i][j] != 0 && i < n)
				{
				i++;
				}
				i += 1;
				while (a[i][j] != 0 && i < n)
				{
				i++;
				q++;
				}
	}
	System.out.printf("%d\n",q);
	return 0;
	}
}

