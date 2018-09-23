import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String exp = new String(new char[10]);
		char t;
		int i;
		int j;
		exp = new Scanner(System.in).nextLine();
		for (i = 0,j = exp.length() - 1;i < j;i++, j--)
		{
			t = exp.charAt(i);
			exp = tangible.StringFunctions.changeCharacter(exp, i, exp.charAt(j));
			exp = tangible.StringFunctions.changeCharacter(exp, j, t);
		}
		for (i = 0;i < exp.length();i++)
		{
			System.out.print(exp.charAt(i));
		}
		return 0;
	}
}

