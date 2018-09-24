package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int t;
		for (int i = 0;i <= (int)(0.5 * (n + 1)) - 1;i++)
		{
			t = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = t;

		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			if (i != n - 1)
			{
				System.out.print(" ");
			}

		}
		System.out.print("\n");
		return 0;
	}
}

