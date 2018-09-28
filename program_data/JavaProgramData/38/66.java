package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int u = 0;u < k;u++)
		{
			int n = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			double[] a = new double[110];
			double[] p = a;
			double x = 0;
			for (p;p < a + n;p++)
			{
				p[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				x += (p[0] / n);
			}
			System.in.read();
			double sum = 0;
			for (p = a;p < a + n;p++)
			{
				sum += Math.pow((p[0] - x),2);
			}
			double s = Math.sqrt(sum / n);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}
}

