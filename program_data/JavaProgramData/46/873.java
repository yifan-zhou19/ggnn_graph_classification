package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][100];
		int a;
		int b;
		int i;
		int j;
		int xx_a;
		int xx_b;
		int sx_a;
		int sx_b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		xx_a = 0;
		xx_b = 0;
		sx_a = a - 1;
		sx_b = b - 1;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		while (sx_a > xx_a && sx_b > xx_b)
		{
			for (j = xx_b; j < sx_b; j++)
			{
				System.out.printf("%d\n", s[xx_a][j]);
			}
			for (i = xx_a; i < sx_a; i++)
			{
				System.out.printf("%d\n", s[i][sx_b]);
			}
			for (j = sx_b; j > xx_b; j--)
			{
				System.out.printf("%d\n", s[sx_a][j]);
			}
			for (i = sx_a; i > xx_a; i--)
			{
				System.out.printf("%d\n", s[i][xx_b]);
			}
			sx_a--;
			sx_b--;
			xx_a++;
			xx_b++;
		}
		if ((a * b) % 2 != 0)
		{
			if (a < b)
			{
				for (j = xx_a;j <= sx_b;j++)
				{
					System.out.printf("%d\n", s[xx_a][j]);
				}
			}
			else
			{
				for (j = xx_b;j <= sx_a;j++)
				{
					System.out.printf("%d\n", s[j][xx_b]);
				}
			}
		}
		else if ((b % 2 == 0) && (a % 2 != 0) && (b > a))
		{
			for (j = xx_a;j <= sx_b;j++)
			{
				System.out.printf("%d\n", s[xx_a][j]);
			}
		}
		else if ((a % 2 == 0) && (b % 2 != 0) && (a > b))
		{
			for (j = xx_b;j <= sx_a;j++)
			{
				System.out.printf("%d\n", s[j][xx_b]);
			}
		}
		return 0;
	}

}

