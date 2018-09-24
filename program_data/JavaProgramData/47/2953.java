package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] p = a;
		for (int i = n - 1;i >= 1;i--)
		{
			System.out.print((p + i));
			System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}
}

