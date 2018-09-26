package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static double average(int n, double * p)
	{
		double i;
		double s;
		s = 0;
		for (i = 0;i < n;i++)
		{
			s = s + *p;
			p++;
		}
		s = s / n;
		return s;
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static double S(int n, double * p)
	{
		double i;
		double s;
		double ave;
		s = 0;
		ave = average(n, p);
		for (i = 0;i < n;i++)
		{
			s = s + (*p - ave) * (*p - ave);
			p++;
		}
		s = s / n;
		s = Math.sqrt(s);
		return s;
	}

	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		double[] x = new double[100];
		double[] p = x;
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
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			System.out.printf("%.5f\n",S(n, p));
		}
		return 0;
	}

}

