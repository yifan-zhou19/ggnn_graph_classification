package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int high;
		int low;
		int k = 0;
		int g = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			high = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (high <= 140 && high >= 90 && low <= 90 && low >= 60)
			{
				k++;
			}
			else
			{
				if (k > g)
				{
					g = k;
				}
				k = 0;
			}
		}
		if (k > g)
		{
			g = k;
		}
		System.out.print(g);
		System.out.print("\n");
		return 0;
	}
}

