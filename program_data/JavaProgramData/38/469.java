package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		double[] a = new double[100];
		double s = 0;
		double b = 0;
		double ss;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			ss = 0;
			s = 0;
			b = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				b = b + a[j] / k;
			}
			for (j = 0;j < k;j++)
			{
				s = s + (a[j] - b) * (a[j] - b) / k;
			}
			ss = Math.sqrt(s);
			System.out.printf("%.5lf\n",ss);
		}
		return 0;
	}

}

