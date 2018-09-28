package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[100];
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 1; i < n - i + 1; i++)
		{
			int temp = a[n - i + 1];
			a[n - i + 1] = (a + i);
			a[i] = temp;
		}
		for (int i = 1; i < n; i++)
		{
			System.out.print((a + i));
			System.out.print(' ');
		}
		System.out.print((a + n));
		System.out.print("\n");
		return 0;
	}

}

