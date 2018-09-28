package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n; //????n?? i????  x,y??? a,b??
		double i;
		double x;
		double y;
		double a;
		double b;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = b / a; //???????????
		for (i = 1;i <= n - 1;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = b / a; //???????
			if (x - y > 0.05) //????????????
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (Math.abs(x - y) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
			else if (y - x > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

