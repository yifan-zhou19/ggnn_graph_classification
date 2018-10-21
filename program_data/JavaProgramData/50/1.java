package <missing>;

public class GlobalMembers
{
	public static int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int total = 0;
		int s = 0;
		if ((5 - n) >= 0)
		{
			s = 5 - n;
		}
		else
		{
			s = 12 - n;
		}
		for (int i = 0;i < 12;i++)
		{
			total += mon[i];
			total += 13;
			if ((total - 1) % 7 == s)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			total -= 13;
		}
		return 0;
	}

}

