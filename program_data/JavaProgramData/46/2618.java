package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int s;
		int t;
		int u;
		int v;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = 0;
		s = 0;
		t = 0;
		u = 0;
		v = 0;
		for (;;)
		{
		do
		{
			System.out.printf("%d\n",a[i][j]);
			j = j + 1;
		} while (j != n - s);
		j = j - 1;
		s = s + 1;
		i = i + 1;
		if (v + t + 1 == m)
		{
			break;
		}
		do
		{
			System.out.printf("%d\n",a[i][j]);
			i = i + 1;
		} while (i != m - t);
		i = i - 1;
		t = t + 1;
		j = j - 1;
		if (u + s == n)
		{
			break;
		}
		do
		{
			System.out.printf("%d\n",a[i][j]);
			j = j - 1;
		} while (j != u - 1);
		u = u + 1;
		j = j + 1;
		i = i - 1;
		if (v + t + 1 == m)
		{
			break;
		}
		do
		{
			System.out.printf("%d\n",a[i][j]);
			i = i - 1;
		} while (i != v);
		v = v + 1;
		i = i + 1;
		j = j + 1;
		if (u + s == n)
		{
			break;
		}
		}
		return 0;
	}

}

