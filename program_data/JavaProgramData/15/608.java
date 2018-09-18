package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int[][] a = new int[1000][1000];
		int x;
		int y;
		int p;
		int q;
		int s;
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[i][j] == 0 && a[i + 1][j] == 0 && a[i][j + 1] == 0)
				{
					x = i;
					y = j;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (a[i][j] == 0 && a[i - 1][j] == 0 && a[i][j - 1] == 0)
				{
					p = i;
					q = j;
				}
			}
		}
		s = (p - x - 1) * (q - y - 1);
		System.out.printf("%d",s);
	}


}

