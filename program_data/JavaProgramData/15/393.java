package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[99][99];
		int i;
		int j;
		int S;
		int c;
		int b;
		int g;
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
					t = i;
					g = j;
					i = n + 1;
					break;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (s[i][j] == 0)
				{
				c = i;
				b = j;
				i = -1;
				break;
				}
			}
		}
		S = (c - t - 1) * (b - g - 1);
		System.out.printf("%d\n",S);
		return 0;
	}

}

