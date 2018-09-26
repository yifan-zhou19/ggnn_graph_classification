package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double[] x = new double[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			double sum1 = 0;
			double aver;
			double sum2 = 0;
			double result;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (p = x;p < x + n;p++)
			{
				*p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum1 += *p;
			}
			aver = sum1 / n;
			for (p = x;p < x + n;p++)
			{
				sum2 += (*p - aver) * (*p - aver);
			}
			result = Math.sqrt(sum2 / n);
			System.out.printf("%.5f", result);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

