import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	 * ??????�
	 * ???1000012844
	 * ??????????
	 **/


	public static int Main()
	{
		String s1 = new String(new char[101]);
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr1 = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr2 = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * targetPtr = null;
		ptr1 = s;
		ptr2 = s.Substring(1);
		targetPtr = s1;
		int lenth = s.length();

		while (ptr2 != s.Substring(lenth))
		{
			*targetPtr++= *(ptr1++) + *(ptr2++);
		}
		*targetPtr++= *s + *ptr1;
		*targetPtr = 0;
		System.out.print(s1);
	}
}
