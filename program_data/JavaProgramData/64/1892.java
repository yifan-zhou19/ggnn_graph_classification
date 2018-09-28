package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int e;
		int f;
		int g;
		int l;
		int m = 0;
		int[] o = new int[50];
		int[] p = new int[50];
		int[] q = new int[50];
		int[] r = new int[50];
		int[] s = new int[50];
		int[] t = new int[50];
		int u;
		int v;
		int w;
		int x;
		int y;
		int z;
		double[] d = new double[50];
		double n;
		char h = '(';
		char i = ')';
		char j = '-';
		char k = '=';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		for (f = 0;f < e;f++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[f] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[f] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[f] = Integer.parseInt(tempVar4);
			}
		}
		for (f = 0;f < (e-1);f++)
		{
			for (g = f + 1;g < e;g++)
			{
				l = (a[f] - a[g]) * (a[f] - a[g]) + (b[f] - b[g]) * (b[f] - b[g]) + (c[f] - c[g]) * (c[f] - c[g]);
				d[m] = Math.sqrt(l);
				o[m] = a[f];
				p[m] = b[f];
				q[m] = c[f];
				r[m] = a[g];
				s[m] = b[g];
				t[m] = c[g];
				m++;
			}
		}
		for (f = 0;f < m;f++)
		{
			for (g = f + 1;g < m;g++)
			{
				if (d[f] < d[g])
				{
					n = d[g];
					u = o[g];
					v = p[g];
					w = q[g];
					x = r[g];
					y = s[g];
					z = t[g];
					for (e = g;e > f;e--)
					{
						d[e] = d[e-1];
						o[e] = o[e-1];
						p[e] = p[e-1];
						q[e] = q[e-1];
						r[e] = r[e-1];
						s[e] = s[e-1];
						t[e] = t[e-1];
					}
					d[f] = n;
					o[f] = u;
					p[f] = v;
					q[f] = w;
					r[f] = x;
					s[f] = y;
					t[f] = z;
				}
			}
		}
		for (f = 0;f < m;f++)
		{
			System.out.printf("%c%d,%d,%d%c%c%c%d,%d,%d%c%c%.2lf\n",h,o[f],p[f],q[f],i,j,h,r[f],s[f],t[f],i,k,d[f]);
		}
		return 0;
	}

}

