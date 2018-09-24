import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String c = "";
		c = new Scanner(System.in).nextLine();
		int i = 0;
		while (true)
		{
			int m = 1;
			if (c.charAt(i) == '\0')
			{
				break;
			}
			while (c.charAt(i) == c.charAt(i + 1) || c.charAt(i) - 'a' == c.charAt(i + 1) - 'A' || c.charAt(i) - 'A' == c.charAt(i + 1) - 'a')
			{
				m++;
				i++;
			}
			if (c.charAt(i) - 'a' >= 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, 'A' + c.charAt(i) - 'a');
			}
			System.out.print('(');
			System.out.print(c.charAt(i));
			System.out.print(',');
			System.out.print(m);
			System.out.print(')');
			m = 1;
			i++;
		}
		return 0;
	}
}

