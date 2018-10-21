package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: ???
	 */

	public static int Main()
	{
		int total; //total???????counter??????????
		int counter = 0;
		total = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (total >= 100)
		{ //???????100????100?????????100????+1
			total = total - 100;
			counter++;
		}
		System.out.print(counter);
		System.out.print("\n");
		counter = 0; //??????????
		while (total >= 50)
		{
			total = total - 50;
			counter++;
		}
		System.out.print(counter);
		System.out.print("\n");
		counter = 0;
			while (total >= 20)
			{
				total = total - 20;
				counter++;
			}
			System.out.print(counter);
			System.out.print("\n");
			counter = 0;
				while (total >= 10)
				{
					total = total - 10;
					counter++;
				}
				System.out.print(counter);
				System.out.print("\n");
				counter = 0;
					while (total >= 5)
					{
						total = total - 5;
						counter++;
					}
					System.out.print(counter);
					System.out.print("\n");
					System.out.print(total);
					System.out.print("\n");
		return 0;
	}
}

