package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[10000];
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		i = n - m;
		for (i = n - m;i < n;i++)
		{
				System.out.print(a[i]);
				System.out.print(" ");
		}
		i = 0;
		for (i = 0;i < n - m - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		if (i = n - m - 1)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

