import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 11.282.3.cpp
	 *
	 *  Created on: 2012-11-25
	 *      Author: Administrator
	 */
	public static String str1 = new String(new char[270]);
	public static String str2 = new String(new char[270]);
	public static String str3 = new String(new char[270]);
	public static void huanwei(String x, int y) //??????????
	{
		int i;
		int j;
		char t;
		for (i = 0,j = y - 1;i < j;i++,j--)
		{
			t = x[i];
			x[i] = x[j];
			x[j] = t;
		}

	}
	public static int Main()
	{
		int t;
		int g = 0;
		int m;
		int r = 0;
		int i;
		int len1;
		int len2;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		str1 = tangible.StringFunctions.changeCharacter(str1, len1, '0');
		str1 = tangible.StringFunctions.changeCharacter(str1, len1 + 1, '\0');
		str2 = tangible.StringFunctions.changeCharacter(str2, len2, '0');
		str2 = tangible.StringFunctions.changeCharacter(str2, len2 + 1, '\0'); //????????0.
		huanwei(str1, len1);
		huanwei(str2, len2);
		if (len2 > len1) //????1??2????
		{
			str3 = str1;
			str1 = str2;
			str2 = str3;
			t = len1;
			len1 = len2;
			len2 = t;

		}

		for (i = 0;i <= len2;i++)
		{
			m = str1.charAt(i) + str2.charAt(i) + g - 96; //????
			if (m >= 10)
			{
				m = m % 10;
				str1 = tangible.StringFunctions.changeCharacter(str1, i, m + 48);
				g = 1;
			}
			else
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, m + 48);
				g = 0;
			}
		}

		for (i = len2 + 1;i <= len1;i++) //?2?????????????
		{
			if (str1.charAt(i) + g == 58)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, 48);
				g = 1;
			}
			else if (str1.charAt(i) + g != 58 && g == 1)
			{
				str1.charAt(i)++;
				g = 0;
			}
		}
		for (i = len1;i >= 0;i--)
		{
			if (str1.charAt(i) == 48) //???????0.
			{
				r++;
			}
			else
			{
				break;
			}
		}
		if (r <= len1)
		{
		for (i = len1 - r;i >= 0;i--)
		{
			System.out.print(str1.charAt(i));
		}

		}
		else
		{
			System.out.print("0");
		}
		return 0;
	}

}

