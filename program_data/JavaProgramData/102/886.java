package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int mm;
		int ff;
		double[] b = new double[41];
		double[] m = new double[41];
		double[] f = new double[41];
		double c;
		char[][] a = new char[41][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		mm = ff = 0;
		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			if (a[i][0] == 'm')
			{
				m[mm] = b[i];
				mm++;
			}
			if (a[i][0] == 'f')
			{
				f[ff] = b[i];
				ff++;
			}
		}

		for (i = 0;i < mm - 1;i++)
		{
			for (j = 0;j < mm - 1 - i;j++)
			{
				if (m[j] > m[j + 1])
				{
					c = m[j];
					m[j] = m[j + 1];
					m[j + 1] = c;
				}
			}
		}
		for (i = 0;i < ff - 1;i++)
		{
			for (j = 0;j < ff - 1 - i;j++)
			{
				if (f[j] < f[j + 1])
				{
					c = f[j];
					f[j] = f[j + 1];
					f[j + 1] = c;
				}
			}
		}
		for (i = 0;i < mm;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < ff;i++)
		{
			if (i == ff - 1)
			{
				System.out.printf("%.2lf",f[i]);
			}
			else
			{
				System.out.printf("%.2lf ",f[i]);
			}
		}


		return 0;
	}

}

