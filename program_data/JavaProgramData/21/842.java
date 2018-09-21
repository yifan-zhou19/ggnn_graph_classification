package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[301];
		int n;
		double sum = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{

			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];

		}
		double aver = sum / n;

		double[] b = new double[301];
		double max = 0.0;
		for (i = 1;i <= n;i++)
		{
			if (a[i] > aver)
			{
				b[i] = a[i] - aver;
			}
			else
			{
				b[i] = aver - a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		int num = 0;

		double[] c = new double[301];

		for (i = 1;i <= n;i++)
		{
			if (b[i] == max)
			{
				num++;
				c[num] = a[i];
			}

		}
		for (i = 1;i < num;i++)
		{
			System.out.print(c[i]);
			System.out.print(",");
		}
		if (i == num)
		{
			System.out.print(c[i]);
		}
		return 0;


	}

}

