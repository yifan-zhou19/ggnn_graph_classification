package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[100];
		double[] x = new double[100];
		double[] s = new double[100];
		double[] x0 = new double[100];
		double[] sum = new double[100];
		double[] sum2 = new double[100];
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

			for (j = 0;j < a[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				 sum[i] = sum[i] + x[j];
			}
			x0[i] = sum[i] / a[i];
			for (j = 0;j < a[i];j++)
			{
				sum2[i] = sum2[i] + (x[j] - x0[i]) * (x[j] - x0[i]);
			}
			s[i] = Math.sqrt(sum2[i] / a[i]);


		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5f\n",s[i]);
		}
		return 0;
	}




}

