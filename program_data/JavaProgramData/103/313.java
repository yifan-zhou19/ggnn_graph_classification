import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		char tep;
		for (i = 0;a.charAt(i);i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		}
			for (i = 0;a.charAt(i);)
			{
			tep = a.charAt(i);
			j = 0;
			while (a.charAt(i) == tep)
			{
				j++;
				i++;
			}

			System.out.print("(");
			System.out.print(tep);
			System.out.print(",");
			System.out.print(j);
			System.out.print(")");
			}
		return 0;
	}

}

