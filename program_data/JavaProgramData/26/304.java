import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		char i;
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = a;
		for (; * p1 != '\0';p1++)
		{
			if (*p1 != ' ')
			{
				System.out.print(p1);
			}
			if (*p1 == ' ')
			{
				if (*(p1 + 1) != ' ')
				{
					System.out.print(" ");
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}
