package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int n;
		int c;
		int i;
		int j;
		double[] s = new double[100];
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			d = 1.0 * 0;
			a = 2;
			b = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
				for (j = 0;j < n;j++)
				{
					d += 1.0 * a / b;
					c = a;
					a = a + b;
					b = c;
				}
				s[i] = d;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}
		return 0;
	}
}

