package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012889_1.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: ???
	 *        ??? ?????
	 */



	public static int Main()
	{
		int n;
		int i;
		double a;
		double max = 0;
		double min = 0;
		double sum = 0;
		double ave = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += a;
			if (i == 0)
			{
				max = a;
				min = a;
			}
			else
			{
				if (a > max)
				{
					max = a;
				}
				else if (a < min)
				{
					min = a;
				}
			}
		}
		ave = sum / n;
		if (max - ave > ave - min)
		{
			System.out.print(max);
			System.out.print("\n");
		}
		else if (max - ave < ave - min)
		{
			System.out.print(min);
			System.out.print("\n");
		}
		else
		{
			System.out.print(min);
			System.out.print(',');
			System.out.print(max);
			System.out.print("\n");
		}
		return 0;
	}

}

