import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		char f = a.charAt(0);
		int i = 0;
		while (a.charAt(i + 1) != null)
		{
			a = tangible.StringFunctions.changeCharacter(a, i++, a.charAt(i) + a.charAt(i + 1));
		}
		a.charAt(i) += f;
		System.out.print(a);

		return 0;
	}
}

