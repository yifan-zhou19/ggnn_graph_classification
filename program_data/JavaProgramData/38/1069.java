package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[1001];
		double sum1 = 0;
		double sum2 = 0;
		double avr = 0;
		double s;
		double[] p = a;
		int n;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < n;i++)
			{
				p[i] = ConsoleInput.readToWhiteSpace(true);
			}
			for (int j = 0;j < n;j++)
			{
				sum1 += p[j];
			}
			avr = sum1 / n;
			for (int k = 0;k < n;k++)
			{
				sum2 += (p[k] - avr) * (p[k] - avr);
			}
			s = Math.sqrt(sum2 / n);
			System.out.printf("%.5f\n",s);
			sum1 = sum2 = 0;
		}
		//while(1);
		return 0;
	}
}

