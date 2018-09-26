package <missing>;

public class GlobalMembers
{
	public static int function(int[] a, int n)
	{
		if (n != 1)
		{
		function(a + 1, n - 1);
		}
		System.out.print(a[0]);
		System.out.print(' ');
		return 0;
	}

	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		function(a + 1, n - 1);
		System.out.print(a[0]);
		return 0;
	}
}

