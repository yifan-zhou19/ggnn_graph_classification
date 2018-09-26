package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int fact(int b)
	{
		if (b == 1)
		{
			a[1] = 1;
			return a[1];
		}
		else if (b == 2)
		{
			a[2] = 1;
			return a[2];
		}
		else
		{
			a[b] = fact(b - 1) + fact(b - 2);
			return a[b];
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			int p;
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fact(p));
			System.out.print("\n");
		}
		return 0;
	}

}

