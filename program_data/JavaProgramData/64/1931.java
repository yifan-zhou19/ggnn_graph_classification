package <missing>;

public class GlobalMembers
{
	public static int dist(int x1,int y1,int z1,int x2,int y2,int z2)
	{
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2);
	}
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] d = new int[100];
		int i;
		int j;
		int n;
		int m;
		int k;
		int[] a1 = new int[100];
		int[] b1 = new int[100];
		int[] c1 = new int[100];
		int[] a2 = new int[100];
		int[] b2 = new int[100];
		int[] c2 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = dist(x[i], y[i], z[i], x[j], y[j], z[j]);
				a1[k] = x[i];
				b1[k] = y[i];
				c1[k] = z[i];
				a2[k] = x[j];
				b2[k] = y[j];
				c2[k] = z[j];
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
		for (j = 0;j < k - i - 1;j++)
		{
			if (d[j] < d[j + 1])
			{
				m = d[j];
				d[j] = d[j + 1];
				d[j + 1] = m;
				m = a1[j];
				a1[j] = a1[j + 1];
				a1[j + 1] = m;
				m = b1[j];
				b1[j] = b1[j + 1];
				b1[j + 1] = m;
				m = c1[j];
				c1[j] = c1[j + 1];
				c1[j + 1] = m;
				m = a2[j];
				a2[j] = a2[j + 1];
				a2[j + 1] = m;
				m = b2[j];
				b2[j] = b2[j + 1];
				b2[j + 1] = m;
				m = c2[j];
				c2[j] = c2[j + 1];
				c2[j + 1] = m;
			}
		}
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a1[i],b1[i],c1[i],a2[i],b2[i],c2[i],Math.sqrt(d[i]));
		}
		return 0;
	}
}

