import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[105]);
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		char b = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		while (*(p + 1))
		{
			System.out.print((char)(*p + *(p + 1)));
			p++;
		}
		System.out.print((char)(*p + b));
		return 0;
	}

}
