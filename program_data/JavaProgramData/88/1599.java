import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[31]);
		String str2 = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		str1 = new Scanner(System.in).nextLine();
		int flag = 0;
		for (p1 = str1, p2 = str2; * p1 != '\0'; p1++,p2++)
		{
			*p2 = p1;
			if (*p1 - '0' < 0 || *p1 - '0' > 9)
			{
				flag++;
				if (flag >= 2)
				{
					p2--;
				}
			}
			else
			{
				flag = 0;
			}
		}
		*p2 = '\0';
		for (p2 = str2; * p2 != '\0'; p2++)
		{
			if (*p2 - '0' >= 0 && *p2 - '0' <= 9)
			{
				System.out.print(p2);
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}



}
