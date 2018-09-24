package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int counttest;
		int n;
		int i;
		int j;
		double average;
		double sum;
		double[] x = new double[200];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;

		counttest = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (counttest -- != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			average = 0;
			sum = 0;

			p = x;

			for (i = 0; i < n; i++)
			{
				*p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				average += *p / n;
				p++;
			}

			p = x;

			for (i = 0; i < n; i++)
			{
				sum += (*p - average) * (*p - average);
				p++;
			}

			sum = Math.sqrt(sum / n);

			System.out.printf("%.5f", sum);
			System.out.printf("%.5f", "\n");
		}

	}
}

