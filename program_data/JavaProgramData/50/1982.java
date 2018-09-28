package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int r;
		int day;
		day = 12;
		for (i = 0; i < 12; i++)
		{
			day = day + mon[i];
			r = day % 7;
			if (r + w == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			if ((r + w > 7) && (r + w - 7 == 5))
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

