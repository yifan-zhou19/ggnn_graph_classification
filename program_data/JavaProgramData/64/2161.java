package <missing>;

public class GlobalMembers
{
	/*
	 * pl.cpp
	 *
	 *  Created on: 2013-11-2
	 *      Author: lenovo
	 */

	public static final int maxN = 105;
	public static int[] x = new int[maxN];
	public static int[] y = new int[maxN];
	public static int[] z = new int[maxN];
	public static int[][] dis = new int[maxN][maxN];
	public static int[] d = new int[maxN * maxN];
	public static int n;
	public static int calc(int a,int b)
	{
		return (x[a] - x[b]) * (x[a] - x[b]) + (y[a] - y[b]) * ((y[a] - y[b])) + (z[a] - z[b]) * (z[a] - z[b]);
	}
	public static int Main()
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dis[i][i] = 0;
			for (j = 1;j < i;j++)
			{
				dis[i][j] = dis[j][i] = calc(i, j);
				d[++d[0]] = dis[i][j];
			}
		}
		sort(d + 1,d + d[0] + 1);
		d[d[0] + 1] = -1;
		for (int k = d[0];k != 0;k--)
		{
			if (d[k] != d[k + 1])
			{
				for (i = 1;i < n;i++)
				{
					for (j = i + 1;j <= n;j++)
					{
						if (dis[i][j] == d[k])
						{
						   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[i],y[i],z[i],x[j],y[j],z[j],Math.sqrt(dis[i][j]));
						}
					}
				}
			}
		}
		return 0;
	}

}

