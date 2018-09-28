import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		String p = null;
		String q = null;
		s = new Scanner(System.in).nextLine();
		int i;
		for (i = 0; i < s.length() - 1; i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
			System.out.print(s1.charAt(i));
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(0));
		System.out.print(s1.charAt(i));




		//for (p = s, q = s1; p <= s - 1; p++, q++)
		//	*q = *p + *(p + 1);
	//	*q = *p + s[0];
	//	cout << s1 << endl;
		return 0;
	}
}

