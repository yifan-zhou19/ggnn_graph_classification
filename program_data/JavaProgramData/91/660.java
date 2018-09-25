import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *  Name:homework.cpp
	 *  Created on: 2012-12-12
	 *  Author: Meng Li
	 *  Function:???????
	 */


	public static int Main()
	{ //???
		String string = new String(new char[101]); //?????????
		String final = new String(new char[101]);
		String = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * init; //????????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * result;
		result = final;
		int length = String.length();
		for (init = String;init < (string.Substring(length) - 1);init++,result++)
		{ //???????????????????????????
			*result = (init) + *(init + 1);
		}
		*result = init + *(init - length + 1); //??????????????
		for (int i = 0;i < length;i++)
		{
			System.out.print(final.charAt(i));
		}
		return 0;
	}

}
