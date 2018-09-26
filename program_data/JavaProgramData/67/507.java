package <missing>;

public class GlobalMembers
{
	/*
	 * file    practice 1_6
	 * author  ??
	 * date    2010-11-12
	 * description
	           ????????????
	*/



	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		float a0;
		float a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a0 = x / 1.0 / y;
		for (i = 1; i <= n - 1; i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = x / 1.0 / y;
			if (a - a0 > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				if (a - a0 < -0.05F)
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

