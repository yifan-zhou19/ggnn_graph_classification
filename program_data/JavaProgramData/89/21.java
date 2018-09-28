package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int Main()
	{
		int n;
		int p;
		int q;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
		}
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (p != 0 || q != 0)
		{
			a[p]++;
			b[q]++;
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}
		}
				System.out.print("NOT FOUND");
				System.out.print("\n");
				return 0;

	}
}

