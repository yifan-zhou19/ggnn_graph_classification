package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
		int n;
		int m;
		int i = 1;
		int t = 0;

		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (a[i] != -1)
		{
			while (a[i] > 0)
			{
				i = i + 1;
				a [i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			for (m = 1 ; m < i ; m++)
			{
				for (n = m + 1 ; n <= i ; n++)
				{
					if (a[m] == 2 * a[n] || a[n] == 2 * a[m])
					{
						t = t + 1;
					}
				}
			}

			System.out.print(t);
			System.out.print("\n");

			for (i = 0 ; i < 17 ; i++)
			{
				a[i] = 0;
			}

			t = 0;
			i = 1;

			a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return 0;
	}
}

