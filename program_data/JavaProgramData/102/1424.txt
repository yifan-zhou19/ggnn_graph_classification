package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int ttt;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] f = new double[44];
		double[] m = new double[44];
		String sex = new String(new char[10]);
		double height;
		for (ttt = 1;ttt <= n;ttt++)
		{

			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'm')
			{
				m[i] = height;
				i++;
			}
			else if (sex.charAt(0) == 'f')
			{
				f[j] = height;
				j++;
			}
		}
		int p = i - 1;
		int q = j - 1;
		double tt;
		int h1;
		int h2;
		for (h1 = 0;h1 < p;h1++)
		{
			for (h2 = 0;h2 < p;h2++)
			{
				if (m[h2] > m[h2 + 1])
				{
					tt = m[h2];
					m[h2] = m[h2 + 1];
					m[h2 + 1] = tt;
				}
			}
		}
		System.out.printf("%.2f", m[0]);
		for (h1 = 1;h1 <= p;h1++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", m[h1]);
		}
		for (h1 = 0;h1 < q;h1++)
		{
			for (h2 = 0;h2 < q;h2++)
			{
				if (f[h2] < f[h2 + 1])
				{
					tt = f[h2];
					f[h2] = f[h2 + 1];
					f[h2 + 1] = tt;
				}
			}
		}
		for (h1 = 0;h1 <= q;h1++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", f[h1]);
		}
		return 0;
	}

}

