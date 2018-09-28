import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		a = tangible.StringFunctions.changeCharacter(a, l, a.charAt(0));
		String b = new String(new char[1000]);
		for (i = 0;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		for (i = 0;i < l;i++)
		{
			System.out.print(b.charAt(i));
		}
		return 0;
	}

}

