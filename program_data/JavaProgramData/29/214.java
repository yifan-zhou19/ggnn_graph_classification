package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] zi = new int[1000];
		int[] mu = new int[1000];
		int[] n = new int[1000];
		float[] shu = new float[1000];
		float[] sum = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			sum[i] = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			zi[0] = 2;
			zi[1] = 3;
			mu[0] = 1;
			mu[1] = 2;
			for (j = 0;j < n[i];j++)
			{
				zi[j + 2] = zi[j] + zi[j + 1];
				mu[j + 2] = mu[j] + mu[j + 1];
				shu[j] = zi[j] * 1.0 / mu[j];
				sum[i] += shu[j];

			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",sum[i]);
		}
		return 0;
	}



}

