package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int m;
		int[] x = new int[10000];
		int[] y = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 2;a <= m;a++)
		{
			for (b = 2;b <= Math.sqrt(a);b++)
			{
				if (a % b == 0)
				{
					x[a - 1] = 1;
					y[a - 1] = 0;
				}
			}
			if (x[a - 1] == 0)
			{
				y[a - 1] = a;
			}
		}
			for (i = 1;i <= m;i++)
			{
			for (j = 1;j <= m;j++)
			{
				if (m - y[i] == y[j] && y[i] <= y[j])
				{
					System.out.printf("%d %d\n",y[i],y[j]);
				}
			}
			}
		return 0;
	}

}

