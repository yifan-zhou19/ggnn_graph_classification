import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = s1;
		s = new Scanner(System.in).nextLine();
		for (; * (p + 1) != 0;p++,p1++)
		{
			*p1 = p + *(p + 1);
		}
		*p1++=*p + *s;
		*p1 = 0;
		System.out.print(s1);
	}
}
