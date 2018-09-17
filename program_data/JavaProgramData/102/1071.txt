package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int a;
		int b;
		int p = 0;
		int q = 0;
		double[] sz = new double[50];
		double[] f = new double[50];
		double[] m = new double[50];
		double e;
		String s = new String(new char[10]);
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
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Double.parseDouble(tempVar3);
			}
			if (s.charAt(0) == 'f')
			{
				f[j] = sz[i];
				j++;
				p++;

			}
			else if (s.charAt(0) == 'm')
			{
				m[k] = sz[i];
				k++;
				q++;
			}
		}
			for (a = 1;a <= q;a++)
			{
				for (k = 0;k < q - a;k++)
				{
					if (m[k] > m[k + 1])
					{
					e = m[k];
					m[k] = m[k + 1];
					m[k + 1] = e;
					}
				}
			}
			for (b = 1;b <= p;b++)
			{
				for (j = 0;j < p - b;j++)
				{
					if (f[j] < f[j + 1])
					{
						e = f[j];
						f[j] = f[j + 1];
						f[j + 1] = e;
					}
				}
			}
			for (k = 0;k < q;k++)
			{
				System.out.printf("%.2lf ",m[k]);
			}
			for (j = 0;j < p;j++)
			{
				if (j < p - 1)
				{
				System.out.printf("%.2lf ",f[j]);
				}
				else
				{
					System.out.printf("%.2lf",f[j]);
				}
			}
			return 0;
	}

}

