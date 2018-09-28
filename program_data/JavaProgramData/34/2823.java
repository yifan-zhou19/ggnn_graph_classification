package <missing>;

public class GlobalMembers
{
	/*
	 * qimo_3.cpp
	 *
	 *  Created on: 2010-12-17
	 *      Author: 10265
	 */
	public static int Main()
	{
		int result;
		result = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (result != 1)
		{
			if (result == 1)
			{
				break;
			}
			if (result % 2 == 0)
			{
				if (result == 1)
				{
					break;
				}
				System.out.print(result);
				System.out.print("/2=");
				System.out.print(result / 2);
				System.out.print("\n");
				result = result / 2;
			}
			if (result % 2 == 1)
			{
				if (result == 1)
				{
					break;
				}
				System.out.print(result);
				System.out.print("*3+1=");
				System.out.print(result * 3 + 1);
				System.out.print("\n");
				result = result * 3 + 1;
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;

	}
}

