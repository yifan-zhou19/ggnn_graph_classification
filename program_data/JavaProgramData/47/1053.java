package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] a = new int[101];
		int i = 0;
		int j = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(a[n + 1 - i]);
			System.out.print(' ');
		}
		System.out.print(a[1]);
		return 0;
	}
}

