package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100000][3];
		int i;
		int j;
		int n;
		int[][] b = new int[100000][2];
		int t;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < 3;j++)
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
			b[i][0] = a[i][0];
			b[i][1] = a[i][1] + a[i][2];
		}
		for (i = 0;i < 3;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				if (b[i][1] < b[k][1])
				{
					t = b[k][1];
					b[k][1] = b[i][1];
					b[i][1] = t;
					m = b[k][0];
					b[k][0] = b[i][0];
					b[i][0] = m;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",b[i][0],b[i][1]);
		}
		return 0;
	}

}

