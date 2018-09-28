package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		int i = 0;
		int e = 0;
		int j = 0;
		int k = 0;
		double[] a = new double[50];
		double b = 0;
		double s = 0;
		double sum = 0;
		double average = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (i < k)
		{
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
					a[j] = Double.parseDouble(tempVar3);
				}
				sum += a[j];
			}
			average = sum / n;
			for (j = 0;j < n;j++)
			{
				b += (a[j] - average) * (a[j] - average);
			}
			s = Math.sqrt(b / n);
			System.out.printf("%.5lf\n",s);
			sum = 0;
			average = 0;
			s = 0;
			b = 0;
			i++;
		}


		return 0;
	}

}

