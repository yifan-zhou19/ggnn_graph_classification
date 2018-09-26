import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qipengyuanshui.cpp
	 *?????
	 *  Created on: 2012-12-12
	 *      Author: ???
	 */
	public static int Main()
	{
		String str1 = new String(new char[105]); //??????????
		String str2 = new String(new char[105]);
		int i;
		int j = 0;
		int k;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p; //????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		str1 = new Scanner(System.in).nextLine(); //????????????
		len = str1.length();
		p = str1;
		q = str2;
		for (p = str1;p < str1.Substring(len) - 1;p++)
		{
			*q = p + *(p + 1); //?????????len-1?
			q++;
		}
		*q = str1.charAt(len - 1) + str1.charAt(0); //?????
		for (q = str2;q < str2.Substring(len);q++)
		{
			System.out.print(q);
		}
		return 0;
	}

}
