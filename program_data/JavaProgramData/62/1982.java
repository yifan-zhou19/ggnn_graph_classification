import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		int length;
		input = new Scanner(System.in).nextLine();
		length = input.length();
		for (p = input.Substring(1); p < input.Substring(length); p++)
		{
			if (*p == ' ' && *(p - 1) == ' ') //??????????????????????????
			{
				for (q = p; * q != '\0'; q++)
				{
					*q = (q + 1);
				}
				p--;
			}
		}
		System.out.print(input);
		System.out.print("\n");
		return 0;
	}
}
