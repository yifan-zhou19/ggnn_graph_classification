package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int b;
		int c;
		int d;
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
		for (i = 1;i <= m;i++)
		{
			for (b = 1;b <= n;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][b] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (b = 1;b <= n;b++)
			{
				if ((a[i][b] >= a[i][b - 1]) && (a[i][b] >= a[i][b + 1]) && (a[i][b] >= a[i - 1][b]) && (a[i][b] >= a[i + 1][b]))
				{
					c = i - 1;
					d = b - 1;
					System.out.printf("%d %d\n",c,d);
				}
			}
		}
		return 0;
	}





}

