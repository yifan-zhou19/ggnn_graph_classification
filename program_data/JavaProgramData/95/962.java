import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		i = 0;
		while (a.charAt(i) != '\0')
		{
				if ((a.charAt(i) >= 65) && (a.charAt(i) <= 90))
				{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
				}
		i++;
		}
		i = 0;
		while (b.charAt(i) != '\0')
		{
				if ((b.charAt(i) >= 65) && (b.charAt(i) <= 90))
				{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
				}
		i++;
		}
		i = strcmp(a,b);
		if (i == 0)
		{
			System.out.print('=');
		}
		if (i > 0)
		{
			System.out.print('>');
		}
		if (i < 0)
		{
			System.out.print('<');
		}

		return 0;
	}
}

