import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 12-4.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: sony
	 */

	public static int Main()
	{
		String input = new String(new char[35]);
		input = new Scanner(System.in).nextLine();
		int i;
		int j;
		int len = input.length();
		for (i = 0; i < len; i++)
		{
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9')
			{
				System.out.print(input.charAt(i));
				for (j = i + 1; ; j++)
				{
					if (input.charAt(j) >= '0' && input.charAt(j) <= '9')
					{
						System.out.print(input.charAt(j));
					}
					else
					{
						System.out.print("\n");
						break;
					}

				}
				i = j;
			}
		}
		return 0;
	}

}
