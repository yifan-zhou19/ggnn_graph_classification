import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		int i = 0;
		int j = 0;
		while (str = new Scanner(System.in).nextLine())
		{
			for (i = 0;str.charAt(i) != '\0';i++) //???????
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;str.charAt(i) != '\0';++i) //????????????????????????????????????
			{
				if (str.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;--j)
					{
						if (str.charAt(j) == '(')
						{
							str = tangible.StringFunctions.changeCharacter(str, i, str[j] = ' ');
							break;
						}
					}
				}
			}
			for (i = 0;i < str.length();++i) //??????????????
			{
				if (str.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (str.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

