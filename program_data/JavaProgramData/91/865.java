import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0,p = a; i < len - 1; i++,p++)
		{
			System.out.print((char)(*p + *(p + 1)));
		}
		System.out.print((char)(a.charAt(len - 1) + a.charAt(0)));
		System.out.print("\n");
	return 0;
	}
}
