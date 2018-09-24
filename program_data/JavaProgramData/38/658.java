package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		double[][] sz = new double[100][100];
		double[] sum1 = new double[100];
		double[] sum2 = new double[100];
		double[] a = new double[100];
		double[] s = new double[100];
		int i = 0;
		int j = 0;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum1[i] = 0;
			sum2[i] = 0;
			a[i] = 0;
			s[i] = 0;
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
					  sz[h][j] = Double.parseDouble(tempVar3);
				  }
			  }
			  h++;
		}

			for (i = 0;i < k;i++)
			{
				for (j = 0;j < n[i];j++)
				{
					sum1[i] += sz[i][j];
				}
				a[i] = (double)sum1[i] / n[i];

			}
			for (i = 0;i < k;i++)
			{
				for (j = 0;j < n[i];j++)
				{
					sum2[i] += (double)Math.pow((sz[i][j] - a[i]),2) / n[i];
				}
			s[i] = Math.sqrt(sum2[i]);
			}
			for (i = 0;i < k;i++)
			{
				System.out.printf("%.5f\n",s[i]);
			}
			return 0;
	}



}

