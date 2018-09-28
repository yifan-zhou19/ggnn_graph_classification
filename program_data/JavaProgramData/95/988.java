import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[81]); //a[],b[]?????
		String b = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') //?????
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z') //?????
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) == 0) //strcmp????
		{
			System.out.print("=");
		}
		else if (strcmp(a,b) == 1)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}
}

