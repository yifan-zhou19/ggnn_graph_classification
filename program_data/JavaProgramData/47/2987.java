package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] a = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] b = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			b[i] = a[n - i - 1];
		}
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.print(b[i]);
			if (i < n - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

