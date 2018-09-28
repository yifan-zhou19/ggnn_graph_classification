package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		double[] a = new double[1000];
		double ave;
		double sum;
		double[] c2 = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{

			ave = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < k;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Double.parseDouble(tempVar3);
				}
				ave += a[i] / k;
			}
			sum = 0;
			for (i = 0;i < k;i++)
			{
				c2[i] = (a[i] - ave) * (a[i] - ave);
				sum += c2[i] / k;
			}
			System.out.printf("%.5lf\n",Math.sqrt(sum));

		}
	}


}

