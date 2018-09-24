package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[305];
		double b = 0;
		int i;
		int n;
		int j;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b += a[i];
		}
		b = b / n;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		if (b - a[0] > a[n - 1] - b)
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else if (b - a[0] < a[n - 1] - b)
		{
			System.out.print(a[n - 1]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(a[0]);
			System.out.print(",");
			System.out.print(a[n - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

