package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] z = new int[1000];
		int n;
		int i;
		int m;
		int j;
		int[] u = new int[1000];
		int[] v = new int[1000];
		int c;
		int d;
		double[] s = new double[100];
		double b;
		b = 0;
		c = 0;
		d = 0;
		m = 0;
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
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				b = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				s[m] = Math.sqrt(b);
				u[m] = i;
				v[m] = j;
				m++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			if (n == 2)
			{
				break;
			}
			for (j = 0;j < n * (n - 1) / 2;j++)
			{
				if (s[j] < s[j + 1])
				{
					b = s[j];
					s[j] = s[j + 1];
					s[j + 1] = b;
					c = u[j];
					u[j] = u[j + 1];
					u[j + 1] = c;
					d = v[j];
					v[j] = v[j + 1];
					v[j + 1] = d;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			if (n == 2)
			{
				break;
			}
			if (s[i] == s[i + 1])
			{
				if (u[i] > u[i + 1])
				{
					c = u[i];
					u[i] = u[i + 1];
					u[i + 1] = c;
					d = v[i];
					v[i] = v[i + 1];
					v[i + 1] = d;
				}
				if (u[i] == u[i + 1])
				{
					if (v[i] > v[i + 1])
					{
						c = u[i];
						u[i] = u[i + 1];
						u[i + 1] = c;
						d = v[i];
						v[i] = v[i + 1];
						v[i + 1] = d;
					}
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			if (n == 2)
			{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[u[0]],y[u[0]],z[u[0]],x[v[0]],y[v[0]],z[v[0]],s[0]);
			}
			else
			{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[u[i]],y[u[i]],z[u[i]],x[v[i]],y[v[i]],z[v[i]],s[i]);
			}
		}
		return 0;
	}

}

