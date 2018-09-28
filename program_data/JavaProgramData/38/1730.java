package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double[] x = new double[1000];
		double a;
		double s;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = 0;
			s = 0;
			for (int i = 0;i < n;i++)
			{
				x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				a = a + x[i];
			}
			a = a / n;
			for (int i = 0;i < n;i++)
			{
				s = s + (x[i] - a) * (x[i] - a);
			}
			s = s / n;
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}
}

