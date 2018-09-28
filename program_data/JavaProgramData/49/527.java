import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-19
	 *      Author: 1100012870
	 */
	public static String s = new String(new char[501]);

	public static void print(int x,int y) //??????s???x??y?????
	{
		int i;
		for (i = x;i <= y;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.print("\n");
	}

	public static int check(int x,int y) //?????????????
	{
		while (x < y && s.charAt(x) == s.charAt(y))
		{ //????????????
			x++;
			y--;
		}
		if (x >= y)
		{
			return 1;
		}
		return 0;
	}

	public static int Main()
	{
		int i;
		int j;
		int l;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 1;i <= l;i++) //????2???????
		{
			for (j = 0;j < l;j++)
			{
				if (j + i < l && check(j, j + i) == 1)
				{
					print(j, j + i);
				}
			}
		}
		return 0;
	}

}
