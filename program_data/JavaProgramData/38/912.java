package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] a = new double[100];
		double b;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		s = 0;
		b = 0;
		for (i = 0;i < k;i++)
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
			}
			for (j = 0;j < n;j++)
			{
				b += a[j];
			}
			b = b / n;
			for (j = 0;j < n;j++)
			{
				s += Math.pow(a[j] - b,2);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f\n",s);
			s = 0;
			b = 0;
		}
		return 0;
	}

}

