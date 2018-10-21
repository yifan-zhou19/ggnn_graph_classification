import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		int flag = 0; //??????????
		for (p = str; * p != '\0'; p++) //????????
		{
			if (*p == ' ' && flag == 1) //????????
			{
				 for (q = p; * q != '\0'; q++) //????????
				 {
					 *q = (q + 1);
				 }
				 *q = '\0'; //????
				 p--; //????????
			}
			else if (*p == ' ' && flag == 0) //????????
			{
					flag = 1; //??
			}
				 else //?????????
				 {
					 flag = 0;
				 }
		}
		*p = '\0'; //??
		System.out.print(str);
		return 0;
	}
}
