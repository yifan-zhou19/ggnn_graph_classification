import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i;
		int n;
		n = a.length();
		for (i = 0; i <= n - 1; i++)
		{
			if (i == n - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
		}
		for (i = 0; i <= n - 1; i++)
		{
			System.out.print(b.charAt(i));
		}
		return 0;
	}
}

