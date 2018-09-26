import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * hehe.cpp
	 *
	 *  Created on: 2012-12-11
	 *      Author:??
	 *  ???????????????????????????????????
	 */
	public static int Main()
	{
		String a = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int lena;
		int judge = 0;
		a = new Scanner(System.in).nextLine();
		p = a;
		lena = a.length();
		for (int i = 0;i < lena;i++)
		{
			if (*p == ' ' && judge == 0)
			{
				judge = 1;
			 System.out.print(p);
			} //???????????judge??
		   if (*p == ' ' && judge == 1)
		   {
			  ; //??????????
		   }
		   if (*p != ' ')
		   {
				   System.out.print(p);
				judge = 0; //????????
		   }
		   p++;
		}
		return 0;
	}

}
