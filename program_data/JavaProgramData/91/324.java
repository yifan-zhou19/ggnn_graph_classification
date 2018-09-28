import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
		String q = null;
		int len = s.length();
		char x = s.charAt(0);
		q = s.Substring(len) - 1;
		for (p = s;p < s.Substring(len) - 1;p++)
		{
			*p = (char)((int) * p + (int) * (p + 1));
		}
		for (p = s;p < s.Substring(len) - 1;p++)
		{
			System.out.print(p);
		}
		System.out.print((char)((int)(q) + (int)(x)));

		return 0;
	}

}
