import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *????friend.cpp
	 *??????
	 *?????2012-12-13
	 *??????????
	 */



	public static int Main()
	{
		int n;
		String s = new String(new char[102]); // s??????p?????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
		p = new Scanner(System.in).nextLine(); // ??
		n = p.length(); // ??
		*(p + n) = *p; // ????????
		for (;p < s.Substring(n);p++)
		{
			System.out.print((char)(*p + *(p + 1)));
		}
		System.out.print("\n");
		return 0;
	}

}
