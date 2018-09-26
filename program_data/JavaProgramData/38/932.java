package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			double m;
			double[] x = new double[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
			double p;
			p = x;
			double ave = 0;
			double sum = 0;
			m = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1; j <= m; j++)
			{
				*(p + j) = ConsoleInput.readToWhiteSpace(true);
				ave += *(p + j) / m;
			}
			for (int j = 1; j <= m; j++)
			{
				sum += (*(p + j) - ave) * (*(p + j) - ave);
			}
			System.out.printf("%.5f", Math.sqrt(sum / m));
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}


}

