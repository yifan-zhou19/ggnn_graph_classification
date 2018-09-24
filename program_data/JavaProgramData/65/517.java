package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a = 0;
		int b = 0;
		for (int i = 0;i < n;i++)
		{
			int a1;
			int b1;
			a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a1 == 0)
			{
				if (b1 == 1)
				{
					a++;
				}
				if (b1 == 2)
				{
					b++;
				}
			}
			else if (a1 == 1)
			{
				if (b1 == 2)
				{
					a++;
				}
				if (b1 == 0)
				{
					b++;
				}
			}
			else
			{
				if (b1 == 0)
				{
					a++;
				}
				if (b1 == 1)
				{
					b++;
				}
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		System.out.print("\n");
		return 0;
	}

}

