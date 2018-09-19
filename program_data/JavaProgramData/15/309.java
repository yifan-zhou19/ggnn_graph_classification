package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int min;
		int max;
		int e;
		int b;
		int c;
		int d;
		int n;
		int t;
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
		max = 0;
		min = 200;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					if ((i + j) > max)
					{
					max = i + j;
					e = i;
					b = j;
					}
					if ((i + j) < min)
					{
					min = i + j;
					c = i;
					d = j;
					}
				}
			}
		}
		   t = (e - c + 1) * (b - d + 1) - 2 * (e - c + 1) - 2 * (b - d - 1);
		System.out.printf("%d",t);
		return 0;
	}
}

