package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		System.out.print(a[n - 1]);
		for (i = n - 2; i >= 0; i--)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}

		System.out.print("\n");

		return 0;
	}
}

