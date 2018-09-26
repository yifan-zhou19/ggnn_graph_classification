package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		int w;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		double r;
		double s;
		double[] m = new double[n * (n - 1) / 2];
		double j;
		int[] p = new int[n * (n - 1) / 2];
		int[] q = new int[n * (n - 1) / 2];
		a = 0;
		for (i = 0;i < n;i++)
		{
			for (k = i + 1;k < n;k++)
			{
			r = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k]));
			m[a] = r;
			p[a] = i;
			q[a] = k;
			a++;
			}
		}
		s = n * (n - 1) / 2;
		for (i = 1;i < s;i++)
		{
			for (a = 0;a < s - i;a++)
			{
				if (m[a] < m[a + 1])
				{
					j = m[a];
					m[a] = m[a + 1];
					m[a + 1] = j;
					w = p[a];
					p[a] = p[a + 1];
					p[a + 1] = w;
					e = q[a];
					q[a] = q[a + 1];
					q[a + 1] = e;
				}
			}
		}
		for (a = 0;a < s;a++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[p[a]],y[p[a]],z[p[a]],x[q[a]],y[q[a]],z[q[a]],m[a]);
		}
		return 0;
	}






}

