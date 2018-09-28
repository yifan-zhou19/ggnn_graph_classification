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
		double sum = 0.0;
		double x;
		double s0 = 0.0;
		double s;
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
			a = new double[n];
				for (sum = 0.0,j = 0;j < n;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Double.parseDouble(tempVar3);
					}
					sum += a[j];
				}
				x = sum / n;
				for (s0 = 0.0,j = 0;j < n;j++)
				{
				   s0 += (a[j] - x) * (a[j] - x);
				   s = Math.sqrt(s0 / n);
				}
				 System.out.printf("%.5lf\n",s);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
		return 0;
	}

}

