import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int i = 1;
		int l;
		int j;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i - 1) == ' ' && str.charAt(i) == ' ')
			{
				for (j = i; j < l - 1; j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
				l--;
			}
			else
			{
				i++;
			}
		}
		for (i = 0; i < l; i++)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}
}

