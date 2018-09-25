import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str1 = new String(new char[81]);
	public static String str2 = new String(new char[81]);
	public static int Main()
	{

	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	int i;

	if (str1.length() > str2.length())
	{
		System.out.print(">");
	}
	else if (str1.length() < str2.length())
	{
			System.out.print("<");
	}
		else
		{
			for (i = 0; i <= str1.length() - 1; i++)
			{
				if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
				}
				if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
				}
				if (str1.charAt(i) > str2.charAt(i))
				{
					System.out.print(">");
					break;
				}
				else
				{
					if (str1.charAt(i) < str2.charAt(i))
					{
						System.out.print("<");
						break;
					}
				}
			}
			if (i == str1.length())
			{
				System.out.print("=");
			}
		}
	}



}

