package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double sum;
		double ave;
		double fang;
		double[] a = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
			ave = 0;
			fang = 0;
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
					(a + j) = tempVar3;
				}
				sum = sum + a[j];
			}
			ave = sum / n;
			for (j = 0;j < n;j++)
			{
				fang = fang + Math.pow(a[j] - ave,2);
			}
			fang = Math.sqrt(fang / n);
			System.out.printf("%.5f\n",fang);
		}
		return 0;
	}

}

