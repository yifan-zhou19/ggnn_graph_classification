package <missing>;

public class GlobalMembers
{
	/*
	 * 04.cpp
	 *
	 *  Created on: 2014-1-4
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int i;
		int k = 0;
		int s;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		s = a.length();
		for (i = 0;i < s;i++)
		{
			if (a.charAt(i) - '0' >= 0 && '9' - a.charAt(i) >= 0)
			{
				System.out.print(a.charAt(i));
				k = 1;
			}
			else
			{
				if (k == 1)
				{
					System.out.print("\n");
					k = 0;
				}
			}
		}
		return 0;
	}

}
