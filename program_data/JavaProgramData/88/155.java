package <missing>;

public class GlobalMembers
{
	/*
	 * 12-4.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: wuch
	 */

	public static int Main()
	{
		String s = new String(new char[30]);
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		i = 0;
		j = 1;
		for (i = 0;i < 30;i++)
		{
			if ('0' <= s.charAt(i) && '9' >= s.charAt(i))
			{
				break;
			}
		}
		while (*(s.Substring(i)))
		{
			if ('0' <= *(s.Substring(i)) && '9' >= *(s.Substring(i)))
			{
				if (j == 1)
				{
					System.out.print((s.Substring(i)));
				}
				else
				{

					 System.out.print("\n");
					 System.out.print((s.Substring(i)));

				}
				j = 1;
			}
			else
			{
				j = 0;
			}
			i++;
		}
		return 0;
	}

}
