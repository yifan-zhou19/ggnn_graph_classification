package <missing>;

public class GlobalMembers
{
	public static int andian(int[][] a, int j, int k, int h, int l)
	{
		int b = 1;
		int p;
		for (p = 0;p < h;p++)
		{
			if (a[j][k] > a[p][k])
			{
				b = b * 0;
			}
		}
		for (p = 0;p < l;p++)
		{
			if (a[j][k] < a[j][p])
			{
				b = b * 0;
			}
		}
		return (b);
	}
	public static void Main()
	{
		int a;
		int b;
		int[][] c = new int[8][8];
		int j;
		int k;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < a;j++)
		{
			for (k = 0;k < b;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[j][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < a;j++)
		{
			for (k = 0;k < b;k++)
			{
				if ((andian(c, j, k, a, b) == 1))
				{
					System.out.printf("%d+%d\n",j,k);
					r = r + 1;
				}
			}
		}
		if (r == 0)
		{
			System.out.print("No\n");
		}
	}
}

