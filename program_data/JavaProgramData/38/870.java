package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int n;
		double[] x = new double[1001];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double sum;
		double sum2;
		double eve;
		double s;
		for (i = 0;i < k;i++)
		{
			sum = 0,sum2 = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = x;
			for (j = 0;j < n;j++)
			{
				p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum = sum + p;
				sum2 = sum2 + p * p;
			}
			eve = sum / n;
			s = Math.sqrt((sum2 + n * eve * eve-2 * sum * eve) / n);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");

		}

		return 0;
	}
}

