package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10000];
		double sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		double aver;
		aver = sum / n;
		int max = a[0];
		int min = a[0];
		for (i = 1; i < n; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		if (Math.abs((max - aver) - (aver - min)) < 1e-6)
		{
			System.out.print(min);
			System.out.print(",");
			System.out.print(max);
		}
		else if ((max - aver) > (aver - min))
		{
			System.out.print(max);
		}
		else
		{
			System.out.print(min);
		}

		return 0;
	}

}

