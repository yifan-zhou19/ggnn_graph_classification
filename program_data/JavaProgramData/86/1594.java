package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int n;
		int m;
		int k;
		int c;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = 0;
			while (n-- != 0)
			{
				k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (c + k < 60)
				{
					if (c + k + 3 < 60)
					{
						c += 3;
					}
					else
					{
						c = 60 - k;
					}
				}
			}
			System.out.print(60 - c);
			System.out.print("\n");
			System.out.print("\n");
		}
		return 0;
	}
}

