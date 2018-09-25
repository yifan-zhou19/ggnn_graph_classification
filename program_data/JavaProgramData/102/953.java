package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
		int l = 0;
		int o;
		int p;
		int w;
		double h;
		char[][] e = new char[42][10];
		double[] f = new double[42];
		double[] m = new double[42];
		double[] g = new double[42];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 0;b < a;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				e[b] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[b] = Double.parseDouble(tempVar3);
			}
			w = strcmp(e[b],"male");
			if (w == 0)
			{
				m[d] = g[b];
				d++;
			}
			else
			{
				f[l] = g[b];
				l++;
			}
		}
		for (o = 0;o < d;o++)
		{
			for (p = o + 1;p < d;p++)
			{
				if (m[p] < m[o])
				{
					h = m[o];
					m[o] = m[p];
					m[p] = h;
				}
			}
		}
		for (o = 0;o < l;o++)
		{
			for (p = o + 1;p < l;p++)
			{
				if (f[p] > f[o])
				{
					h = f[o];
					f[o] = f[p];
					f[p] = h;
				}
			}
		}
		for (o = 0;o < d;o++)
		{
			System.out.printf("%.2lf ",m[o]);
		}
		for (o = 0;o < (l - 1);o++)
		{
			System.out.printf("%.2lf ",f[o]);
		}
		System.out.printf("%.2lf",f[l - 1]);
		return 0;
	}
}

