package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[2 * n + 1 - i] = a[i];
		}
		for (i = 1;i < n;i++)
		{
			System.out.print(a[n + i]);
			System.out.print(" ");
		}
		System.out.print(a[2 * n]);
		System.out.print("\n");
		return 0;
	}
}

