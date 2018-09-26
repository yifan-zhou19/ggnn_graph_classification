package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = n - 1; i >= 0; i--)
		{
			a[i + m] = (a + i);
		}
		for (i = n, j = 0; i < n + m, j < m; i++, j++)
		{
			a[j] = (a + i);
		}
		for (i = 0; i < n - 1; i++)
		{
			System.out.print((a + i));
			System.out.print(" ");
		}
			System.out.print((a + n - 1));
			System.out.print("\n");

		return 0;
	}

}

