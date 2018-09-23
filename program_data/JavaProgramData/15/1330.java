package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int a = 0;
		int c = 0;
		int b = 0;
		int d = 0;
		int[][] s = new int[1000][1000];
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
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
					if (s[i][j] == 0)
					{
						a = i;
						b = j;
						break;
					}
				}
					if (s[a][b] == 0)
					{
						break;
					}
		}
			for (i = 0;i < n;i++)
			{
			  for (j = 0;j < n;j++)
			  {
				if (s[i][j] == 0 && c <= i != 0 && d <= j)
				{
					c = i;
					d = j;
				}
			  }
			}
				m = (d - b - 1) * (c - a - 1);
				System.out.printf("%d\n",m);
				return 0;
	}

}

