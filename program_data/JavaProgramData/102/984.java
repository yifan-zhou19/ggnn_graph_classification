package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int l = 0;
		double height;
		double[] m = new double[42];
		double[] f = new double[42];
		double temp;
		String sex = new String(new char[7]);
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
				height = Double.parseDouble(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				m[k] = height;
				k++;
			}
			else if (sex.charAt(0) == 'f')
			{
				f[l] = height;
				l++;
			}
		}

		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (m[j] < m[i])
				{
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}

		for (i = 0;i < l - 1;i++)
		{
			for (j = i + 1;j < l;j++)
			{
				if (f[j] > f[i])
				{
					temp = f[i];
					f[i] = f[j];
					f[j] = temp;
				}
			}
		}

		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2lf",m[i]);
			}
			else
			{
				System.out.printf(" %.2lf",m[i]);
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf(" %.2lf",f[i]);
		}

		return 0;
	}

}

