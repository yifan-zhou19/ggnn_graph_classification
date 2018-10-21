package <missing>;

public class GlobalMembers
{
	//***********************************************************
	//??????
	//????????
	//***********************************************************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		double x;
		double y;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = b / a;
		for (int i = 2;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = b / a;
			if ((y - x) > 0.05 && (!(Math.abs(y - x - 0.05) < 1e-8)))
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (x - y > 0.05 && (!(Math.abs(x - y - 0.05) < 1e-8)))
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

