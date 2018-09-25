package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int min = 100000;
		int max = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
			sum += a[i];
		}
		if (sum - min * n < max * n - sum)
		{
			System.out.print(max);
		}
		else if (sum - min * n > max * n - sum)
		{
			System.out.print(min);
		}
		else
		{
			System.out.print(min);
			System.out.print(',');
			System.out.print(max);
		}
		return 0;
	}

}

