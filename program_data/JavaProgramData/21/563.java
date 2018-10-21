package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		double[] b = new double[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int begin = 0;
		double average;
		double sum = 0;
		double max;
		double counter = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		average = sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] > average)
			{
				b[i] = a[i] - average;
			}
			if (a[i] < average)
			{
				b[i] = average - a[i];
			}
		}
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				begin = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(b[i] - max) < 1e-5)
			{
				counter++;
			}
		}
		if (counter >= 2)
		{
			System.out.print(a[begin]);
			for (i = begin + 1;i < n;i++)
			{
				if (Math.abs(b[i] - max) < 1e-5)
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}
		else
		{
			System.out.print(a[begin]);
			System.out.print("\n");
		}
		return 0;
	}
}

