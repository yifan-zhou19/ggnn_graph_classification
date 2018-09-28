package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int total;
		int valid;
		float x;
		float y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		total = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		valid = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = (float)valid / total;
		for (int i = 1; i <= n - 1; i++)
		{
			total = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			valid = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = (float)valid / total;
			if (y - x > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				if (y - x < -0.05F)
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

