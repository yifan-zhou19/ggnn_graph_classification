import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************************
	//?????????
	//??????
	//?????2010.12.10
	//??????????????
	//********************************************
	public static int Main()
	{
		String a = new String(new char[31]); //?????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine(); //????????
		for (p = a; * p != '\0',p < a.Substring(31); p++)
		{
			if (*p <= '9' && *p >= '0')
			{
				System.out.print(p);
			}
			else if (*(p - 1) <= '9' && *(p - 1) >= '0')
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
