import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int i;
		int length;
		p = input;
		input = new Scanner(System.in).nextLine();
		length = input.length();
		System.out.print(input.charAt(0));
		for (i = 1; i < length; i++)
		{
		//for (p = input; p < length; p++)
			p++;
			if (*p == ' ' && *(p - 1) == ' ')
			{
					continue;
			}
			System.out.print(p);
		}
		return 0;
	}
}
