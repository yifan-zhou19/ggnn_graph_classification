package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[201];
	public static void ni(int m)
	{
		if (m == 202)
		{
			return;
		}
		a[m] = a[m - 1] + a[m - 2];
		ni(m + 1);
	}
	public static int Main()
	{
		a[0] = 1;
		a[1] = 1;
		ni(2);
		int n;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[k - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

