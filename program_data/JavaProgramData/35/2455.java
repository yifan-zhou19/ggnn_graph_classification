package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int a;
		int b;
		int j;
		int[] Y = new int[1000];
		int X;
		int[][] sz = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		X = 0;
		for (i = 0;i < m;i++)
		{
			Y[i] = 1;
			a = i;
			b = 0;
			for (k = 1;k < n;k++)
			{
				if (sz[i][k] > sz[i][b])
				{
					b = k;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (sz[j][b] < sz[i][b])
				{
					Y[i] = 0;
				}
			}
			if (Y[i] == 1)
			{
				System.out.printf("%d+%d",a,b);
				X = 1;
			}
		}
		if (X == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

