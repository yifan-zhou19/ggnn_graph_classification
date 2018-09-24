package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int yue;
		int sum = 0;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (yue = 1; yue <= 12; yue++)
		{
			if (yue == 2)
			{
				sum = sum + 31;
			}
			if (yue == 3)
			{
				sum = sum + 28;
			}
			if (yue == 5 || yue == 7)
			{
				sum = sum + 30;
			}
			if (yue == 8)
			{
				sum = sum + 31;
			}
			if (yue == 10 || yue == 12)
			{
				sum = sum + 30;
			}
			if (yue == 4 || yue == 6 || yue == 9 || yue == 11)
			{
				sum = sum + 31;
			}
			if (((sum + 13) % 7 + w) % 7 == 6)
			{
				System.out.print(yue);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

