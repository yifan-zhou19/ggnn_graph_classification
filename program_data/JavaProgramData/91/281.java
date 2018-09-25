import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		for (p = a,q = b; * p != '\0';p++,q++)
		{
			if (*(p + 1) != '\0')
			{
				*q = (char)(*p + *(p + 1));
			}
			else
			{
				*q = (char)(*p + a.charAt(0));
			}
		}
		for (q = b,p = a; * p != '\0';p++,q++)
		{
			System.out.print(q);
		}
		System.out.print("\n");
		return 0;
	}

}
