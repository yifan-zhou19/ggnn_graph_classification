package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[500][500];
		int i;
		int j;
		int n;
		int[] h = new int[3];
		int[] g = new int[3];
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 0)
				{
					h[1] = i;
					g[1] = j;
					break;
				}
			}
		}
		for (i = n;i >= 1;i--)
		{
			for (j = n;j >= 1;j--)
			{
				if (a[i][j] == 0)
				{
					h[2] = i;
					g[2] = j;
					break;
				}
			}
		}
		s = (h[1] - h[2] - 1) * (g[2] - g[1] - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

