package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		double a = 2.000;
		double b = 1.000;
		int[] c = new int[100];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			s[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < c[i];j++)
			{
				s[i] += 1.0 * a / b;
				a = a + b;
				b = a - b;
			}
			System.out.printf("%.3lf\n",s[i]);
			a = 2.000;
			b = 1.000;
		}
		return 0;
	}
}

