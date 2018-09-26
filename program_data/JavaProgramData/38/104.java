package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double[] a = new double[1010];
		double sum;
		double average;
		double result;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Double.SIZE / Byte.SIZE));
			sum = 0;
			average = 0;
			result = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = a;
			for (j = 0; j < n; j++)
			{
				*(p + j) = ConsoleInput.readToWhiteSpace(true);
				sum += *(p + j);
			}
			average = sum / n;

			sum = 0.0;
			for (j = 0; j < n; j++)
			{
				*(p + j) = Math.pow((*(p + j) - average), 2);
				sum += *(p + j);
			}
			average = sum / n;
			result = Math.sqrt(average);
			System.out.printf("%.5f", result);
			System.out.printf("%.5f", "\n");
		}

		return 0;
	}
}

