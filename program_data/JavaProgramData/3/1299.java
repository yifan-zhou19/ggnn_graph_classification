package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int i = 1;
		int j = 0;
		int b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] a = new int[1000];

		for (i = 1; i <= n; ++i)
		{
			a[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0; i <= (n - 2); i++)
		{
			for (j = i + 1; j <= (n - 1); j++)
			{
				if (k == a[i] + a[j])
				{
					b = 1;
				}
			}
		}

		if (b == 1)
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		else
		{
			System.out.print("no");
			System.out.print("\n");
		}

		return 0;
	}
}

