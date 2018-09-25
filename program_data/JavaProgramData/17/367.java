import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int match(tangible.RefObject<String> a) //?????????????????????????????
	{
		int i = 1;
		while (a.argValue.charAt(i) != '\0')
		{
			if (a.argValue.charAt(i) == ')') //???????
			{
				a.argValue.charAt(i) = ' ';
				a.argValue.charAt(0) = ' ';
				return i;
			}
			else if (a.argValue.charAt(i) == '(') //?????????
			{
				a.argValue.charAt(i) = '$';
				i += match(a.argValue.Substring(i));
			}
			else
			{
				a.argValue.charAt(i) = ' '; //?????????
			}
			i++;
		}
		return i - 1;
	}
	public static int Main()
	{
		while (cin.peek() != EOF)
		{
			String ch = new String(new char[110]);
			ch = new Scanner(System.in).nextLine();
			System.out.print(ch);
			System.out.print("\n");
			int i = 0;
			while (ch.charAt(i) != '\0')
			{
				if (ch.charAt(i) == '(')
				{
					ch = tangible.StringFunctions.changeCharacter(ch, i, '$');
					i += match(ch.Substring(i));
				}
				else if (ch.charAt(i) == ')')
				{
					ch = tangible.StringFunctions.changeCharacter(ch, i, '?'); //??????????????�?�
				}
				else
				{
					ch = tangible.StringFunctions.changeCharacter(ch, i, ' ');
				}
				i++;
			}
			System.out.print(ch);
			System.out.print("\n");
		}
		return 0;
	}
}

