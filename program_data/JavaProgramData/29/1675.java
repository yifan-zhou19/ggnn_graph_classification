package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k = 0;
		int l = 0;
		double i = 2.0;
		double sum = 0.0;
		double[] a = new double[30];
		double deno = 1.0;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (;m >= 1;m--)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (;n >= 1;n--)
			{
				sum = sum + i / deno;
				p = deno;
				deno = i;
				i = i + p;
			}
			a[k] = sum;
			sum = 0;
			k++;
			i = 2.0;
			deno = 1.0;
		}
		for (;l <= k - 1;l++)
		{
			System.out.printf("%.3lf\n",a[l]);
		}
		return 0;
	}

}

