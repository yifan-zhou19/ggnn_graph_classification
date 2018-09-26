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
		int i;
		int n;
		int c = 0;
		n = a.length() <= b.length()?a.length():b.length();

		for (i = 0;i <= n;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
			if (a.charAt(i) == b.charAt(i))
			{
				continue;
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print('>');
				c = 1;
				break;
			}
			else
			{
				System.out.print('<');
				c = 1;
				break;
			}
		}
		if (c == 0)
		{
			System.out.print('=');
		}




	}


}

