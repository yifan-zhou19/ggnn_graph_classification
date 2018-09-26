package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int c;
		int d = 2;
		int e = 1;
		int b;
		double s = 0;
		int[] a = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (c = 0;c < a[i];c++)
			{
				s = s + 1.0 * d / e;
				b = e;
				e = d;
				d = d + b;
			}
			if (i == m - 1)
			{
				System.out.printf("%.3lf",s);
			}
			else
			{
				System.out.printf("%.3lf\n",s);
			}
			s = 0;
			d = 2;
			e = 1;
		}
		return 0;
	}
}

