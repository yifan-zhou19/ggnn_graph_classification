import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[201]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c;
		char temp;
		c = new Scanner(System.in).nextLine();
		temp = c;
		while (*p != null) //?????????/0
		{
			*p += *(p + 1);
			p++;
		}
		*(p - 1) += temp; //????????
		System.out.print(c);
		System.out.print("\n");
		return 0;
	}
}
