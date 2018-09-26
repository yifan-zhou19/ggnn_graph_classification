import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qinpengzifu.cpp
	 *?????????
	 *  Created on: 2012-12-24
	 *      Author: ??
	 */

	public static int Main()
	{
		char c; //???????
		String str = new String(new char[150]);
		String p = str;
		p = new Scanner(System.in).nextLine(); //??
		int i;
		int len;
		len = p.length();
		*(p.Substring(len)) = p; //?????
		for (i = 0;i < len;i++)
		{
			c = (p.Substring(i)) + *(p.Substring(i) + 1);
			System.out.print(c);
		}
		return 0;
	}

}
