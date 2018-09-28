import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String str = new String(new char[101]);
		final String c = "\0";
		str = new Scanner(System.in).nextLine();
		for (i = 0;i <= str.length();i++)
		{
			if (!(str.charAt(i) == ' ' && str.charAt(i + 1) == ' '))
			{
				c = tangible.StringFunctions.changeCharacter(c, j, str.charAt(i));
				j++;
			}
		}
		System.out.print(c);
		return 0;
	}
}

