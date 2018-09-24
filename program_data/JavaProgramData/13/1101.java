package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bitset < 101> b;
		for (int i = 0; i < n; i++)
		{
			int x;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (!b.test(x))
			{
				if (i != 0)
				{
					System.out.print(' ');
				}
				System.out.print(x);
				b.set(x);
			}
		}
		return 0;
	}

}

