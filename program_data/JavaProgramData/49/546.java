import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * fuxi001_huiwen_zichuan.cpp
	 * name:????
	 *  Created on: 2011-12-21
	 *      Author: zhujile
	 */
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void check(char * p, tangible.RefObject<String> q)
	{
		int flag = 1; //??
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * st = p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * en = q.argValue;
		for (;st < en;st++,en--) //??????
		{
			if (*st == *en)
			{
				continue;
			}
			else
			{
				flag = 0;
				break;
			} //???????
		}
		if (flag == 1) //?????????
		{
			while (p <= q.argValue) //??
			{
				System.out.print(p);
				p = p.Substring(1);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		String a = new String(new char[501]);
		a = new Scanner(System.in).nextLine(); //??
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int length;
		int k;
		length = a.length(); //????
		for (k = 1;k < length;k++) //??????
		{
			p = a;
			q = a.Substring(k);
			for (;q < a.Substring(length);p++,q++)
			{
				if (*p == *q) //???????
				{
				tangible.RefObject<String> tempRef_q = new tangible.RefObject<String>(q);
					check(p, tempRef_q); //??
					q = tempRef_q.argValue;
				}
			}
		}
		return 0;
	}

}

