import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
		for (int i = 0 ; i < (length - 1) ; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			System.out.print(b.charAt(i));
		}
		System.out.print((char)(a.charAt(length - 1) + a.charAt(0)));
		return 0;
	}

}

