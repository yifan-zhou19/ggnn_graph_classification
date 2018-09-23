package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int e = 0;
		int g = 0;
		double h;
		double[] i = new double[40];
		double[] f = new double[40];
		double[] m = new double[40];
		char[][] l = new char[40][7];
		char[][] o = new char[1][5];
		char[][] p = new char[1][7];
		o[0] = "male";
		p[0] = "female";
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
				l[b] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				i[b] = Double.parseDouble(tempVar3);
			}
			if (strcmp(o[0],l[b]))
			{
				f[e] = i[b];
				e++;
			}
			else
			{
				m[g] = i[b];
				g++;
			}
		}
		for (b = 0;b < e;b++)
		{
			for (c = b + 1;c < e;c++)
			{
				if (f[b] < f[c])
				{
					h = f[b];
					f[b] = f[c];
					f[c] = h;
				}
			}
		}
		for (b = 0;b < g;b++)
		{
			for (c = b + 1;c < g;c++)
			{
				if (m[b] > m[c])
				{
					h = m[b];
					m[b] = m[c];
					m[c] = h;
				}
			}
		}
		for (b = 0;b < g;b++)
		{
			System.out.printf("%.2lf ",m[b]);
		}
		for (b = 0;b < (e-1);b++)
		{
			System.out.printf("%.2lf ",f[b]);
		}
		System.out.printf("%.2lf",f[e-1]);
		return 0;
	}
}

