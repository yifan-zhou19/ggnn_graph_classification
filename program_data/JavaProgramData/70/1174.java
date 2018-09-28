package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		float[] a = new float[200];
		float[] b = new float[200];
		float max = 0.0F;
		float mid = 0.0F;
		double[] c = new double[200];
		double[] d = new double[200];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			c[i] = (double)a[i];
			d[i] = (double)b[i];
		}
		for (i = 0;i <= k - 2;i++)
		{
			for (j = i + 1;j <= k - 1;j++)
			{
				mid = Math.sqrt((c[i] - c[j]) * (c[i] - c[j]) + (d[i] - d[j]) * (d[i] - d[j]));
				if (mid > max)
				{
				   max = mid;
				}
			}
		}

		System.out.printf("%.4f\n",max);

		return 0;
	}
}

