package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int x;
		int min;
		int max;

		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		x = 1;

		while (System.in.read() != '\n')
		{
			a[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x++;
		}

		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		x = 1;

		while (System.in.read() != '\n')
		{
			b[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x++;
		}

		min = 100000;
		max = 0;

		for (int i = 0; i <= x; i++)
		{
			if (a[i] < min)
			{
			min = a[i];
			}

			if (b[i] > max)
			{
			max = b[i];
			}
		}

		int maxcount = 0;

		for (int i = min; i <= max; i++)
		{
			int count = 0;

			for (int j = 0; j <= x; j++)
			{
				if (a[j] <= i != 0 && i < b[j])
				{
					count++;
				}

				else
				{
				continue;
				}

				if (count > maxcount)
				{
				maxcount = count;
				}

			}
		}

		System.out.print(x);
		System.out.print(" ");
		System.out.print(maxcount);

		return 0;
	}
}

