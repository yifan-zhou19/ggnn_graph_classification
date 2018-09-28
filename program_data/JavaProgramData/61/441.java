package <missing>;

public class GlobalMembers
{
	public static int cmp(Object p1, Object p2)
	{
		return 0;
	}

	public static int[] a = new int[25];

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = a[1] = 1;
		for (int i = 2; i < 21; i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}

		int b;
		while (n -- != 0)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[b - 1]);
			System.out.print("\n");
		}


		return 0;
	}
}

