package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int n;
		int l;
		int w;
		int s;
		int i;
		int j;
		int[][] f = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					f[i][j] = Integer.parseInt(tempVar2);
				}
				if (f[i][j] == 0)
				{
					a = a + 1;
				}

			}
			if (a > 2)
			{
				l = a;
			}

		}
		for (j = 0;j < n;j++)
		{
			b = 0;
			for (i = 0;i < n;i++)
			{
				if (f[i][j] == 0)
				{
					b = b + 1;
				}
			}
			if (b > 2)
			{
				w = b;
			}
		}
		s = (l - 2) * (w - 2);
		System.out.printf("%d\n",s);
		return 0;
	}


}

