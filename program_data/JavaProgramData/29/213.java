package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[1000];
		int m;
		int i;
		int j;
		double[] jg = new double[100];
		double[] sum = new double[1000];
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
		for (i = 0;i < m;i++)
		{
			jg[0] = 2 * 1.0 / 1;
			sum[i] = jg[0];
			for (j = 0;j < n[i] - 1;j++)
			{
				jg[j + 1] = 1 + (1 * 1.0 / jg[j]);
				sum[i] += jg[j + 1];
			}
			System.out.printf("%.3lf\n", sum[i]);
		}
		return 0;
	}
}

