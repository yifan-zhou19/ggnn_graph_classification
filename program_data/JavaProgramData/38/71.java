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
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double jun = 0;
		double s = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= k; j++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = a;
			for (i = 0; i < n; i++)
			{
				*(p + i) = ConsoleInput.readToWhiteSpace(true);
			}
			for (i = 0; i < n; i++)
			{
				jun = jun + *(p + i);
			}
			jun = jun / n;
			for (i = 0; i < n; i++)
			{
				s = s + (*(p + i) - jun) * (*(p + i) - jun);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Double.SIZE / Byte.SIZE));
			jun = 0;
			s = 0;
		}
		return 0;
	}
}

