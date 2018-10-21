package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		double[] a = new double[10000];
		double[] b = new double[10000];
		double[] l = new double[10000];
		double max = 0.0000;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			if (i >= 2)
			{
			 for (j = 1;j < i;j++)
			 {
				k++;
				l[k] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
				if (k >= 2)
				{
					if (l[k] > max)
					{
						max = l[k];
					}
				}
				 if (k == 1)
				 {
					  max = 0;
				 }

			 }
			}
		}
		System.out.printf("%.4f\n",max);
			return 0;
	}


}

