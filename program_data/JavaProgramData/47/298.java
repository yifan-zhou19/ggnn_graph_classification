package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i = 0;
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - 1;i > 0;i--)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[0]);
		System.out.print("\n");
		return 0;
	}
}

