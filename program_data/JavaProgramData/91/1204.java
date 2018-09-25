import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i + 1) == '\0')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.print(b.charAt(j));
		}
		return 0;
	}
}

