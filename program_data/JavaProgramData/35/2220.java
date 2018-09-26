package <missing>;

public class GlobalMembers
{
	public static int max(int x, int[][] str, int i, int n)
	{
		int j;
		for (j = 0;j < n;j++)
		{
			if (x < str[i][j])
			{
				return 0;
			}
		}
		return 1;
	}
	public static int min(int y, int[][] str, int j, int m)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			if (y > str[i][j])
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		char c;
		int m;
		int n;
		int i;
		int j;
		int[][] str = new int[8][8];
		int r;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		c = System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
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
					str[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				r = max(str[i][j], str, i, n);
				p = min(str[i][j], str, j, m);
				if (r != 0 && p != 0)
				{
					System.out.printf("%d+%d",i,j);
					return 0;
				}
			}
		}
		System.out.print("No");
		return 0;
	}

}

