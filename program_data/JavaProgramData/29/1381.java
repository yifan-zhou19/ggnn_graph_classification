package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[MAX];
		double j;
		double sum = 0;
		double c;
		double b;
		double d;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j <= a[i];j++)
			{
				if (j == 1)
				{
				c = 2;
				b = 1;
				}
				sum += c / b;
				d = b;
				b = c;
				c = c + d;
			}
				System.out.printf("%.3lf\n",sum);
				sum = 0;
		}
			return 0;
	}


}

