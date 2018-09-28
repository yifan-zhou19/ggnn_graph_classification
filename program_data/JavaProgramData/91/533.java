import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		for (i = 0, p = s1; * (s.Substring(i) + 1) != '\0'; i++)
		{
			*p = (s.Substring(i)) + *(s.Substring(i) + 1);
			p++;
		}
		*p = (s.Substring(i)) + *s;
		*++p = '\0';
		System.out.print(s1);
		return 0;
	}

}
