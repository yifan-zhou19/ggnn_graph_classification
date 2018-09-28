package <missing>;

public class GlobalMembers
{
	public static double S()
	{
		int i;
		int n;
		double[] a = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double aver = 0;
		double s = 0;
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
			aver += a[i];
		}
		aver = aver / n;
		for (p = a,i = 0;i < n;i++)
		{
			s += (*(p + i) - aver) * (*(p + i) - aver);
		}
		return (Math.sqrt(s / n));
	}
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",S());
		}
		return 0;
	}
}

