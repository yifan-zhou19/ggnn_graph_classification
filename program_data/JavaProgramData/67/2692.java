package <missing>;

public class GlobalMembers
{
	/**
	 *@file   7.cpp
	 *@author ??
	 *@date   2013-10-6
	 *@description
	 *??????2??????
	 */
	public static int Main()
	{
		double n;
		double sum;
		double effectivenum;
		double rate1;
		double rate2;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		effectivenum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		rate1 = effectivenum / sum;
		for (int i = 2; i <= n; i++)
		{
			sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			effectivenum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			rate2 = effectivenum / sum;
			if (rate1 - rate2 > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (rate1 - rate2 <= 0.05 && rate2 - rate1 <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
			else if (rate2 - rate1 > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

