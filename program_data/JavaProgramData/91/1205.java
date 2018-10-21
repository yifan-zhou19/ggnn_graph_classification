import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, (char)((int)s.charAt(i) + (int)s.charAt(i + 1)));
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, i - 1, (char)((int)s1.charAt(i - 1) + (int)s.charAt(0)));
		s1 = tangible.StringFunctions.changeCharacter(s1, i, '\0');
		System.out.print(s1);
		System.out.print("\n");

		return 0;
	}
}

