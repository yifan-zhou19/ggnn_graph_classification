import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i + 1) != '\0')
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, j++, s.charAt(i) + s.charAt(i + 1));
			i++;
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, j++, s.charAt(i) + s.charAt(0));
		s1 = tangible.StringFunctions.changeCharacter(s1, j, '\0');
		System.out.print(s1);
		System.out.print("\n");
		return 0;
	}

}

