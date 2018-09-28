import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);

		int i;
		int leap = 0;

		a = new Scanner(System.in).nextLine();

		b = new Scanner(System.in).nextLine();

		for (i = 0;a.charAt(i) != '\0' || b.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}

			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}

			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print('>');
				leap = 0;
				break;
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print('<');
				leap = 0;
				break;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				leap = 1;
			}
		}
		if (leap == 1)
		{
			System.out.print('=');
		}

		return 0;
	}
}

