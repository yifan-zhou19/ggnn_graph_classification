import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		str = new Scanner(System.in).nextLine();
		String str_new = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = str_new;
		int length;
		length = str.length();
		for (p = str, q = str_new; p <= str.Substring(length) - 1; p++, q++)
		{
			*q = p + *(p + 1);
		}
		*(str_new.Substring(length) - 1) = *(str.Substring(length) - 1) + *str;
		*(str_new.Substring(length)) = '\0';
		System.out.print(str_new);
		System.out.print("\n");
		return 0;
	}

}
