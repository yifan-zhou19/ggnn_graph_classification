package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[11];
	public static int[] y = new int[11];
	public static int[] z = new int[11];
	public static int cnt;
	public static int n;
	public static int[] dist = new int[105];
	public static int getdist(int i,int j)
	{
		return (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
		   x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i < n;i++)
		{
		   for (int j = i + 1;j <= n;j++)
		   {
			  dist[++cnt] = getdist(i, j);
		   }
		}
		sort(dist + 1,dist + 1 + cnt); //???? ????
		for (int k = cnt;k >= 1;k--)
		{
			if (dist[k] != dist[k - 1]) //??????????????
			{
		   for (int i = 1;i < n;i++)
		   {
			  for (int j = i + 1;j <= n;j++)
			  {
				 if (getdist(i, j) == dist[k])
				 {
				   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[i],y[i],z[i],x[j],y[j],z[j],(double)(Math.sqrt(dist[k]))); //???? ????????
				 }
			  }
		   }
			}
		}

		return 0;
	}


}

