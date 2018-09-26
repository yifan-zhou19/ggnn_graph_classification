package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		double[] s = new double[11];
		double[] t = new double[11];
		double[] q = new double[11];
		double[] r = new double[11];
		double k = 0;
		double m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Double.parseDouble(tempVar2);
			}
			k += s[i];
		}
		System.out.print("\n");
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t[i] = Double.parseDouble(tempVar3);
			}
				if ('d' >= t[i] != 0 && t[i] >= 'Z')
				{
					q[i] = 4;
				}
				else if ('Y' >= t[i] != 0 && t[i] >= 'U')
				{
					q[i] = 3.7;
				}
				else if ('T' >= t[i] != 0 && t[i] >= 'R')
				{
					q[i] = 3.3;
				}
				else if ('Q' >= t[i] != 0 && t[i] >= 'N')
				{
					q[i] = 3.0;
				}
				else if ('M' >= t[i] != 0 && t[i] >= 'K')
				{
					q[i] = 2.7;
				}
				else if ('J' >= t[i] != 0 && t[i] >= 'H')
				{
					q[i] = 2.3;
				}
				else if ('G' >= t[i] != 0 && t[i] >= 'D')
				{
					q[i] = 2.0;
				}
				else if ('C' >= t[i] != 0 && t[i] >= '@')
				{
					q[i] = 1.5;
				}
				else if ('?' >= t[i] != 0 && t[i] >= '<')
				{
					q[i] = 1.0;
				}
				else if (t[i] < '<')
				{
					q[i] = 0;
				}

		}
		   System.out.print("\n");
	for (i = 1;i <= n;i++)
	{
		r[i] = s[i] * q[i];
		m += r[i];
	}
	System.out.printf("%.2lf",m / k);
	}

}

