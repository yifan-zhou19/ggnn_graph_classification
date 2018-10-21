package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int time = 0;time < k;time++)
		{
			double[] a = new double[1001];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			double sum = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = a;
		for (int i = 0;i < n;i++)
		{
			*p++ = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		for (int i = 0;i < n;i++)
		{
			sum += *p++;
		}
		double aver = sum / n;
		double squ = 0;
		p = a;
		for (int i = 0;i < n;i++)
		{
		squ += ((*p++) - aver) * ((*p) - aver);
		}
		double result = Math.sqrt(squ / n * 1.0);


		System.out.printf("%.5f", result);
		System.out.printf("%.5f", "\n");

		}

	 return 0;
	}
}

