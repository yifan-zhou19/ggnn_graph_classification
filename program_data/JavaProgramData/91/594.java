import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		for (i = 0; i < l - 1; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, l - 1, a.charAt(l - 1) + a.charAt(0));
		for (i = 0; i < l - 1; i++)
		{
			System.out.print(b.charAt(i));
		}
		System.out.print(b.charAt(l - 1));
		System.out.print("\n");
		return 0;


	}


}

