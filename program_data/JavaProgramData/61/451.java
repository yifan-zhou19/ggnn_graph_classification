package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		while (n-- != 0)
		{
			int a = 1;
			int b = 1;
			int c;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < t - 1;i++)
			{
				c = a + b;
				a = b;
				b = c;
			}

			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}
}

