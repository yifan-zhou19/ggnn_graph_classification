import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int hui(String s)
	{
		int i;
		for (i = 0;i < s.length();i++)
		{
			if (!s[i].equals(s[s.length() - 1 - i]))
			{
				return 0;
				break;
			}
		}
		if (i >= s.length())
		{
			return 1;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int len;
		String s = new String(new char[501]);
		String temp = new String(new char[501]);
		s = new Scanner(System.in).nextLine();
		for (len = 2;len <= s.length();len++)
		{
			for (i = 0;i + len - 1 < s.length();i++)
			{
				for (j = 0;j < len;j++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, j, s.charAt(i + j));
					temp = tangible.StringFunctions.changeCharacter(temp, len, '\0');
				}
				if (hui(temp) == 1)
				{
					System.out.print(temp);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

