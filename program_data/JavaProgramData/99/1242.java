package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double e;
		double f;
		double g;
		double h;
		int[] sz = new int[10000];
		int[] num = new int[10000];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] < 19)
			{
				a++;
			}
				else if (sz[i] < 36)
				{
				b++;
				}
				else if (sz[i] < 61)
				{
				c++;
				}
				else
				{
				d++;
				}
		}
		e = 1.0 * a / n * 100;
		f = 1.0 * b / n * 100;
		g = 1.0 * c / n * 100;
		h = 1.0 * d / n * 100;
		System.out.print("1-18: ");
		System.out.printf("%.2lf",e);
		System.out.print("%%\n");
		System.out.print("19-35: ");
		System.out.printf("%.2lf",f);
		System.out.print("%%\n");
		System.out.print("36-60: ");
		System.out.printf("%.2lf",g);
		System.out.print("%%\n");
		System.out.print("Over60: ");
		System.out.printf("%.2lf",h);
		System.out.print("%%\n");
		return 0;
	}


}

