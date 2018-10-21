package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		int[] n = new int[100];
		int number;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		int j;
		for (j = 1;j <= number;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[j] = Integer.parseInt(tempVar2);
			}
		}
		int i;
		for (i = 1;i <= number;i++)
		{
			a[1] = 1.0;
			a[2] = 2.0;
			int k;
			for (k = 3;k <= n[i] + 1;k++)
			{
				a[k] = a[k - 1] + a[k - 2];
			}
			double S = 0.0;
			int l;
			for (l = 1;l <= n[i];l++)
			{
				S = S + a[l + 1] / a[l];
			}
			System.out.printf("%.3f\n",S);
		}
		return 0;
	}


}

