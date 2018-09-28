package <missing>;

public class GlobalMembers
{
	/*
	 * yi.cpp
	 *
	 *  Created on: 2012-10-20
	 *      Author: 7
	 */
	public static int Main()
	{
		String s = new String(new char[500]);
		int[] left = new int[500];
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		int i = 0;
		int k = 0;
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == s.charAt(0))
			{
				left[k] = i;
				k++;
			}
			else
			{
				k--;
				System.out.print(left[k]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}
	}

}

