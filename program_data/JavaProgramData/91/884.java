import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[150]);
		char x;
		str = new Scanner(System.in).nextLine();
		int len = str.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		for (; p < str.charAt(len - 1); p++)
		{
			x = p + *(p + 1);
			System.out.print(x);
		}
		x = str.charAt(len - 1) + str.charAt(0);
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}
}
