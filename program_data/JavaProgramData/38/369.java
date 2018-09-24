package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		double[] a = new double[200];
		double sum = 0;
		double b;
		double c;
		double sum2 = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < k;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[j] = Double.parseDouble(tempVar3);
		}
		sum = sum + a[j];
		}
		b = sum / k;
		for (j = 0;j < k;j++)
		{
			sum2 += (a[j] - b) * (a[j] - b);
		}

		c = Math.sqrt(sum2 / k);

		System.out.printf("%.5lf\n",c);

	  for (j = 0;j < k;j++)
	  {
		  a[j] = 0;
	  }
	  k = 0;
	  sum = 0;
	  sum2 = 0;






		}
		return 0;
	}

}

