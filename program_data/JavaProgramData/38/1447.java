package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < num; i++)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] a = new double[1001];
			double sum = 0;
			double ave;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			for (p = a; p < a + n; p++)
			{
				*p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum = sum + *p;
			}
			ave = sum / n;
			double summ = 0;
			for (p = a; p < a + n; p++)
			{
				summ = summ + (*p - ave) * (*p - ave);
			}
			summ = summ / n;
			summ = Math.sqrt(summ);
			System.out.printf("%.5lf\n", summ);
		}
		return 0;
	}
}

