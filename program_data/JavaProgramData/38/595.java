package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num1;
		int num2;
		double[] a = new double[100];
		double[] b = new double[100];
		double sum;
		double ping;
		num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < num1;i++)
		{
			sum = 0;
			ping = 0;
			num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < num2;j++)
			{
				a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				ping += (a[j] / num2);
			}
			for (j = 0;j < num2;j++)
			{
				sum += (Math.pow((a[j] - ping),2));
			}
			b[i] = Math.sqrt(sum / num2);
		}
		for (i = 0;i < num1;i++)
		{
			System.out.printf("%.5f\n",b[i]);
		}
		return 1;
	}
}

