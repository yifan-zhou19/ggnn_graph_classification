import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 12.11.10d.cpp
	 *  Created on: 2012-11-10
	 *  Author: ???
	 *  ???????
	 */
	public static int Main()
	{
		int i;
		int j;
		int k;
		int blen;
		char[][] a = new char[100][100];
		String b = new String(new char[10000]);
		b = new Scanner(System.in).nextLine();
		blen = b.length();
		for (i = 0,j = 0,k = 0;i < blen;++i)
		{
			if (b.charAt(i) == ' ')
			{
				++j;
				k = 0;
				continue;
			}
			else
			{
				a[j][k] = b.charAt(i);
				++k;
			}
		}
		System.out.print(a[j]);
		for (i = j - 1;i >= 0;--i)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}
}
