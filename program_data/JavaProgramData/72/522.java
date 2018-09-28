package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[300][300];
		int i;
		int j;
		int b = 0;
		int k;
		int l;

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
		m += 2;
		n += 2;

		for (i = 1;i < (m - 1);i++)
		{
			for (j = 1;j < (n - 1);j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (k = 1;k < (m - 1);k++)
		{
			for (l = 1;l < (n - 1);l++)
			{
				if (a[k][l] >= a[k + 1][l] != 0 && a[k][l] >= a[k][l + 1] != 0 && a[k][l] >= a[k - 1][l] != 0 && a[k][l] >= a[k][l - 1])
				{
					System.out.printf("%d %d\n",k - 1,l - 1);
				}
			}
		}

		return 0;
	}
}

