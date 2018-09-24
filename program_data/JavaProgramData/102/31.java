package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l;
		int p;
		int q;
		double h;
		double[] m = new double[40];
		double[] f = new double[40];
		double x;
		double y;
		String sex = new String(new char[10]);
		final String a = "male";
		final String b = "female";
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
				h = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex,a) == 0)
			{
				m[j] = h;
				j++;
			}
			if (strcmp(sex,b) == 0)
			{
				f[k] = h;
				k++;
			}
		}
		p = j;
		q = k;
		for (l = 0;l < p - 1;l++)
		{
			for (j = 0;j < p - 1 - l;j++)
			{
				if (m[j] > m[j + 1])
				{
					x = m[j];
					m[j] = m[j + 1];
					m[j + 1] = x;
				}
			}
		}
		for (l = 0;l < q - 1;l++)
		{
			for (k = 0;k < q - 1;k++)
			{
				if (f[k] > f[k + 1])
				{
					y = f[k];
					f[k] = f[k + 1];
					f[k + 1] = y;
				}
			}
		}
		for (j = 0;j < p;j++)
		{
			if (j == 0)
			{
				System.out.printf("%.2lf",m[0]);
			}
			else
			{
				System.out.printf(" %.2lf",m[j]);
			}
		}
		for (k = q - 1;k >= 0;k--)
		{
			System.out.printf(" %.2lf",f[k]);
		}
		return 0;
	}






}

