package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int[][] n = new int[100][100];
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (c = 1;c <= a;c++)
		{
			for (d = 1;d <= b;d++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n[c][d] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (a >= b)
		{
			for (e = 1;e <= b;e++)
			{
				for (f = 1;f <= e;f++)
				{
					System.out.printf("%d\n",n[f][e+1 - f]);
				}
			}
			for (g = 2;g <= a;g++)
			{
				for (h = 1;h <= b != 0 && g - 1 + h <= a;h++)
				{
					System.out.printf("%d\n",n[g - 1 + h][b + 1 - h]);
				}
			}
		}
		else
		{
			for (i = 1;i <= b;i++)
			{
				for (j = 1;j <= a != 0 && i + 1 - j>0;j++)
				{
					System.out.printf("%d\n",n[j][i + 1 - j]);
				}
			}
			for (k = 2;k <= a;k++)
			{
				for (l = 1;l <= a + 1 - k;l++)
				{
					System.out.printf("%d\n",n[k - 1 + l][b + 1 - l]);
				}
			}
		}
		return 0;
	}



}

