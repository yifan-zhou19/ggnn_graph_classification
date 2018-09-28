package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] w = new double[500];
		double[] z = new double[500];
		int[] a = new int[500];
		float[] b = new float[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			w[0] = 1.0;
			w[1] = 2.0;
			z[0] = 2.0;
			z[1] = 3.0;
			b[i] = 2.0F;
			for (j = 1;j < a[i];j++)
			{
				b[i] += z[j] / w[j];
				z[j + 1] = z[j] + z[j - 1];
				w[j + 1] = w[j] + w[j - 1];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3f\n",b[i]);
		}
		return 0;
	}


}

