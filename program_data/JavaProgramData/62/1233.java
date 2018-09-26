import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */


	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int p = 0;
		int len = a.length();
		for (int i = 0; i < len; i++)
		{
			if (*(a.Substring(i)) != ' ')
			{
				p = 0;
			}
			else if (p == 1)
			{
				for (int j = i; j < len - 1; j++)
				{
					*(a.Substring(j)) = *(a.Substring(j) + 1);
				}
				len--;
				i--;
			}
			else
			{
				p = 1;
			}
		}
		*(a.Substring(len)) = '\0';
		System.out.print(a);
	}
}
