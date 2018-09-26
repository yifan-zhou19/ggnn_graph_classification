import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			if ((a.charAt(i) >= 97) && (a.charAt(i) <= 122))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < 100;i++)
		{
			if ((b.charAt(i) >= 97) && (b.charAt(i) <= 122))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print('=');
		}
		else if (strcmp(a,b) > 0)
		{
			System.out.print('>');
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print('<');
		}
		return 0;
	}
}

