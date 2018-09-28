import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int n;
		String str = new String(new char[1000001]);
		String s = new String(new char[1000001]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(i));
				j++;
			}
			else if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(i));
				j++;
			}
			else
			{
				continue;
			}
		}
			  System.out.print(s);
		return 0;
	}

}

