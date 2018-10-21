import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = b;
		a = new Scanner(System.in).nextLine();
		while (*(p + 1) != '\0')
		{
			*(q++) = *p + *(p + 1);
			p++;
		}
		*q = a.charAt(0) + *p;
		*(q + 1) = '\0';
		q = b;
		while (*q != '\0')
		{
			System.out.print((q++));
		}
		return 0;
	}
}
