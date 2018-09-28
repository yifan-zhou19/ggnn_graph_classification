package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; k >= 1; k--)
		{
			int n;
			double sum = 0;
			double[] data = new double[1000 + 10];
			double[] p = data;

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0; i < n; i++)
			{
				data[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum += data[i];
			}
			double aver = sum / n;
			double dsum = 0;
			for (p = data; p < data + n; p++)
			{
				dsum += (p[0] - aver) * (p[0] - aver);
			}
			dsum /= n;
			double s = Math.sqrt(dsum);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
	}
}

