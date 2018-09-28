package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int aWinCount = 0;
		int bWinCount = 0;
		for (int i = 0; i < num; i++)
		{
			int a;
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0)
			{
				if (b == 1)
				{
					aWinCount++;
				}
				else if (b == 2)
				{
					bWinCount++;
				}
			}
			if (a == 1)
			{
				if (b == 0)
				{
					bWinCount++;
				}
				else if (b == 2)
				{
					aWinCount++;
				}
			}
			if (a == 2)
			{
				if (b == 1)
				{
					bWinCount++;
				}
				else if (b == 0)
				{
					aWinCount++;
				}
			}
		}
		if (aWinCount == bWinCount)
		{
			System.out.print("Tie");
			System.out.print("\n");
		}
		else if (aWinCount > bWinCount)
		{
			System.out.print("A");
			System.out.print("\n");
		}
		else
		{
			System.out.print("B");
			System.out.print("\n");
		}
	}


}

