package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int t;
		int k;
		int l;
		int p;
		int z = 1;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (m = 0;m < 5;m++)
		{
			t = a[m][0];
			p = 0;
			for (n = 0;n < 5;n++)
			{
				if (a[m][n] > t)
				{
				t = a[m][n];
				p = n;
				}
			}
			k = 1;
			for (l = 0;l < 5;l++)
			{
				if (a[l][p] < t)
				{
					k = 0;
					break;
				}
			}
			if (k != 0)
			{
				System.out.printf("%d %d %d",m + 1,p + 1,a[m][p]);
				z = 0;
			}
		}
		if (z != 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

