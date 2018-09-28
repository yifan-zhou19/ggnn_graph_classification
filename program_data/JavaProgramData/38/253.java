package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i = 1;
		int n;
		for (i;i <= k;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j = 0;
			double sum = 0;
			double[] a = new double[100];
			double s = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
			sum = sum + a[j];
			}
			sum = sum / n;
			for (j = 0;j < n;j++)
			{
			s = s + Math.pow(sum - a[j],2);
			}
			s = s / n;
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);
		}
	}

}

