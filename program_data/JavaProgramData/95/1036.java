import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		for (i = 0;i < 80;i++)
		{
			a = a.substring(0, i);
			b = b.substring(0, i);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		else
		{
			System.out.print("=");
			System.out.print("\n");
		}
		return 0;
	}
}

