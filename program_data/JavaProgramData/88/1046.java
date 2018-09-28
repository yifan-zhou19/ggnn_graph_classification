import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a; //?????????a???
		a = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (*p >= '0' && *p <= '9' && *(p + 1) >= '0' && *(p + 1) <= '9') //????????????????????
			{
			   System.out.print(p);
			}
			else if (*p >= '0' && *p <= '9' && (*(p + 1) < '0' || *(p + 1)>'9')) //??????????????????????????
			{
			   System.out.print(p);
			   System.out.print("\n");
			}
			else //?????????????
			{
			   continue;
			}
		}
		return 0;
	}

}
