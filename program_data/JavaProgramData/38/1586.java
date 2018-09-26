package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		double[] a = new double[100];
		double[] s = new double[100];
		double x;
		double b;
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
			x = 0;
			for (m = 0;m < n;m++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[m]) = Double.parseDouble(tempVar3);
				}
				x += a[m];
			}
			b = 0;
			   for (m = 0;m < n;m++)
			   {
			b += (a[m] - x / n) * (a[m] - x / n);
			   }
			s[i] = Math.sqrt(b / n);
		}
		for (i = 0;i < k;i++)
		{
	System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}


}

