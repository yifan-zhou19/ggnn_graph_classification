package <missing>;

public class GlobalMembers
{
	public static int p(int m)
	{
		if (m == 1)
		{
			return 1;
		}
		else if (m == 2)
		{
			return 1;
		}
		else
		{
			return p(m - 1) + p(m - 2);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(p(a[i]));
			System.out.print("\n");
		}
	return 0;
	}

}

