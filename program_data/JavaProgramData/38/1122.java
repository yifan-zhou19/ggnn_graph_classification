package <missing>;

public class GlobalMembers
{
	public static void count()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100],m=0,s=0;
		double[] p = new double[100];
		double m = 0;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (double)malloc((Double.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Double.parseDouble(tempVar2);
			}
			m = m + p[i];
		}
		m = m / n;
		for (i = 0;i < n;i++)
		{
			s = s + (p[i] - m) * (p[i] - m);
		}
		s = s / n;
		System.out.printf("%.5f\n", Math.sqrt(s));
	}

	public static void Main()
	{
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		count();
		}
	}
}

