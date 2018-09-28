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
		for (p = a,q = a.Substring(1); * p != '\0'; p++,q++) //????????????????
		{
			if (*p == ' ' && *q == ' ') //?????????
			{
				continue;
			}
			else //????????????
			{
				System.out.print(p);
			}
		}
		return 0;
	}
}
