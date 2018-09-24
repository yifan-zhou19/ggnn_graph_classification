import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[102]);
		String str2 = new String(new char[102]);
		int i;
		int j;
		while (str1 = new Scanner(System.in).nextLine())
		{
			str2 = str1;
			int len = str1.length();
			for (i = 0; i < len; i++)
			{
				if (str2.charAt(i) != '(' && str2.charAt(i) != ')')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, ' ');
				}
				else
				{
					if (str2.charAt(i) == ')')
					{
						for (j = i; j >= 0; j--)
						{
							if (str2.charAt(j) == '(')
							{
								str2 = tangible.StringFunctions.changeCharacter(str2, j, ' ');
								str2 = tangible.StringFunctions.changeCharacter(str2, i, ' ');
								break;
							}
						}
					}
				}
			}
			for (i = 0; i < len; i++)
			{
				if (str2.charAt(i) == '(')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, '$');
				}
				if (str2.charAt(i) == ')')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, '?');
				}
			}
			System.out.print(str1);
			System.out.print("\n");
			System.out.print(str2);
			System.out.print("\n");
		}
		return 0;
	}
}

