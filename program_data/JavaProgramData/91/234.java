import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		String b = new String(new char[110]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = b;
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,'\0',(Character.SIZE / Byte.SIZE));
		p = a;
		p++;
		while (*p != '\0')
		{
			*q = p + *(p - 1);
			p++;
			q++;
		}
		*q = a + *(p - 1);
		q = b;
		while (*q != '\0')
		{
			System.out.print(q);
			q++;
		}
		return 0;
	}

}
