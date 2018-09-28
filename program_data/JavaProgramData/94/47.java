package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int r;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int p = 0; p < n - 1;p++)
		{
			for (int q = n - 1;q > p;q--)
			{
				if (a[q] < a[q - 1])
				{
					t = a[q];
					a[q] = a[q - 1];
					a[q - 1] = t;
				}
			}
		}

	if (a[0] % 2 != 0)
	{
			System.out.print(a[0]);
	}
		for (int j = 1;j <= n - 1;j++)
		{
			if (a[j] % 2 != 0)
			{
				System.out.print(",");
				System.out.print(a[j]);
			}
		}
		if (a[0] % 2 == 0)
		{
			for (int y = 1; y <= n - 1;y++)
			{
				if (a[y] % 2 != 0)
				{
					System.out.print(a[y]);
					r = y;
				}
			}
		}

				for (int m = r + 1;m <= n - 1;m++)
				{
					if (a[m] % 2 != 0)
					{
						System.out.print(",");
						System.out.print(a[m]);
					}
				}

					return 0;
	}

}

