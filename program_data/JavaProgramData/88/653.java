import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[40]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		str = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (Character.isDigit(*p))
			{
				System.out.print(p);
			}
			else
			{
				System.out.print("\n");
			}
		}
	}
}
