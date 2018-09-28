package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[300];
		double s = 0;
		double[] b = new double[300];
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			s = s + a[i];
		}
		double mv = s / n;
		i = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] - mv >= 0)
			{
				b[i] = a[i] - mv;
			}
			else
			{
				b[i] = mv - a[i];
			}
		}
		int j;
		double t;
		double r;
		i = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
					r = a[j];
					a[j] = a[j + 1];
					a[j + 1] = r;
				}
			}
		}
		i = 1;
		System.out.printf("%d",(int)a[0]);
		while (b[i] == b[0])
		{
		   System.out.printf(",%d",(int)a[i]);
		   i++;
		}

	}
}

