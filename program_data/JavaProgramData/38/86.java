package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int m;
		double a;
		double t;
		double s;
		double[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p = null;
		double p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0 ; k < n ; k++)
		{
			t = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = x;
			for (i = 0 ; i < m ; i++)
			{
				*(p + i) = ConsoleInput.readToWhiteSpace(true);
			}
			a = 0;
			for (i = 0 ; i < m ; i++)
			{
				a += *(p + i);
			}
			a = a / m;
			for (i = 0 ; i < m ; i++)
			{
				t += ((*(p + i) - a) * (*(p + i) - a));
			}
			s = Math.sqrt(t / m);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

