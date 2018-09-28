package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		int l;
		double[] w = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			float h = 0F;
			float[] x = new float[100];
			double a = 0;
			double s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
				for (j = 0;j < n;j++)
				{

					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						x[j] = Float.parseFloat(tempVar3);
					}
					 h = h + x[j];

				}

				a = h / n;

				for (l = 0;l < n;l++)
				{
					s += (x[l] - a) * (x[l] - a);

				}
				w[i] = Math.sqrt(s / n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",w[i]);
		}
		return 0;
	}


}

