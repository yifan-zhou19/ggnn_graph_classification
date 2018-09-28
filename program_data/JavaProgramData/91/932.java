import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************************************************
	//*???????????? ***************************************
	//*??????? 1200012979 **************************************
	//*???2012.12.4 ************************************************
	//*****************************************************************
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a.Substring(1);
		String q = a;
		a = new Scanner(System.in).nextLine(); //??????p???????
		do //????p--??
		{
			p--;
			System.out.print((char)(*p + *++p));
		} while (*++p != '\0');
		System.out.print((char)(*--p + q));
		System.out.print("\n");
		return 0;
	}
}
