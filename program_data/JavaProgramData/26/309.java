import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			}
			if (a.charAt(i - 1) != ' ' && a.charAt(i) == ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
			}

			if (a.charAt(i - 1) == ' ' && a.charAt(i) == ' ')
			{
				continue;
			}
			j++;

		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		for (i = 0; b.charAt(i) != '\0'; i++)
		{
			System.out.print(b.charAt(i));
		}


		return 0;
	}
}

