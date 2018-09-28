package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int y;
		int h;
		int k;
		int m;
		int n;
		int t;
		int a;
		int[][] x = new int[500][500];
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
		y = 0;
		for (i = 1;i <= a;i++)
		{
			for (j = 1;j <= b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (t = 2;t <= a + b;t++)
		{

		for (k = 1;k < t;k++)
		{
			if (t - k <= b != 0 && k <= a)
			{
			System.out.printf("%d\n",x[k][t - k]);
			}

		}
		}
			return 0;
	}

}

