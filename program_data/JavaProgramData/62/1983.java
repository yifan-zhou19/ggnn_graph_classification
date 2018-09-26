import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		a = new Scanner(System.in).nextLine();
		for (p = a.Substring(1); * p != '\0'; p++) //??????
		{
			if (*p == ' ' && *(p - 1) == ' ') //??????????????????
			{
				for (q = p; * q != '\0'; q++) //?????????????
				{
					*q = (q + 1);
				}
				p--; //???????
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}
