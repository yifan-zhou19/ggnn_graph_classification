package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c = 0;
		int n;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				t = t + 1;
			}
			else
			{
				if (t > c)
				{
					c = t;
				}
					t = 0;
			}
		}
		if (t > c)
		{
			c = t;
		}
		System.out.print(c);
		System.out.print("\n");

		return 0;
	}

}

