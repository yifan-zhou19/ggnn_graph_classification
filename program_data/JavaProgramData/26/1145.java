import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);

		str = new Scanner(System.in).nextLine();
		for (int i = 0; ; i++)
		{
			if (str.charAt(i) == ' ')
			{
				if (str.charAt(i + 1) == ' ')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '0');
				}
			}
			if (str.charAt(i) == '\0')
			{
				break;
			}
		}
		for (int i = 0; ; i++)
		{
			if (str.charAt(i) == '\0')
			{
				break;
			}
			if (str.charAt(i) != '0')
			{
				System.out.print(str.charAt(i));
			}
		}
		return 0;
	}
}

