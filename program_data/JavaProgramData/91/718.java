import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????1206.cpp
	 * ??????
	 * ?????2012-12-16
	 * ???????????????
	 */



	public static int Main()
	{
		String s = new String(new char[101]); //????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		s = new Scanner(System.in).nextLine(); //?????
		for (p = s; p < s + s.length() - 1; ++p)
		{
			System.out.print((char)(*p + *(p + 1)));
		}
		System.out.print((char)(*s + *p));
		System.out.print("\n");
		return 0; //????
	}
}
