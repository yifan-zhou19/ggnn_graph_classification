package <missing>;

public class GlobalMembers
{
	/*???2011-12-30
	 *??????
	 *????09.cpp
	 *????? - ??(4-9) ?????
	 */


	public static int Main()
	{
		int n = 0;
		double total = 0;
		double valid = 0;
		double cocktail = 0.0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		total = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		valid = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		cocktail = valid / total;
		for (int temp = 1; temp < n; temp++)
		{
			total = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			valid = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if ((valid / total) > cocktail + 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((valid / total) < cocktail - 0.05)
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

