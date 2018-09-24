package <missing>;

public class GlobalMembers
{
	public static double f(int n, double[][] p)
	{
		double a = 0;
		double s = 0;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{

			a = a + p[i];
		}
		a = a / n;
		for (i = 0;i < n;i++)
		{
			p[i] = (p[i] - a) * (p[i] - a);
			s = s + p[i];
		}
		s = Math.sqrt(s / n);
		return s;
	}

	public static void Main()
	{
		int k;
		int n;
		int i;
		int j;

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *q;
		double q;

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100];
		double[] p = new double[100];


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			q = (double)malloc(n * (Double.SIZE / Byte.SIZE));
			for (j = 0;j < n;j++)
			{
			p[j] = q + j;
			}

			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j] = tempVar3;
				}

			}
			System.out.printf("%.5f\n",f(n, p));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(q);
		}
	}

}

