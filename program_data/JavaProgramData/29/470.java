package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int xiangshu;
		int[] shulie = new int[100];
		double[] result = new double[100];
		double[] sum = new double[100];
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			sum[i] = 0.0;
		}
		shulie[0] = 1;
		shulie[1] = 2;
		for (i = 2;i < 100;i++)
		{
			shulie[i] = shulie[i - 1] + shulie[i - 2];
		}
		for (i = 0;i < 99;i++)
		{
			result[i] = shulie[i + 1] * 1.0 / shulie[i];
		}
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
				xiangshu = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < xiangshu;j++)
			{
				sum[i] += result[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}
}

