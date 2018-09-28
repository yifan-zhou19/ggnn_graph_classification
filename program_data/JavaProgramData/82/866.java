package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int x = 0;
		int y = 0;
		int sum = 0;
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
			{
				sum++;
			}
			else
			{
				sum = 0;
			}
			if (sum > max)
			{
				max = sum;
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

