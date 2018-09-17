package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] m = new double[41];
		double[] f = new double[41];
		double tmp;
		int n;
		int nm;
		int nf;
		int i;
		int j;
		String sex = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		nm = nf = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			if (strcmp(sex,"male") == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[nm++] = Double.parseDouble(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					f[nf++] = Double.parseDouble(tempVar4);
				}
			}
		}

		for (i = 0;i < nm;i++)
		{
			for (j = i + 1;j < nm;j++)
			{
				if (m[i] > m[j])
				{
					tmp = m[i];
					m[i] = m[j];
					m[j] = tmp;
				}
			}
		}
		for (i = 0;i < nf;i++)
		{
			for (j = i + 1;j < nf;j++)
			{
				if (f[i] < f[j])
				{
					tmp = f[i];
					f[i] = f[j];
					f[j] = tmp;
				}
			}
		}
		for (i = 0;i < nm;i++)
		{
			System.out.printf("%.2f ",m[i]);
		}
		for (i = 0;i < nf - 1;i++)
		{
			System.out.printf("%.2f ",f[i]);
		}
		System.out.printf("%.2f\n",f[nf - 1]);
		return 0;
	}
}

