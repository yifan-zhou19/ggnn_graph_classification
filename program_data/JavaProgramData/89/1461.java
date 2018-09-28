package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100001][3];
		int[][] b = new int[3][100001];
		int n;
		int i;
		int j;
		int h;
		int c;
		int d;
		int p;
		h = p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i - 1][1] = Integer.parseInt(tempVar3);
			}
			if (a[i - 1][0] == 0 & a[i - 1][1] == 0)
			{
			break;
			}
			h = h + 1;
		}
		for (i = 1;i <= h;i++)
		{
			c = d = 0;
			for (j = 1;j <= p;j++)
			{
				if (b[0][j - 1] == a[i - 1][1])
				{
					c = 1;
					break;
				}
				d = d + 1;
			}
			if (c == 0)
			{
				b[0][p] = a[i - 1][1];
				b[1][p] = 1;
				p = p + 1;
			}
			else
			{
			b[1][d] = b[1][d] + 1;
			}
		}
		for (i = 1;i <= p;i++)
		{
		if (b[1][i - 1] == n - 1)
		{
		System.out.printf("%d\n",b[0][i - 1]);
		}
		}
		if (p == 0)
		{
		System.out.print("NOT FOUND");
		}
		return 0;
	}
}

