import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String str1 = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str.charAt(1);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = str1;
		while (*p != '\0')
		{
			*q = p + *(p - 1);
			p++;
			q++;
		}
		*q = str.charAt(0) + *(p - 1);
		*(q + 1) = '\0';
		System.out.print(str1);
		System.out.print("\n");

		return 0;
	}
}
