package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sex = new String(new char[10]);
		double[] shengao = new double[40];
		double[] m = new double[40];
		double[] f = new double[40];
		int n;
		int i;
		int male = 0;
		int female = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shengao[i] = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				m[male++] = shengao[i]; //??????
			}
			if (sex.charAt(0) == 'f')
			{
				f[female++] = shengao[i]; //???i????female???
			}
		}

		int k;
		double e;
		for (k = 1;k <= male;k++)
		{
			for (i = 0;i < male - k;i++)
			{
				if (m[i] > m[i + 1])
				{
					e = m[i + 1];
					m[i + 1] = m[i];
					m[i] = e;
				}
			}
		}


		for (k = 1;k <= female;k++)
		{
			for (i = 0;i < female - k;i++)
			{
				if (f[i] < f[i + 1])
				{
					e = f[i + 1];
					f[i + 1] = f[i];
					f[i] = e;
				}
			}
		}
		for (k = 0;k < male;k++)
		{
			System.out.printf("%.2lf ",m[k]);
		}
		for (k = 0;k < female;k++) //???????????????
		{
			if (k < female-1)
			{
				System.out.printf("%.2lf ",f[k]);
			}
			else
			{
				System.out.printf("%.2lf",f[k]);
			}
		}

	return 0;
	}

}

