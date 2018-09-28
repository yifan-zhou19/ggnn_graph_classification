package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		float x1;
		float y1;
		float x;
		float y;
		x1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		y1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		float t;
		t = y1 / x1;
		for (int i = 1;i <= n - 1;i++)
		{
			x = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (y / x > t + 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (y / x < t - 0.05)
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
					   return 0;
	}

}

