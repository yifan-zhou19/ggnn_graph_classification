package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n;
		int m;
		int k;
		int t;
		int count;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while ((n != 0) && (m != 0))
		{
			for (k = 1; k <= n; k++)
			{
				a[k] = 1;
			}

			k = 0;
			t = 0;
			count = 0;

			while (count < n)
			{
				k++;
				if (k == n + 1)
				{
					k = 1;
				}
				if (a[k] != 0)
				{
					t++;
					if (t == m)
					{
						a[k] = 0;
						t = 0;
						count++;
					}
				}
			}

			System.out.print(k);
			System.out.print("\n");

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return 0;
	}

}

