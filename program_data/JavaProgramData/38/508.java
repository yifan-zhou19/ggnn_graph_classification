package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		double[] num;
		double[] avr;
		num = new double[k];
		avr = new double[k];

		for (i = 0;i < k;i++)
		{
			num[i] = 0;
			avr[i] = 0;
		}

		int n;

		for (i = 0;i < k;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

			double[] a;
			a = new double[n];

			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				avr[i] += a[j] / n;
			}

			for (j = 0;j < n;j++)
			{
				num[i] += (Math.pow((a[j] - avr[i]),2) / n);
			}
			num[i] = Math.pow(num[i],0.5);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
		}

		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",num[i]);
		}

		return 0;
	}

}

