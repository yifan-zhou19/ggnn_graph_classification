import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int length = s.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
		for (int i = 1;i < length;i++)
		{
			System.out.print((char)(*p + *(p + 1)));
			p++;
		}
		System.out.print((char)(*p + *(p - length + 1)));
		System.out.print("\n");
		return 0;
	}

}
