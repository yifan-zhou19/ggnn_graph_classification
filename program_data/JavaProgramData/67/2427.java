package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2012-10-23
	 *      Author: ???
	 *
	 */
	public static int Main()
	{
		double a;
		double b;
		double rate1;
		double rate2;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		rate1 = b / a;
		for (int i = 0;i < n - 1;i++)
		{
			double c;
			double d;
			 c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 d = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 rate2 = d / c;
			 if (rate1 - rate2 <= 0.05 && rate2 - rate1 <= 0.05)
			 {
				 System.out.print("same");
				 System.out.print("\n");
			 }
			 else if (rate1 - rate2 > 0.05)
			 {
				 System.out.print("worse");
				 System.out.print("\n");
			 }
			 else
			 {
				 System.out.print("better");
				 System.out.print("\n");
			 }
		}
		return 0;
	}


}

