package <missing>;

public class GlobalMembers
{
	/*
	 * jiweijiuliaofa.cpp
	 *
	 *  Created on: 2012-10-17
	 *      Author: ada
	 */
	public static int Main()
	{
		int n; // n???
		double a; // a??? ?b?????
		double b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double x; //x??????????
		double y;
		(double)(x = b / a);
		for (int i = 0 ; i < n - 1 ; i++) //??????????????~
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			(double)(y = b / a);
			if (y > x)
			{
				if (y - x > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
			else if (x - y > 0.05)
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

