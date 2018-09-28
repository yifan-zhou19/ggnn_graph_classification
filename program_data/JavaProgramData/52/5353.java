package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[n - m]);
		for (int i = n - m + 1; i < 2 * n - m; i++)
		{
			System.out.print(' ');
			System.out.print(a[i % n]);
		}
		System.out.print("\n");
		return 0;
	}

}

