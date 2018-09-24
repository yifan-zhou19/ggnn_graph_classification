import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	??????
	*/


	public static int Main()
	{
		String str = new String(new char[101]);
		String flag = new String(new char[101]);
		while (str = new Scanner(System.in).nextLine())
		{
			System.out.print(str);
			System.out.print("\n");
			int len;
			int num = 0;
			len = str.length();
			int i;
			int j;
			for (i = 0; i < len; i++)
			{
				flag = tangible.StringFunctions.changeCharacter(flag, i, ' ');
			}
			flag = tangible.StringFunctions.changeCharacter(flag, i, '\0');
			for (i = 0; i < len; i++)
			{
				if (str.charAt(i) == '(')
				{
					num++;
					flag = tangible.StringFunctions.changeCharacter(flag, i, '$');
				}
				if (str.charAt(i) == ')')
				{
					num--;
					if (num >= 0)
					{
						for (j = i - 1; j >= 0; j--)
						{
							if (str.charAt(j) == '(')
							{
								flag = tangible.StringFunctions.changeCharacter(flag, j, ' ');
								str = tangible.StringFunctions.changeCharacter(str, j, ' ');
								break;
							}
						}
					}
					else
					{
						flag = tangible.StringFunctions.changeCharacter(flag, i, '?');
						num++;
					}
				}
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}
}

