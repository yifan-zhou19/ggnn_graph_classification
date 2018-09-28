import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*         ??????
	*/


	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		a = new Scanner(System.in).nextLine();
		for (p = a,q = a; * q != '\0';q++) //????????????????????????????????
		{
			if (*q == ' ' && *(q + 1) == ' ') //?????????
			{
				continue;
			}
			else //??????????????
			{
				*p++= *q;
			}
		}
		q = p - 1; //?????????
		for (p = a; p <= q; p++)
		{
			 System.out.print(p);
		}
		return 0;
	}
}
