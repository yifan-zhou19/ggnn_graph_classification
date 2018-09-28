package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0; t < k; t++)
		{
			int i;
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] x = new double[101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			double sum = 0;
			double ave;
			double ts = 0;
			p = x;
			for (i = 0; i < n; i++)
			{
				*p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum += *p;
				p++;
			}
			ave = sum / n;
			p = x;
			for (i = 0; i < n; i++)
			{
				ts += (*p - ave) * (*p - ave);
				p++;
			}
			double e;
			e = Math.sqrt(ts / n);
			System.out.printf("%.5f", e);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

