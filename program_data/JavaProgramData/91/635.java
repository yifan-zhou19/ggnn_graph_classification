import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*	???:?????
		???:1000012896 leo
		??:2010.12.17
		????:???????
		*/
	public static int Main()
	{
		String s = new String(new char[101]);
		String s_ = new String(new char[101]);
		int i;
		s = new Scanner(System.in).nextLine();
		for (i = 0; i <= s.length() - 2; i++)
		{
			s_ = tangible.StringFunctions.changeCharacter(s_, i, s.charAt(i) + s.charAt(i + 1));
		}
		s_ = tangible.StringFunctions.changeCharacter(s_, s.length() - 1, s.charAt(0) + s.charAt(s.length() - 1));
		s_ = tangible.StringFunctions.changeCharacter(s_, s.length(), '\0');
		System.out.print(s_);
		return 0;
	}

}

