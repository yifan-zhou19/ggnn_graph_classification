package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int x;
		int l;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			m = i / 2;
			for (j = 3;j <= m;j = j + 2)
			{
				x = 0;
				l = Math.sqrt(j);
				for (k = 1;k <= l;k++)
				{
					if (j % k == 0)
					{
					x++;
					}
				}
				if (x == 1)
				{
					x = 0;
					t = i - j;
					l = Math.sqrt(t);
					for (k = 1;k <= l;k++)
					{
						if (t % k == 0)
						{
						x++;
						}
					}
					if (x == 1)
					{
						System.out.printf("%d=%d+%d\n",i,j,t);
					break;
					}
				}
			}
		}
	}
}

