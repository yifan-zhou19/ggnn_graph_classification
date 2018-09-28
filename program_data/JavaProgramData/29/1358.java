package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] za = new double[m];

		for (int i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int a = 2;
			int b = 1;
			za[i] = 0;
			for (int k = 0;k < n;k++)
			{
				za[i] += 1.0 * a / b;
				e = a;
				a = a + b;
				b = e;

			}
		}
		for (int h = 0;h < m;h++)
		{
			System.out.printf("%.3lf\n",za[h]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(za);
		return 0;
	}
}

