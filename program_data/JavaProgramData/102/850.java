package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] m = new double[50];
		double[] f = new double[50];
		double[] p = new double[100];
		char[][] sex = new char[50][10];
		int n;
		int i;
		int j = 0;
		int l = 0;
		double q;
		int k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Double.parseDouble(tempVar3);
			}
			if (sex[i][0] == 'm')
			{
				m[j] = p[i];
				j++;
			}
			else
			{
				f[l] = p[i];
				l++;
			}
		}
		for (k = j - 1; k > 0; k--)
		{
			for (i = 0; i < k; i++)
			{
				if (m[i] > m[i + 1])
				{
					q = m[i], m[i] = m[i + 1], m[i + 1] = q;
				}
			}
		}

		for (k = l - 1; k > 0; k--)
		{
			for (i = 0; i < k; i++)
			{
				if (f[i] < f[i + 1])
				{
					q = f[i], f[i] = f[i + 1], f[i + 1] = q;
				}
			}
		}

		System.out.printf("%.2lf", m[0]);
		for (i = 1; i <= j - 1; i++)
		{
			System.out.printf(" %.2lf", m[i]);
		}
		for (i = 0; i <= l - 1; i++)
		{
			System.out.printf(" %.2lf", f[i]);
		}

		return 0;
	}
}

