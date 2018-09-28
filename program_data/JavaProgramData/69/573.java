import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * add large number.cpp
	 *??:?????
	 *  Created on: 2012-11-27
	 *      Author: ???
	 */


	public static String num1 = new String(new char[260]);
	public static String num2 = new String(new char[260]);
	public static String result = new String(new char[260]);
	public static int len1;
	public static int len2;
	public static void add()
	{
		if (len1 > len2)
		{
			int i = 0;
			for (i = 0;i < len2;i++)
			{
			result = tangible.StringFunctions.changeCharacter(result, len1 - i, result.charAt(len1 - i) + num1.charAt(len1 - 1 - i) + num2.charAt(len2 - 1 - i) - 48);
			if (result.charAt(len1 - i) > 57)
			{
				result = tangible.StringFunctions.changeCharacter(result, len1 - i, result.charAt(len1 - i) - 10);
				result.charAt(len1 - i - 1)++;
			}
			}
			for (i = len2;i < len1;i++)
			{
				result = tangible.StringFunctions.changeCharacter(result, len1 - i, result.charAt(len1 - i) + num1.charAt(len1 - i - 1));
				if (result.charAt(len1 - i) > 57)
				{
						result = tangible.StringFunctions.changeCharacter(result, len1 - i, result.charAt(len1 - i) - 10);
						result.charAt(len1 - i - 1)++;
				}
			}
			for (i = 0;i <= len1;i++)
			{
				if (result.charAt(i) != '0' && result.charAt(i) != '\0')
				{
					break;
				}
			}
				if (i == len1)
				{
				   System.out.print(result.charAt(1));
				}
				else
				{
			if (48 < result.charAt(i) && result.charAt(i) <= 57)
			{
							;
			}
					else
					{
				   result = tangible.StringFunctions.changeCharacter(result, i, result.charAt(i) + 48);
					}
			for (i = i;i <= len1;i++)
			{
				System.out.print(result.charAt(i));
			}
				}
		}
		else
		{
			int i = 0;
			for (i = 0;i < len1;i++)
			{
			result = tangible.StringFunctions.changeCharacter(result, len2 - i, result.charAt(len2 - i) + num1.charAt(len1 - 1 - i) + num2.charAt(len2 - 1 - i) - 48);
			if (result.charAt(len2 - i) > 57)
			{
				result = tangible.StringFunctions.changeCharacter(result, len2 - i, result.charAt(len2 - i) - 10);
				result.charAt(len2 - i - 1)++;
			}
			}
			for (i = len1;i < len2;i++)
			{
				result = tangible.StringFunctions.changeCharacter(result, len2 - i, result.charAt(len2 - i) + num2.charAt(len2 - i - 1));
				if (result.charAt(len2 - i) > 57)
				{
						result = tangible.StringFunctions.changeCharacter(result, len2 - i, result.charAt(len2 - i) - 10);
						result.charAt(len2 - i - 1)++;
				}
			}
			for (i = 0;i < len2;i++)
			{
					   if (result.charAt(i) != '0' && result.charAt(i) != '\0')
					   {
						   break;
					   }
			}
					if (i == len2)
					{
						   System.out.print(result.charAt(1));
					}
					else
					{
							if (48 < result.charAt(i) && result.charAt(i) <= 57)
							{
						;
							}
					else
					{
						result = tangible.StringFunctions.changeCharacter(result, i, result.charAt(i) + 48);
					}
				   for (i = i;i <= len2;i++)
				   {
					   System.out.print(result.charAt(i));
				   }
					}
		}
	}
	public static int Main()
	{

		num1 = new Scanner(System.in).nextLine();
		num2 = new Scanner(System.in).nextLine();
		len1 = num1.length();
		len2 = num2.length();
		add();
		return 0;
	}
}

