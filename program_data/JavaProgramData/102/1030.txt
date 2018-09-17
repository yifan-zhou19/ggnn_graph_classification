package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int s = 0;
		int g;
		char[][] x =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		double q;
		double[] y = new double[40];
		double[] m = new double[40];
		double[] f = new double[40];
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
				x[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i][0] == 'f')
			{
				f[s] = y[i];
				s++;
			}
			if (x[i][0] == 'm')
			{
				m[k] = y[i];
				k++;
			}
		}
		for (i = 1;i < k;i++)
		{
			for (g = 0;g < k - 1;g++)
			{
				if (m[g] > m[g + 1])
				{
					q = m[g];
					m[g] = m[g + 1];
					m[g + 1] = q;
				}
			}
		}
		for (i = 1;i < s;i++)
		{
			for (g = 0;g < s - 1;g++)
			{
				if (f[g] < f[g + 1])
				{
					q = f[g];
					f[g] = f[g + 1];
					f[g + 1] = q;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < s - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		System.out.printf("%.2lf",f[s - 1]);
		return 0;
	}
}

