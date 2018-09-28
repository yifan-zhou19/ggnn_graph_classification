import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *  Name:andian.cpp
	 *
	 *  Created on: 2012-11-05
	 *  Author: ??
	 *  Function?????
	 */


	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int length;
		int flag;
		a = new Scanner(System.in).nextLine();
		length = a.length();
		flag = length;
		for (i = length - 1;i >= 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
				if (flag != length)
				{
					System.out.print(' ');
				}
				for (j = i + 1;j <= flag - 1;j++)
				{
					System.out.print(a.charAt(j));
				}
				flag = i;
			}
			if (i == 0)
			{
				if (flag != length)
				{
					System.out.print(' ');
				}
				for (j = 0;j <= flag - 1;j++)
				{
					System.out.print(a.charAt(j));
				}
			}
		}
		return 0;
	}


}
