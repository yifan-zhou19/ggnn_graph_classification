package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int r;
	public static int[][] ch = new int[8][8];
	public static int max(int x)
	{
		int j;
		int p;
		p = ch[x][0];
		for (j = 0;j < n;j++)
		{
			if (ch[x][j] > p)
			{
				p = ch[x][j];
			}
		}
		return (p);
	}

	public static int min(int y)
	{
		int i;
		int p;
		p = ch[0][y];
		for (i = 0;i < m;i++)
		{
			if (ch[i][y] < p)
			{
				p = ch[i][y];
			}
		}
		return (p);
	}

	public static int Main()
	{
		r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					ch[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((ch[i][j] == max(i)) && (ch[i][j] == min(j)))
				{
					System.out.printf("%d+%d\n",i,j);
					r++;
				}
			}
		}
		if (r == 0)
		{
			System.out.print("No\n");
		}
	}

}

