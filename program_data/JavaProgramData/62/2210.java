import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int l;
		c = new Scanner(System.in).nextLine();
		l = c.length();
		for (int i = 0;i < l;i++)
		{
			if ((c.charAt(i) == ' ') && (c.charAt(i) == c.charAt(i + 1)))
			{
				for (int j = i;j < l - 1;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
				}
				l--;
				i--;
			}
		}
		for (int i = 0;i < l;i++)
		{
			System.out.print(c.charAt(i));
		}
		return 0;
	}

}

