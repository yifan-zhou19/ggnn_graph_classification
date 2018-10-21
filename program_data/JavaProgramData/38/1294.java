package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		double[] a;
		double sum;
		double aver;
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
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a = (double)malloc(n);

			sum = 0.0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum += a[j];
			}
			aver = sum / (double)n;
			sum = 0;
			for (j = 0;j < n;j++)
			{
			   sum += (a[j] - aver) * (a[j] - aver);
			}
			aver = Math.sqrt((sum) / (double)n);
			System.out.printf("%.5lf\n",aver);
		}

		return 0;
	}
}

