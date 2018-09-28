package <missing>;

public class GlobalMembers
{
	public static double b(double x)
	{
		if (x >= 90 && x <= 100)
		{
			return 4.0;
		}
		if (x >= 85 && x <= 89)
		{
			return 3.7;
		}
		if (x >= 82 && x <= 84)
		{
			return 3.3;
		}
		if (x >= 78 && x <= 81)
		{
			return 3.0;
		}
		if (x >= 75 && x <= 77)
		{
			return 2.7;
		}
		if (x >= 72 && x <= 74)
		{
			return 2.3;
		}
		if (x >= 68 && x <= 71)
		{
			return 2.0;
		}
		if (x >= 64 && x <= 67)
		{
			return 1.5;
		}
		if (x >= 60 && x <= 63)
		{
			return 1.0;
		}
		if (x < 60 && x >= 0)
		{
			return 0;
		}
	}
	public static int Main()
	{
		double[] p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *q;
		double q;
		double GPA;
		double sum = 0;
		double total = 0;
		double a;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new double[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (double)malloc((Double.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Double.parseDouble(tempVar2);
			}
			total += p[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			a = b(q[i]);
			sum += a * p[i];
		}
		GPA = sum / total;
		System.out.printf("%.2f",GPA);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(q);
		return 0;
	}
}

