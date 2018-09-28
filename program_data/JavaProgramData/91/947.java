import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int i;
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		p = s;
		q = p;
		for (i = 0; i < len - 1; i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, *p + *(p + 1));
			p++;
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, len - 1, q + *p);
		for (p = s1; p < s1.Substring(len); p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}
}

