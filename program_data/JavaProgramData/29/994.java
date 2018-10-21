package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int fenzi = 2;
		int fenmu = 1;
		double[] result = new double[100];
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
				n = Integer.parseInt(tempVar2);
			}
			fenzi = 2;
			fenmu = 1;
			for (j = 1;j <= n;j++)
			{
				result[i] += 1.0 * fenzi / fenmu;
				fenzi = fenmu + fenzi;
				fenmu = fenzi - fenmu;

			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",result[i]);
		}
		return 0;
	}
}

