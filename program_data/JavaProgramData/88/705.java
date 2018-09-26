import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * point = str;
		str = new Scanner(System.in).nextLine();
		for (;point <= str + str.length() - 1;point++)
		{
			if (*point >= '0' && *point <= '9')
			{
				while (*point >= '0' && *point <= '9')
				{
					System.out.print(point);
					point++;
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}
