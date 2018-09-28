package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num;
		int i;
		int j;
		double[] arr = new double[105];
		double sum;
		double s;
		double a;
		double[] p = arr;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			sum = 0;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < num;j++)
			{
				p[j] = ConsoleInput.readToWhiteSpace(true);
				sum += p[j];
			}
			a = sum / num;
			sum = 0;
			for (j = 0;j < num;j++)
			{
				sum += (p[j] - a) * (p[j] - a);
			}
			s = Math.sqrt(sum / num);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}

}

