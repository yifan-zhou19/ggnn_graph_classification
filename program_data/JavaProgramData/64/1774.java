package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[30];
		int[] b = new int[45];
		int[] c = new int[45];
		int p = 0;
		int e;
		int q;
		int g;
		int i;
		int t;
		int k;
		int s;
		int x;
		int h;
		int j;
		int v;
		double[] dis = new double[45];
		double mid;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < (3 * n);i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		}
		for (t = 0;t < n;t++)
		{
			for (k = t + 1;k < n;k++)
			{
			 b[p] = t;
			 c[p] = k;
			  e = (a[3 * t] - a[3 * k]) * (a[3 * t] - a[3 * k]) + (a[3 * t + 1] - a[3 * k + 1]) * (a[3 * t + 1] - a[3 * k + 1]) + (a[3 * t + 2] - a[3 * k + 2]) * (a[3 * t + 2] - a[3 * k + 2]);
			  dis[p] = Math.sqrt(e);
				  p++;
			}
		}
		for (s = 1;s <= p;s++)
		{
			for (x = 0;x < p - s;x++)
			{
				if (dis[x] < dis[x + 1])
				{
				  mid = dis[x + 1];
				  dis[x + 1] = dis[x];
				  dis[x] = mid;
				  q = b[x + 1];
				  b[x + 1] = b[x];
				 b[x] = q;
				 g = c[x + 1];
				 c[x + 1] = c[x];
				 c[x] = g;
				}
			}
		}
		for (h = 0;h < p;h++)
		{
			j = 3 * b[h];
			v = 3 * c[h];

		   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[j],a[j + 1],a[j + 2],a[v],a[v + 1],a[v + 2],dis[h]);
		}
		return 0;
	}

}

