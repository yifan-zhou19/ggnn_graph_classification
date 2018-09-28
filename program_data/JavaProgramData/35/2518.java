package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int s;
		int[][] sz = new int[10][10];
		int i;
		int j;
		int[] p = new int[10];
		int q = 10000;
		int[] a = new int[10];
		int b;
		int c;
		int[] t = new int[10];
		int k;
		int h;
		int l;
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
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] > p[i])
				{
					p[i] = sz[i][j];
					a[i] = j;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < m;k++)
			{
			if (sz[k][a[i]] < p[i])
			{
				t[i] = 1;
				break;
			}
			else
			{
				if (p[i] < q)
				{
					q = p[i];
					b = i;
					c = a[i];
				}
			}
			}
		}
		for (i = 0;i < m;i++)
		{
		if (t[i] == 0)
		{
			s = 0;
		}
		}
		if (s == 0)
		{
			System.out.printf("%d+%d",b,c);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

