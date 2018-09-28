package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int total = 0;
		for (int i = 0; i < n; i++)
		{
			int a;
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b == (a + 1) % 3)
			{
				total += 1;
			}
			else if (a == (b + 1) % 3)
			{
				total -= 1;
			}
		}
		if (total > 0)
		{
			System.out.print("A");
			System.out.print("\n");
		}
		else if (total < 0)
		{
			System.out.print("B");
			System.out.print("\n");
		}
		else
		{
			System.out.print("Tie");
			System.out.print("\n");
		}
		return 0;
	}
}

