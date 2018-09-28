import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * longwords.cpp
	 *
	 *  Created on: 2013-11-4
	 *      Author: dyx
	 */
	public static int Main()
	{
		String words = new String(new char[100]);
		words = new Scanner(System.in).nextLine();

		int i;
		int j = 0;
		for (i = 0;words.charAt(i) != '\0';i++)
		{
			if (words.charAt(i) == ' ')
			{
				if (j == 1)
				{
					continue;
				}
				if (j == 0)
				{
					j++;
				}
			}
			if (words.charAt(i) != ' ')
			{
				j = 0;
			}
			System.out.print(words.charAt(i));
		}


	}

}
