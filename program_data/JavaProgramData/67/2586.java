package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int testnum;
		int successnum;
		float x = 0F;
		float y = 0F;

		for (int i = 1; i <= n; i++)
		{
			testnum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			successnum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 1)
			{
				x = 100.0 * successnum / testnum;
			}
			if (i >= 2)
			{
				y = 100.0 * successnum / testnum;
				if ((int)(y - x) >= 5)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else if ((int)(x - y) >= 5)
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
			y = 0F;
		}

		return 0;
	}
}

