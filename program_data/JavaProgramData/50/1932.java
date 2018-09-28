package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] days = new int[12];
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i < 12; i++)
		{
			days[i] = days[i - 1] + mon[i - 1];
		}
		for (int j = 0; j < 12; j++)
		{
			if ((days[j] + 13 - 1) % 7 + w == 5 || (days[j] + 13 - 1) % 7 + w == 12)
			{
				System.out.print(j + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

