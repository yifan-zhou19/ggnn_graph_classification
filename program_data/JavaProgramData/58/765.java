import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * h056_panduan_biaoshifu.cpp
	 * name:?????C????????
	 *  Created on: 2011-12-2
	 *      Author: zhujile
	 */
	public static int Main()
	{
		int n;
		String a = new String(new char[81]); //?????a??
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //?????
		while (n-- != 0) //??n???
		{
			a = new Scanner(System.in).nextLine(); //??????
			p = a; //??????
			if (*p != '_' && (*p > 'z' || *p < 'a') && (*p>'Z' || *p < 'A')) //???????????
			{
				System.out.print('0');
				System.out.print("\n");
				continue; //????
			}
			for (p = a.Substring(1); * p != '\0';p++) //??'\0'??
			{
				if (*p != '_' && (*p > 'z' || *p < 'a') && (*p>'9' || *p < '0') && (*p>'Z' || *p < 'A')) //??????????????
				{
					System.out.print('0');
					System.out.print("\n");
					break; //????
				}
			}
			if (*p == '\0') //?????????
			{
				System.out.print('1');
				System.out.print("\n");
			}
		}
		return 0;
	}
}

