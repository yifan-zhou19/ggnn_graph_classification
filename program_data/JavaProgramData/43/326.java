package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3;i <= (a + 1) / 2;i++)
		{
			int p = 0;
			for (int k = 2;k <= i - 1;k++)
			{
				if (i % k == 0)
				{
					p = 1;
				}
			}
			for (int k = 2;k <= a - i - 1;k++)
			{
				if ((a - i) % k == 0)
				{
					p = 1;
				}
			}
			if (p == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(a - i);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

