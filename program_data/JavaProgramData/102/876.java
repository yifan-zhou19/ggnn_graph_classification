package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int numm = -1;
		int numf = -1;
		double e;
		double[] h = new double[40];
		double[] m = new double[39];
		double[] f = {39, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char[][] sex = new char[40][7];
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (sex[i][0] == 'm')
			{
				numm++;
				m[numm] = h[i];
			}
			else
			{
				numf++;
				f[numf] = h[i];
			}
		}
		for (j = 1;j <= numm;j++)
		{
			for (i = 0;i <= numm - j;i++)
			{
				if (m[i] > m[i + 1])
				{
					e = m[i];
					m[i] = m[i + 1];
					m[i + 1] = e;
				}
			}
		}
		for (j = 1;j <= numf;j++)
		{
			for (i = 0;i <= numf - j;i++)
			{
				if (f[i] < f[i + 1])
				{
					e = f[i];
					f[i] = f[i + 1];
					f[i + 1] = e;
				}
			}
		}
		for (i = 0;i <= numm;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < numf;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		System.out.printf("%.2lf",f[numf]);
		return 0;
	}
}

