package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int l = 0;
		double[] h = new double[40];
		double[] m = new double[40];
		double[] f = new double[40];
		char[][] s = new char[40][7];
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (s[i][0] == 'm')
			{
				m[t] = h[i];
				t++;
			}
			else
			{
				f[l] = h[i];
				l++;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			for (j = t - 1;j > i;j--)
			{
				if (m[j] < m[j - 1])
				{
					double p = m[j];
					m[j] = m[j - 1];
					m[j - 1] = p;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < l - 1;i++)
		{
			for (j = l - 1;j > i;j--)
			{
				if (f[j] > f[j - 1])
				{
					double q = f[j];
					f[j] = f[j - 1];
					f[j - 1] = q;
				}
			}
		}
		for (i = 0;i < l - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		for (i = l - 1;i < l;i++)
		{
			System.out.printf("%.2lf",f[i]);
		}
		return 0;
	}
}

