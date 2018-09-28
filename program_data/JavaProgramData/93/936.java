package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ??3?5?7????
	//
	//  Created by ? ?? on 12-9-26.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//

	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (m % 3 == 0)
		{
			System.out.print(3);
		}
		if (m % 5 == 0 && m % 3 == 0)
		{
			System.out.print(" ");
			System.out.print(5);
		}
		else if (m % 5 == 0 && m % 3 != 0)
		{
			System.out.print(5);
		}
		if (m % 7 == 0)
		{
			if (m % 5 != 0 && m % 3 != 0)
			{
				System.out.print(7);

			}
			else
			{
				System.out.print(" ");
				System.out.print(7);
			}
		}

		if (m % 3 != 0 && m % 5 != 0 && m % 7 != 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

