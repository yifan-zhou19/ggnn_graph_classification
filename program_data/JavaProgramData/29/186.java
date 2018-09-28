package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[100];
		double[] sum = new double[100];
		double a = 1;
		double b = 2;
		double c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			a = 1;
			b = 2;
			for (int k = 0;k < n[i];k++)
			{
				sum[i] += b / a;
				c = b;
				b = a + b;
				a = c;
			}
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}
}

