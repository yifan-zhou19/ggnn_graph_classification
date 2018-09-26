package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int x = 1;
		int y = 1;
		int m = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < n;j++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x = 1;
			y = 1;
			if ((a == 1) || (a == 2))
			{
				System.out.print(1);
				System.out.print("\n");
			}
			if (a > 2)
			{
				for (i = 1;i <= (a - 2);i++)
				{
					m = x + y;
					x = y;
					y = m;
				}
				System.out.print(m);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

