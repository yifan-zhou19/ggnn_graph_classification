package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		double[] data = new double[101];
		double average;
		double s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= k; i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			average = 0;
			s = 0;
			p = data;
			for (p = data; p < data + n; p++)
			{
				*p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				average += *p;
			}
			average = average / n;
			p = data;
			for (p = data; p < data + n; p++)
			{
				s += (*p - average) * (*p - average);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

