package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double s = 0;
		double average = 0;
		double t;
		t = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < t;j++)
		{
			s = 0;
			average = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		for (int i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		p = x;
		for (int i = 0;i < n;i++)
		{
			average = average + *(p + i);
		}
		average = average / n;
		for (int i = 0;i < n;i++)
		{
			s = s + (*(p + i) - average) * (*(p + i) - average);
		}
		s = s / n;
		s = Math.sqrt(s);
		System.out.printf("%.5f", s);
		System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

