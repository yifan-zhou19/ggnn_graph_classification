package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q;
		int i;
		int m;
		int j;
		double p;
		double[] w = new double[1200];
		double s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *x;
		double x;
		x = w[0];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			s = 0;
			p = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j <= m - 1;j++)
			{
				*(x + j) = ConsoleInput.readToWhiteSpace(true);
				p = (x + j) + p;
			}
			p = p / m;
			for (j = 0;j <= m - 1;j++)
			{
				s = s + (*(x + j) - p) * (*(x + j) - p);
			}
			s = s / m;
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}




		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

