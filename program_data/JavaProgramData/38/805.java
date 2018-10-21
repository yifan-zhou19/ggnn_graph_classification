package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[100];
		double[] sum = new double[100];
		double[] fanghe = new double[100];
		double[] fang = new double[100];
		double[][] b = new double[100][100];
		double[] pinjun = new double[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < a[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < a[i];j++)
			{
				sum[i] += b[i][j];
			}
			pinjun[i] = sum[i] / a[i];
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < a[i];j++)
			{
				fanghe[i] += (b[i][j] - pinjun[i]) * (b[i][j] - pinjun[i]);

			}
			fang[i] = Math.sqrt(fanghe[i] / a[i]);
		}
		 for (i = 0;i < k;i++)
		 {
			 System.out.printf("%.5lf\n",fang[i]);
		 }
		 return 0;
	}



}

