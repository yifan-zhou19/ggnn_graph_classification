import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		int count = 0;
		int n;
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (j = 0, i = 0; i < len; i++)
		{
			if ((a.charAt(i) != ' ') || ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' ')))
			{
					a = tangible.StringFunctions.changeCharacter(a, j++, a.charAt(i));
			}
		}
			n = j;
		for (j = 0; j < n; j++)
		{
		System.out.print(a.charAt(j));
		}
			return 0;
	}

}

