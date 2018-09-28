import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str; //????str???p
		while (*p != '\0')
		{
			if (*p >= 48 && *p <= 57) //????????
			{
				System.out.print(p);
				p++;
			}
			else //?????????
			{
				System.out.print("\n");
				do
				{
					p++;
				} while ((*p < 48 || *p>57) && (*p != '\0')); //???????????????
			}
		}
		return 0;
	}
}
