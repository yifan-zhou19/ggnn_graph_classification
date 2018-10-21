import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-23
	 *      Author: 12066
	 */

	public static String a = new String(new char[200]);
	public static int x = 0;
	public static int y = 0;
	public static void find(int min) //??????
	{
		if (min > 0)
		{
			int p = -1;
			for (int i = 0; i < a.length(); i++)
			{
				if (a.charAt(i) == ')' && p >= 0) //??????????????
				{
					a = tangible.StringFunctions.changeCharacter(a, p, 'a');
					a = tangible.StringFunctions.changeCharacter(a, i, 'b');
					break;
				}
				else if (a.charAt(i) == '(')
				{
					p = i;
				}
			}
			find(min - 1); //????
		}
	}
	public static void change() //????????
	{
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '$');
			}
			else if (a.charAt(i) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '?');
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
		}
	}
	public static void qingling() //??
	{
		for (int i = 0; i < a.length(); i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
	}
	public static int Main()
	{
		while (a = new Scanner(System.in).nextLine())
		{
		System.out.print(a);
		System.out.print("\n");
		for (int i = 0; i < a.length(); i++) //??????????
		{
			if (a.charAt(i) == '(')
			{
				x++;
			}
			if (a.charAt(i) == ')')
			{
				y++;
			}
		}
		int min = 0;
		if (x < y)
		{
			min = x;
		}
		else
		{
			min = y;
		}
		find(min); //??
		change(); //???
		System.out.print(a);
		System.out.print("\n");
		qingling();
		x = 0;
		y = 0;
		}
		return 0;
	}
}

