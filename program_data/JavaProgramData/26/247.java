import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = b;
		for (; * p != '\0';)
		{
		if (*p == ' ' && *(p + 1) != ' ')
		{
			*q = ' ';
			q++;
			p++;
		}
		else if (*p == ' ' && *(++p) == ' ')
		{
		}
		else
		{
		*q++=*p++;
		}
		}
	*q = '\0';
	System.out.print(b);
	return 0;
	}

}
