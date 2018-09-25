package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		int b = 0;
		int c = 0;
		int s;
		int[][] x = new int[1000][1000];
		int[] y = new int[1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			y[i] = 0;
			a = 0;
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i][j] = Integer.parseInt(tempVar2);
				}
				if (x[i][j] == 0)
				{
					a = a + 1;
				}
			}

			if (a > 0)
			{
				y[i] = 1;
			}
			if (a > b)
			{
				b = a;
			}

		}

		for (i = 1;i <= n;i++)
		{
			if (y[i] > 0)
			{
				c = c + 1;
			}
		}
		s = (b - 2) * (c - 2);
		System.out.printf("%d",s);



	}
}

