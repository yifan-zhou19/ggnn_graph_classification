package <missing>;

public class GlobalMembers
{
	public static double average(double[] a, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double sum1 = 0;
		double sum2 = 0;
		double average1;
		double average2;
		for (p = a;p < a + n;p++)
		{
			sum1 = sum1 + *p;
		}
		average1 = sum1 / n;
		for (p = a;p < a + n;p++)
		{
			sum2 = sum2 + (*p - average1) * (*p - average1);
		}
		average2 = sum2 / n;
		return (Math.sqrt(average2));
	}
	public static int Main()
	{
		int n;
		int m;
		double[] a = new double[100];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.printf("%.5f\n", average(a, m));
		}
		return 0;
	}
}

