import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String array = new String(new char[1000]);
		String cur = new String(new char[1000]);
		array = new Scanner(System.in).nextLine();
		int len = array.length();
		int step = 0;
		for (int i = 0; i < len; i++)
		{
			if (array.charAt(i) != ' ')
			{
				cur = tangible.StringFunctions.changeCharacter(cur, step++, array.charAt(i));
			}
			else
			{
				if (i != 0 && array.charAt(i - 1) != ' ' && array.charAt(i - 1) != '.')
				{
					cur = tangible.StringFunctions.changeCharacter(cur, step++, array.charAt(i));
				}
			}

		}
		for (int i = 0; i < step; i++)
		{
			System.out.print(cur.charAt(i));
		}
		return 0;
	}

}

