package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int j;
		double[] a = new double[1000];
		double b;
		double d;
		double S;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			b = 0;
			d = 0;

			for (j = 1;j <= k;j++)
			{
				b = b + a[j];
			}
			c = b / k;
			for (j = 1;j <= k;j++)
			{
				d = d + (a[j] - c) * (a[j] - c);
				S = Math.sqrt(d / k);
			}
			System.out.printf("%.5lf\n",S);
		}
	}


}

