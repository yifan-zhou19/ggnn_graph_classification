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
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int len = a.length();
		p2 = b;
		for (p1 = a; p1 <= a.Substring(len) - 1; p1++)
		{
			if (* p1 != ' ')
			{
				* (p2++) = * p1;
			}
			else if (* p1 == ' ' && * (p1 + 1) != ' ')
			{
				* (p2++) = ' ';
			}
		}
		* p2 = '\0';
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}
