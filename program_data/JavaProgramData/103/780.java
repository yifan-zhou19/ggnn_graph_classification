import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		int i;
		int j;
		int count = 1;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0; i <= a.length(); i++)
		{
			if (a.charAt(i) > 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('a' - 'A'));
			}
			if (i == 0)
			{
				continue;
			}
			if (a.charAt(i) == a.charAt(i - 1))
			{
				count++;
			}
			else
			{
				System.out.print("(");
				System.out.print(a.charAt(i - 1));
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				count = 1;
			}
		}
		return 0;
	}

}

