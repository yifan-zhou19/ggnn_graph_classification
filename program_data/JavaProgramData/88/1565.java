import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	@file 1000012837_3.cpp
	@date 20101208
	@author ???
	@description ????
	*/
	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int l;
		int flag = 0;
		str = new Scanner(System.in).nextLine(); //?????
		l = str.length(); //l??????
		for (p = str; p < str.Substring(l); p++) //p????????????????????
		{
			if (*p >= '0' && *p <= '9') //????????????1
			{
				flag = 1;
				System.out.print(p);
			}
			else
			{
				if (flag == 1) //?????????????????????0
				{
					System.out.print("\n");
					flag = 0;
				}
			}
		}
		return 0;
	}
}
