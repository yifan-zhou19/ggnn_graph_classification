package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		double x;
		double y;
		double a = 0;
		double b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 1;i++) //??????
		{
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a = y / x; //??????????
		}
		for (i = 2;i <= n;i++) //??????
		{
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = y / x;
			if (b - a > 0.05) //??????????
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (a - b > 0.05) //??????????
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

