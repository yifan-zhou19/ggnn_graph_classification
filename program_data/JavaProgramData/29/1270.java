package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int c;
		int a;
		int b;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] sz = new int[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			s = 0.0;
			a = 2;
			b = 1;
			for (j = 0;j < sz[i];j++)
			{
				s += ((1.0 * a) / b);
				c = a + b;
				b = a;
				a = c;
				c = 0;
			}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}
}

