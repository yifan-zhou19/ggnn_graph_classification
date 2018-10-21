import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*         
	*/


	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		char q = a.charAt(0);
		for (; * (p + 1) != '\0'; p++)
		{
			*p = p + *(p + 1);
		}
		*p += q;
		System.out.print(a);
		return 0;
	}

}
