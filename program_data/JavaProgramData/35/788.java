package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] z = new int[8][8];
		int[] a = new int[8];
		int[] b = new int[8];
		int[] c = new int[8];
		int[] d = new int[8];
		int k = 0;
		int l = 0;
		int t = 0;
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
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					z[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int x = 0;x < m;x++)
		{
			int max = 0;
			for (int y = 0;y < m;y++)
			{
				if (z[x][y] > max)
				{
					max = z[x][y];
					a[k] = x;
					b[k] = y;
				}
			}
			k++;
		}
		for (int e = 0;e < n;e++)
		{
			int min = 100000;
			for (int f = 0;f < m;f++)
			{
				if (z[f][e] < min)
				{
					min = z[f][e];
					c[l] = f;
					d[l] = e;
				}
			}
			l++;
		}
		for (k = 0;k < m;k++)
		{
			for (l = 0;l < n;l++)
			{
				if (a[k] == c[l] && b[k] == d[l])
				{
					System.out.printf("%d+%d",a[k],b[k]);
					t++;
				}
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}



}

