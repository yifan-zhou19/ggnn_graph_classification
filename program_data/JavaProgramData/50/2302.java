package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  hw
	//
	//  Created by ? ? on 12-12-16.
	//  Copyright (c) 2012? ? ?. All rights reserved.
	//

	public static int D(int month)
	{
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			return 30;
		}
		if (month == 2)
		{
			return 28;
		}
	}

	public static void Main(String[] args)
	{
		int[] x = {5, 4, 3, 2, 1, 0, 6};
		int w;
		int month = 1;
		int days = 13;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (month <= 12)
		{
			int y = days % 7;
			if (y == x[w - 1])
			{
				System.out.print(month);
				System.out.print("\n");
			}
			days += D(month);
			month++;
		}
	}


}

