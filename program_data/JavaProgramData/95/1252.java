import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (str1.charAt(i) >= 97 && str1.charAt(i) <= 122)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
			if (str2.charAt(i) >= 97 && str2.charAt(i) <= 122)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
			}
		}
		for (i = 0;i < 80;i++) //??????
		{
			if ((str1.charAt(i) == '\0') + (str2.charAt(i) == '\0') == 0) //????????
			{
				if (str1.charAt(i) == str2.charAt(i) || (str1.charAt(i) >= 97 && str1.charAt(i) <= 122 && str1.charAt(i) - str2.charAt(i) == 32) || (str2.charAt(i) >= 97 && str2.charAt(i) <= 122 && str2.charAt(i) - str1.charAt(i) == 32))
				{
					continue;
				}
				else
				{
					if (str1.charAt(i) < str2.charAt(i))
					{
						System.out.print('<');
						break;
					}
					else
					{
						System.out.print('>');
						break;
					}
				}
			}
			else if ((str1.charAt(i) == '\0') + (str2.charAt(i) == '\0') == 1)
			{
				if (str1.charAt(i) == '\0')
				{
					System.out.print('<');
					break;
				}
				else
				{
					System.out.print('>');
					break;
				}
			}
			else if ((str1.charAt(i) == '\0') + (str2.charAt(i) == '\0') == 2) //??????\0
			{
				System.out.print('=');
				break;
			}
		}
		 return 0;
	}
}

