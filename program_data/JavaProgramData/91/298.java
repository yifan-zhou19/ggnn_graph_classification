import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[202]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		p = new Scanner(System.in).nextLine();
		while (*(p + 1) != '\0')
		{
			System.out.print((char)((int) * p + (int) * (p + 1)));
			p++;
		}
		System.out.print((char)((int) * p + (int)a.charAt(0)));
		return 0;
	}










}
