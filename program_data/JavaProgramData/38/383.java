package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int i;
		int[] n = new int[1000];
		int j;
		float[] x = new float[1000];
		float[] sum = new float[1000];
		double[] S = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Float.parseFloat(tempVar3);
				}
				sum[i] += x[j];
			}
			for (j = 0;j < n[i];j++)
			{
				S[i] += (double)(x[j] - sum[i] / n[i]) * (x[j] - sum[i] / n[i]);
			}
			System.out.printf("%.5lf\n",Math.sqrt(S[i] / n[i]));
		}
	}
}

