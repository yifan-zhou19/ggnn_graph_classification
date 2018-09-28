package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2011-12-23
	 *      Author: ???
	 */

	public static void check(int sample,int cure,int sample1,int cure1)
	{
		if (cure * 1.00 / sample - cure1 * 1.00 / sample1 > 0.05)
		{
			System.out.print("worse");
			System.out.print("\n");
		}
		else if (cure1 * 1.00 / sample1 - cure * 1.00 / sample > 0.05)
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
	public static int Main()
	{
		int n;
		int sample;
		int cure;
		int sample1;
		int cure1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sample = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cure = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 1;n--)
		{
			sample1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cure1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			check(sample, cure, sample1, cure1);
		}
		return 0;
	}

}

