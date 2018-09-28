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
		for (i = 0;i < 80;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')? (a.charAt(i) + 32):a.charAt(i));
		}
		for (i = 0;i < 80;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')? (b.charAt(i) + 32):b.charAt(i));
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else if (strcmp(a,b) == 1)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else
		{
			System.out.print("<");
			System.out.print("\n");
		}
		return 0;
	}
}

