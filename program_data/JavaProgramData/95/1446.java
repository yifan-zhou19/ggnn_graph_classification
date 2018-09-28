import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************
	//?????????ASCII?
	//???2013.11.16
	//**********************************
	public static int Main()
	{
		int i = 0;
		int j = 0;
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (65 <= a.charAt(i) && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;i < b.length();i++)
		{
			if (65 <= b.charAt(i) && b.charAt(i) <= 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else if (strcmp(a,b) > 0)
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

