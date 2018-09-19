package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double sum = 0;
		double ave;
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i;
		double[] b = new double[n];
		double x = 0;
		double y = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - ave);
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max && x == 0)
			{
				x = a[i];
			}
			if (b[i] == max && x != 0)
			{
				y = a[i];
			}
		}

		if (x > y)
		{
			System.out.print(y);
			System.out.print(",");
			System.out.print(x);
		}
		if (x < y)
		{
			System.out.print(x);
			System.out.print(",");
			System.out.print(y);
		}
		if (x == y)
		{
			System.out.print(x);
		}
		return 0;
	}

}

