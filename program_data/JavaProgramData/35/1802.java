package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int panduan = new int(int * b,int z,int x,int y,int m2,int n2);
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int p;
		int q = 1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *g;
		int g;
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
		g = a[0][0];
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
			tangible.RefObject<Integer> tempRef_g = new tangible.RefObject<Integer>(g);
				p = panduan(tempRef_g, a[i][j], i, j, m, n);
				g = tempRef_g.argValue;
			if (p == 0)
			{
				System.out.printf("%d+%d",i,j);
			}
			/*printf("%d ",p);*/
			q = q * p;
			}
		}
		if (q == 1)
		{
			System.out.print("No");
		}
		return 0;
	}
	public static int panduan(tangible.RefObject<Integer> b, int z, int x, int y, int m2, int n2)
	{
		int m = 1;
		int n = 1;
		int i;
		int k;
		for (i = 0;i <= n2 - 1;i++)
		{
			if (*((b.argValue + x * 8) + i) > z)
			{
			k = 0;
			}
		else
		{
			k = 1;
		}
		m = m * k;
		}
		for (i = 0;i <= m2 - 1;i++)
		{
			if (*((b.argValue + i * 8) + y) < z)
			{
		   k = 0;
			}
		else
		{
			k = 1;
		}
		n = n * k;
		}
		if (m == 1 && n == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}

