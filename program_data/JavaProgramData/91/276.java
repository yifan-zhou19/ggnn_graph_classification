import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
		String s1 = new String(new char[110]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = s1;
		for (p = s; * p != '\0';p++)
		{
			;
		}
		int len = p - s;
		for (p1 = s1,p = s;p < s.Substring(len) - 1;p++,p1++)
		{
			*p1 = p + *(p + 1);
		}
		*p1 = p + *(p - len + 1);
		*(p1 + 1) = '\0';
		p1 = s1;
		System.out.print(p1);
		return 0;
	}
}
