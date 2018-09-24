package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			a[k] = ConsoleInput.readToWhiteSpace(true);
		}
		System.out.print((a + n - 1));
		for (k = n - 2;k >= 0;k--)
		{
			System.out.print(" ");
			System.out.print((a + k));
		}
		System.out.print("\n");
		return 0;
	}
}

