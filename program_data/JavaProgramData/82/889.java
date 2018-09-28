package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  10.15 homework
	//   ????

	//  Created by airjcy on 10/8/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//



	public static void Main(String[] args)
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int lowPressure;
		int highPressure;
		int maxContinueNormalHours = 0;
		int continueNormalHours = 0;
		for (i = 0; i < n; i++)
		{
			highPressure = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			lowPressure = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((highPressure >= 90) && (highPressure <= 140) && (lowPressure >= 60) && (lowPressure <= 90))
			{
				continueNormalHours++;
				if (continueNormalHours > maxContinueNormalHours)
				{
					maxContinueNormalHours = continueNormalHours;
				}
			}
			else
			{
				continueNormalHours = 0;
			}
		}
		System.out.print(maxContinueNormalHours);
	}
}

