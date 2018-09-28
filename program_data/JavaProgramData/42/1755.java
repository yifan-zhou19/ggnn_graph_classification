package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i + t < n ; i++)
		{
			a[i] = a[i + t];
				if (a[i + t] == m)
				{
					t++;
					a[i] = a[i + t];
					i--;
				}
		}
		for (int i = n - t ; i < n ; i++)
		{
				if (m == 0)
				{
					a[i] = 1;
				}
				else
				{
					a[i] = 0;
				}
		}
		for (int i = 0 ; i + t < n ; i++)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}

		System.out.print("\n");
		return 0;
	}

}

