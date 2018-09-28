import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		for (i = 0; a.charAt(i) != '\0' || b.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		for (i = 0; a.charAt(i) != '\0' && b.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				continue;
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				System.out.print("\n");
				break;
			}
			else
			{
				System.out.print("<");
				System.out.print("\n");
				break;
			}
		}
		if (a.charAt(i) == '\0' && b.charAt(i) == '\0')
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else if (a.charAt(i) == '\0' && b.charAt(i) != '\0')
		{
			System.out.print("<");
			System.out.print("\n");
		}
		else if (a.charAt(i) != '\0' && b.charAt(i) == '\0')
		{
			System.out.print(">");
			System.out.print("\n");
		}
		return 0;
	}
}

