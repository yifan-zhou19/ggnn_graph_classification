import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String plus1 = "";
		final String plus2 = "";
		final String out = "";
		out = tangible.StringFunctions.changeCharacter(out, 0, '0');
		plus1 = new Scanner(System.in).nextLine();
		plus2 = new Scanner(System.in).nextLine();
		int i = 0;
		int mark1 = plus1.length();
		int mark2 = plus2.length();
		int len = 0;
		int flag = 0;
		if (plus1.length() > plus2.length())
		{
			len = plus1.length();
			for (i = plus1.length() - 1; i >= mark1 - mark2; i--)
			{
				plus2 = tangible.StringFunctions.changeCharacter(plus2, i, plus2.charAt(i - mark1 + mark2));
			}
			for (i = mark1 - mark2 - 1; i >= 0; i--)
			{
				plus2 = tangible.StringFunctions.changeCharacter(plus2, i, '*');
			}
		}
		else if (plus2.length() > plus1.length())
		{
			len = plus2.length();
			for (i = plus2.length() - 1; i >= mark2 - mark1; i--)
			{
				plus1 = tangible.StringFunctions.changeCharacter(plus1, i, plus1.charAt(i - mark2 + mark1));
			}
			for (i = mark2 - mark1 - 1; i >= 0; i--)
			{
				plus1 = tangible.StringFunctions.changeCharacter(plus1, i, '*');
			}
		}
		else
		{
			len = plus1.length();
		}
		for (i = 0; i < len; i++)
		{
			if (plus1.charAt(i) == '*' || plus2.charAt(i) == '*')
			{
				out = tangible.StringFunctions.changeCharacter(out, i + 1, plus1.charAt(i) + plus2.charAt(i) - '*');
			}
			else
			{
				out = tangible.StringFunctions.changeCharacter(out, i + 1, plus1.charAt(i) + plus2.charAt(i) - '0');
			}
		}
		for (i = len; i > 0; i--)
		{
			if (out.charAt(i) > '9')
			{
				out = tangible.StringFunctions.changeCharacter(out, i, out.charAt(i) - 10);
				out.charAt(i - 1)++;
			}
		}
		for (i = 0; i <= len; i++)
		{
			if (out.charAt(i) != '0')
			{
				flag = i;
				break;
			}
		}
		if (i == len + 1)
		{
			System.out.print('0');
		}
		else
		{
			for (i = flag; i <= len; i++)
			{
				System.out.print(out.charAt(i));
			}
		}
		return 0;
	}
}

