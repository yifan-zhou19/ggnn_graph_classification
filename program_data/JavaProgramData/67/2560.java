package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double all0; //?????????????????
		double p0;
		double x;
		all0 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		p0 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = 100 * p0 / all0; //????????
		for (int i = 1;i <= n - 1;i++) //?n-1??????
		{
			double all; //???????????????
			double p;
			all = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double y;
			y = 100 * p / all; //??????
			if (y - x > 5)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (x - y > 5)
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

