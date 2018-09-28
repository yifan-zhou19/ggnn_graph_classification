import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * judgement.cpp
	 *
	 *  Created on: 2011-12-2
	 *      Author: 11095
	 */

	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String str = new String(new char[100]);
		for (i = 1;i <= n;i++)
		{
			str = new Scanner(System.in).nextLine();
			int ans = 1;
			int i = 0;
			if (str.charAt(0) >= '0' && str.charAt(0) <= '9') //????
			{
				ans = 0;
				System.out.print(ans);
				System.out.print("\n");
				continue;
			}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = str;
			for (p = str;i < str.length();i++,p++)
			{
				if (*p >= '0' && *p <= '9' || *p >= 'a' && *p <= 'z' || *p >= 'A' && *p <= 'Z' || *p == '_') //??????
				{
					continue;
				}
				else
				{
					ans = 0;
					break;
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}

	}

}

