import java.util.*;

package <missing>;

public class GlobalMembers
{
	/************************************
	*??????????    			*
	*?????? 1200012921			*
	*???2012-12-5					*
	*************************************/

	public static int Main()
	{
		String s = new String(new char[101]); //p??s?q??s1
		String s1 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		s = new Scanner(System.in).nextLine();
		int len = s.length(); //s??
		for (p = s, q = s1; p < s.Substring(len) - 1; p++, q++) //asc???
		{
			*q = p + *(p + 1);
		}
		*q = p + s.charAt(0); //??????
		for (q = s1; q < s1.Substring(len); q++) //??
		{
			System.out.print(q);
		}
		return 0;
	}
}
