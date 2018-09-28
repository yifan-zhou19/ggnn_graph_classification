package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] n = new int[100];
		int a = 1;
		int b = 2;
		int e;
		double[] he = new double[100];
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
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		he[0] = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				he[i] = he[i] + (1.0 * b / (a * 1.0));
				e = b;
				b = a + b;
				a = e;

			}
			System.out.printf("%.3lf\n",he[i]);
			he[i + 1] = 0;
			a = 1;
			b = 2;
		}
		return 0;
	}
}

