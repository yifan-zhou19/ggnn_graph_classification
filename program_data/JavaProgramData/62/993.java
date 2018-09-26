import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[200]);
		final String str2 = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		char i;
		p = str1;
		q = str2;
		str1 = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (*p == ' ' && *(p - 1) == ' ') //????????
			{
				continue;
			}
			else
			{
				*q = p;
				q++; //?????????????????????????????
			}
		}
		for (i = 0;str2.charAt(i) != '\0';i++)
		{
		System.out.print(str2.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}

}
