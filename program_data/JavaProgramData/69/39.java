import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-11-21
	 *      Author: 7
	 */
	public static String c = new String(new char[300]);
	public static void change(String a, String b, int la, int lb)
	{
		int sig = 1;
		c = tangible.StringFunctions.changeCharacter(c, la, a[la - 1]);
		if (lb > 0)
		{
				c = tangible.StringFunctions.changeCharacter(c, la, a[la - 1] + b[lb - 1] - '0');
		}
		if (c.charAt(la) > '9')
		{
			c = tangible.StringFunctions.changeCharacter(c, la, c.charAt(la) - 10);
			if (la > 1)
			{
			a[la - 2] += 1;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, 0, '1');
			}
		}
		if (la > 1)
		{
		change(a, b, la - 1, lb - 1);
		}
		else
		{
			for (int i = 0;i < (int)c.length();i++)
			{
				if (sig != 0 && c.charAt(i) == '0')
				{
						continue;
				}
				else
				{
					System.out.print(c.charAt(i));
					sig = 0;
				}
			}
			if (sig != 0)
			{
				System.out.print(0);
			}
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,'\0',(Character.SIZE / Byte.SIZE));
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		if (a.length() > b.length())
		{
			change(a, b, a.length(), b.length());
		}
		else
		{
			change(b, a, b.length(), a.length());
		}
	}

}

