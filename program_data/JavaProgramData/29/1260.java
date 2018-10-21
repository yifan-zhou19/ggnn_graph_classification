package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] d = new int[100];
		double a;
		double b;
		double e;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			a = 2.0;
			b = 1.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < d[i];j++)
			{
				s += a / b;
				e = b;
				b = a;
				a = a + e;
			}
			System.out.printf("%.3lf\n",s);
			s = 0;
		}
		return 0;
	}
}

