import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * palindrome substring.cpp
	 *
	 *  Created on: 2011-12-28
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String sen = new String(new char[510]);
		int j; //????
		int n;
		int k;
		int m;
		int length;
		sen = new Scanner(System.in).nextLine();
		length = sen.length();
		for (n = 1;n <= length;n++) //?????????
		{
			for (j = 0;j <= length - 1 - n;j++) //?????????
			{
				m = j;
				k = j + n;
				while (k >= m != 0 && sen.charAt(k) == sen.charAt(m)) //???????
				{
					k--;
					m++;
				}
				if (k <= m)
				{
					for (k = j;k <= j + n;k++)
					{
						System.out.print(sen.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
