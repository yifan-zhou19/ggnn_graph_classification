import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[110]);
		String ch = new String(new char[110]);
		c = new Scanner(System.in).nextLine();
		int len = c.length();
		for (int i = 0; i < len - 1; i++)
		{
			ch = tangible.StringFunctions.changeCharacter(ch, i, c.charAt(i) + c.charAt(i + 1));
		}
		ch = tangible.StringFunctions.changeCharacter(ch, len - 1, c.charAt(len - 1) + c.charAt(0));
		for (int j = 0; j < len; j++)
		{
			System.out.print(ch.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

