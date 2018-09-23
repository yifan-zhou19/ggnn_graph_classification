package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int n;
		int b;
		int c;
		int d;
		int e;
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if ((a[i][j] == 0) && (a[i - 1][j] != 0) && (a[i][j - 1] != 0))
				{
					b = i;
					c = j;
				}
				else if ((a[i][j] == 0) && (a[i - 1][j] == 0) && (a[i][j - 1] == 0))
				{
					d = i;
					e = j;
				}
			}
		}
		s = (d - b - 1) * (e - c - 1);
		System.out.printf("%d\n",s);
		return 0;
	}


}

