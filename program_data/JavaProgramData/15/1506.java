package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int x = 0;
		int[][] m = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= n;a++)
		{
			for (b = 1;b <= n;b++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m[a][b] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (c = 1;c <= n;c++)
		{
			for (d = 1;d <= n;d++)
			{
				if (m[c][d] == 0)
				{
					for (e = d + 1;e <= n;e++)
					{
						if (m[c][e] != 0)
						{
							x++;
						}
						else
						{
							break;
						}
					}
				break;
				}
			}
		}
		System.out.printf("%d",x);
		return 0;
	}


}

