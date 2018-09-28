package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 0;
		int count = 0;
		while (n-- != 0)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
			{
				count++;
				m = Math.max(m,count);
			}
			else
			{
				count = 0;
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}

