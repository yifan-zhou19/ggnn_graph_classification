package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int x1;
		int x2;
		int y1;
		int y2;
		int s;
		int[][] a = new int[1000][1000];
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
		x1 = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 0)
				{
					y1 = i,x1 = j;
					break;
				}
			}
			if (x1 != 0)
			{
				break;
			}
		}
		x2 = 0;
		for (i = n;i >= 1;i--)
		{
			for (j = n;j >= 1;j--)
			{
				if (a[i][j] == 0)
				{
					y2 = i,x2 = j;
					break;
				}
			}
			if (x2 != 0)
			{
				break;
			}
		}
		s = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d\n",s);
	}
}

