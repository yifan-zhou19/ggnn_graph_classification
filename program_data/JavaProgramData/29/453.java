package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int e;
		int j;
		double b = 2;
		double c;
		double f;
		double g = 0;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			b = 2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				e = Integer.parseInt(tempVar2);
			}
			g = 0;
			for (j = 0;j < e;j++)
			{
				g = g + b;
				b = 1 + (1 / b);
			}
			s[i] = g;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}
		return 0;
	}
}

