import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (int i = 0;i < b.length();i++)
		{
				if (b.charAt(i) >= 97)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
				}
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		else if (strcmp(a,b) > 0)
		{
			System.out.print(">");
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

