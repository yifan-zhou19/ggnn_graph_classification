package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sex = new char[100][100];
		double[] m = new double[100];
		double[] f = new double[100];
		for (int a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[a] = tempVar2.charAt(0);
			}
			if (sex[a][0] == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[p] = Double.parseDouble(tempVar3);
				}
				p++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					f[q] = Double.parseDouble(tempVar4);
				}
				q++;
			}
		}
		for (int k = 1;k <= p;k++)
		{
			double e;
			for (int i = 0;i < p - k;i++)
			{
				if (m[i] > m[i + 1])
				{
				e = m[i + 1];
				m[i + 1] = m[i];
				m[i] = e;
				}
			}
		}
		for (int b = 1;b <= q;b++)
		{
			double c;
			for (int i = 0;i < q - b;i++)
			{
				if (f[i] < f[i + 1])
				{
				c = f[i + 1];
				f[i + 1] = f[i];
				f[i] = c;
				}
			}
		}
		for (int h = 0;h < p;h++)
		{
			System.out.printf("%.2lf ",m[h]);
		}
		for (int j = 0;j < q - 1;j++)
		{
			System.out.printf("%.2lf ",f[j]);
		}
		System.out.printf("%.2lf",f[q - 1]);
		return 0;
	}
}

