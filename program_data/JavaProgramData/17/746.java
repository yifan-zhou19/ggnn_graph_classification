import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		while (str = new Scanner(System.in).nextLine())
		{
			int length;
		length = str.length();
		for (int i = 0;i < length;i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		for (int i = length - 1;i >= 0;i--)
		{
			if (str.charAt(i) == '(')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '$');
				for (int j = i + 1;j < length;j++)
				{
					if (str.charAt(j) == '?')
					{
						str = tangible.StringFunctions.changeCharacter(str, j, ' ');
						str = tangible.StringFunctions.changeCharacter(str, i, ' ');
						break;
					}
				}
			}
			else if (str.charAt(i) == ')')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '?');
			}
			  else
			  {
				str = tangible.StringFunctions.changeCharacter(str, i, ' ');
			  }
		}
		for (int i = 0;i < length;i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		}
		return 0;
	}
}

