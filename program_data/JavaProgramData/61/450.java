package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[100];
	public static int Main()
	{
		a[1] = 1;
		a[2] = 1;
		for (int i = 3; i <= 20; i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t;
		for (int i = 0; i < n; i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[t]);
			System.out.print("\n");
		}

	}
}

