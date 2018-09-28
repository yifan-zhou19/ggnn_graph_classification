import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * homework1106.cpp
	 *
	 *  Created on: 2012-11-5
	 *      Author: wangyinzhi
	 */

	public static int Main()
	{
		String a = new String(new char[10000]);
		char[][] word = new char[100][100];
		String t = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int k = 0;
		int i = 0;
		int j = 0;
		for (i = 0;i <= a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
				word[k][j++] = a.charAt(i);
			}
			else
			{
				word[k][j] = '\0';
				j = 0;
				k = k + 1;
			}
		} //????????word????

		int n = k + 1;
		for (i = 0;i <= n / 2 - 1;i++)
		{
			t = word[i];
			word[i] = word[k - i];
			word[k - i] = t; //???????
		}
			for (i = 0;i <= n - 1;i++)
			{
				if (i == 0)
				{
					System.out.print(word[i]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(word[i]);
				}
			}
		return 0;
	}
}
