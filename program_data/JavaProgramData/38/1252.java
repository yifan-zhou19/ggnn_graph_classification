package <missing>;

public class GlobalMembers
{
	public static double aver(tangible.RefObject<Double> p, int n)
	{
		int i;
		double a;
		double sum = 0;
		for (i = 0;i < n;i++)
		{
			sum = (p.argValue + i) + sum;
		}
		a = sum / n;
		return a;
	}
	public static double s(tangible.RefObject<Double> p, int n)
	{
		int i;
		double sum = 0;
		double av = aver(p, n);
		for (i = 0;i < n;i++)
		{
			sum = (*(p.argValue + i) - av) * (*(p.argValue + i) - av) + sum;
		}
		double a;
		a = sum / n;
		return (Math.sqrt(a));
	}


	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100];
		double[] p = new double[100];
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (double)malloc(100 * (Double.SIZE / Byte.SIZE));
		}
		for (i = 0;i < m;i++)
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
					p[i] + j = tempVar3;
				}
			}

			System.out.printf("%.5lf\n",s(p[i], n));

		}
	}
}

