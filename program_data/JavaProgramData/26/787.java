import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a = input;
		int i;
		a = new Scanner(System.in).nextLine();
		while (*a != '\0')
		{
			if (*(a - 1) == ' ' && *a == ' ')
			{
				a++;
			}
			else
			{
				System.out.print(a);
				a++;
			}
		}
		return 0;
	}
}
