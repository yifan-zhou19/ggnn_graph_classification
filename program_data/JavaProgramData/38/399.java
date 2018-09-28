package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		float[][] a = new float[100][100];
		double[] n = new double[100];
		double[] b = new double[100];
		double s1;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Double.parseDouble(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Float.parseFloat(tempVar3);
				}
				b[i] += a[i][j];
			}
		}
		for (i = 0;i < k;i++)
		{
			s1 = 0;
			c = 0;
			for (j = 0;j < n[i];j++)
			{
			   c = (a[i][j] - b[i] / n[i]);
			s1 += Math.pow(c,2);
			}
		 System.out.printf("%.5lf\n",Math.pow(s1 / n[i],0.5));
		}
		return 0;
	}
}

