package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sex = new String(new char[1000]);
		double[] m = new double[10000];
		double[] f = new double[10000];
		double temp;
		int i;
		int j;
		int k;
		int n;
		int xm = 0;
		int xf = 0;
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
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				m[xm] = temp;
				xm++;
			}
			if (sex.charAt(0) == 'f')
			{
				f[xf] = temp;
				xf++;
			}

		}
		for (i = 0;i < xm;i++)
		{
			for (j = 0;j < xm - 1;j++)
			{
			if (m[j] > m[j + 1])
			{
				temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
			}
		}
		for (i = 0;i < xf;i++)
		{
			for (j = 0;j < xf - 1;j++)
			{
			if (f[j] < f[j + 1])
			{
				temp = f[j];
				f[j] = f[j + 1];
				f[j + 1] = temp;
			}
			}
		}
		for (i = 0;i < xm;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < xf - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		System.out.printf("%.2lf\n",f[xf - 1]);
		return 0;
	}
}

